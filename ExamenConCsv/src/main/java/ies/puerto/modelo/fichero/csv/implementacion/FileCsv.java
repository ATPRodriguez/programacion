package ies.puerto.modelo.fichero.csv.implementacion;

import ies.puerto.modelo.entity.Alimento;
import ies.puerto.modelo.entity.Aparato;
import ies.puerto.modelo.entity.Articulo;
import ies.puerto.modelo.entity.CuidadoPersonal;
import ies.puerto.modelo.fichero.IFileInterface;
import ies.puerto.modelo.fichero.abstractas.FicheroAbstract;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends FicheroAbstract implements IFileInterface {

    public FileCsv() {
        FICHERO_ALIMENTOS = "src/main/resources/alimentos.csv";
        FICHERO_APARATOS = "src/main/resources/aparatos.csv";
        FICHERO_SOUVENIRS = "src/main/resources/souvenirs.csv";
        FICHERO_CUIDADO_PERSONAL = "src/main/resources/cuidado-personal.csv";

    }

    public List<Articulo> obtenerAlimentos(){
        return lectura(FICHERO_ALIMENTOS,"alimento");
    }

    public List<Articulo> obtenerAparatos(){
        return lectura(FICHERO_APARATOS,"aparato");
    }

    public List<Articulo> obtenerSouvenirs(){
        return lectura(FICHERO_SOUVENIRS,"souvernir");
    }

    public List<Articulo> obtenerCuidados(){
        return lectura(FICHERO_CUIDADO_PERSONAL,"cuidado");
    }

    @Override
    public List<Articulo> lectura(String path, String articulo) {
        List<Articulo> articulos = new ArrayList<>();
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i>0) {
                        String[] arrayElemento = linea.split(",");
                        switch (articulo) {
                            case "alimento":
                                articulos.add(splitToAlimento(arrayElemento));
                                break;
                            case "cuidado":
                                articulos.add(splitToCuidadoPersonal(arrayElemento));
                                break;
                            default:
                                articulos.add(splitToDefault(arrayElemento)) ;
                                break;//Mostrar error;
                        }
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }

    @Override
    public boolean escritura(String path, String contenido) {
        return almacenarEnFichero(path, contenido);
    }

    private Alimento splitToAlimento(String[] splitArray){
        Alimento alimento = new Alimento(splitArray[3],
                splitArray[0], Float.parseFloat(splitArray[1]),
                splitArray[4], splitArray[2]);
        return alimento;
    }
    private Aparato splitToDefault(String[] splitArray) {
        Aparato aparato = new Aparato(splitArray[3],
                splitArray[0], Float.parseFloat(splitArray[1]), splitArray[2]);
        return aparato;
    }
    private CuidadoPersonal splitToCuidadoPersonal(String[] splitArray) {
        CuidadoPersonal cuidadoPersonal = new CuidadoPersonal(splitArray[3],
                splitArray[0], Float.parseFloat(splitArray[1]),
                splitArray[2], Integer.parseInt(splitArray[4]));
        return cuidadoPersonal;
    }

    public boolean actualizarAlimentosCsv () {
        String mensaje = "";
        for (Articulo alimentoCsv : obtenerAlimentos()) {
            mensaje += alimentoCsv.toCsv() + "\n";
        }
        return escritura(FICHERO_ALIMENTOS, mensaje);
    }
    public boolean contieneAlimento (Alimento alimento) {
        return obtenerAlimentos().contains(alimento);
    }
    public boolean addAlimento (Alimento alimento) {
        if (contieneAlimento(alimento)) {
            return true;
        }
        List<Articulo> alimentos = obtenerAlimentos();
        alimentos.add(alimento);
        return actualizarAlimentosCsv();
    }

    public boolean actualizarAlimento (Alimento alimento) {
        if (!contieneAlimento(alimento)) {
            return false;
        }
        List<Articulo> alimentos = obtenerAlimentos();
        int posicion = alimentos.indexOf(alimento);
        alimentos.remove(alimento);
        alimentos.add(posicion, alimento);
        return actualizarAlimentosCsv();
    }

    public boolean removeAlimento (Alimento alimento) {
        if (!contieneAlimento(alimento)) {
            return true;
        }
        List<Articulo> alimentos = obtenerAlimentos();
        alimentos.remove(alimento);
        return actualizarAlimentosCsv();
    }

    public boolean contieneAparato (Aparato aparato) {
        return obtenerAparatos().contains(aparato);
    }

    public boolean addAparato (Aparato aparato) {
        if (contieneAparato(aparato)) {
            return true;
        }
        List<Articulo> aparatos = obtenerAparatos();
        aparatos.add(aparato);
        String mensaje = "";
        for (Articulo aparatoCsv : obtenerAparatos()) {
            mensaje += aparatoCsv.toCsv() + "\n";
        }
        return escritura(FICHERO_APARATOS, mensaje);
    }

    public boolean removeAparato (Aparato aparato) {
        if (!contieneAparato(aparato)) {
            return true;
        }
        List<Articulo> aparatos = obtenerAparatos();
        aparatos.remove(aparato);
        String mensaje = "";
        for (Articulo aparatoCsv : obtenerAparatos()) {
            mensaje += aparatoCsv.toCsv() + "\n";
        }
        return escritura(FICHERO_APARATOS, mensaje);
    }

    public boolean contieneCuidadoPersonal (CuidadoPersonal cuidadoPersonal) {
        return obtenerCuidados().contains(cuidadoPersonal);
    }

    public boolean addCuidadoPersonal (CuidadoPersonal cuidadoPersonal) {
        if (contieneCuidadoPersonal(cuidadoPersonal)) {
            return true;
        }
        List<Articulo> cuidados = obtenerCuidados();
        cuidados.add(cuidadoPersonal);
        String mensaje = "";
        for (Articulo cuidadoPersonalCsv : obtenerCuidados()) {
            mensaje += cuidadoPersonalCsv.toCsv() + "\n";
        }
        return true;
    }
}
