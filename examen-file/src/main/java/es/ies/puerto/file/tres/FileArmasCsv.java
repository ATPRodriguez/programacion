package es.ies.puerto.file.tres;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileArmasCsv {
    String path = "src/main/resources/tres.csv";
    List<Arma> armas;

    public List<Arma> obtenerArmas() {
        armas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(Arma.DELIMITADOR);
                Arma arma = new Arma(datos[0],datos[1],datos[2],datos[3],Integer.parseInt(datos[4]));
                armas.add(arma);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return armas;
    }
    public Arma obtenerArma(Arma arma) {
        if (!armas.contains(arma)) {
            return null;
        }
        int posicion = armas.indexOf(arma);
        return armas.get(posicion);
    }
    public void addArma(Arma arma) {
        if (armas.contains(arma)) {
            return;
        }
        armas.add(arma);
        cargarFichero(armas);
    }
    public void deleteArma(Arma arma) {
        if (armas.remove(arma)) {
            cargarFichero(armas);
        }
    }
    public void updateArma(Arma arma) {
        if (!armas.contains(arma)) {
            return;
        }
        int posicion = armas.indexOf(arma);
        armas.set(posicion,arma);
        cargarFichero(armas);
    }

    public void cargarFichero (List<Arma> armas) {
        try (FileWriter writer = new FileWriter(path)) {
            for (Arma arma : armas) {
                writer.write((arma.toCsv()) + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
