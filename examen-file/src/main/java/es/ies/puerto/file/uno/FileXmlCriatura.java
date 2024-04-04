package es.ies.puerto.file.uno;

import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class FileXmlCriatura {
    String path = "src/main/resources/uno.xml";
    List<Criatura> criaturas;

    public List<Criatura> obtenerCriaturas() {
        Persister serializer = new Persister();

        try {
            File file = new File(path);
            CriaturaList criaturaList = serializer.read(CriaturaList.class, file);
            criaturas = criaturaList.getListaCriaturas();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return criaturas;
    }
    public Criatura obtener(Criatura criatura) {
        if (!criaturas.contains(criatura)) {
            return null;
        }
        int posicion = criaturas.indexOf(criatura);
        return criaturas.get(posicion);
    }
    public void addCriatura(Criatura criatura) {
        if (criaturas.contains(criatura)) {
            return;
        }
        criaturas.add(criatura);
        cargarFichero(criaturas);
    }
    public void deleteCriatura(Criatura criatura) {
        if (criaturas.remove(criatura)) {
            cargarFichero(criaturas);
        }
    }
    public void updateCriatura(Criatura criatura) {
        if (!criaturas.contains(criatura)) {
            return;
        }
        int posicion = criaturas.indexOf(criatura);
        criaturas.set(posicion, criatura);
        cargarFichero(criaturas);
    }

    public void cargarFichero (List<Criatura> criaturas) {
        CriaturaList criaturaList = new CriaturaList(criaturas);
        Persister serializer = new Persister();
        try {
            serializer.write(criaturaList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
