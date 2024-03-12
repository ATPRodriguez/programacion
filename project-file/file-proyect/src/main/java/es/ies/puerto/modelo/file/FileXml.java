package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.core.Persister;

import java.util.ArrayList;
import java.util.List;

public class FileXml extends UtilidadesClass implements ICrudOperaciones {

    List<Persona> personas;
    String path="src/main/resources/data.xml";

    @Override
    public List<Persona> obtenerPersonas() {
        Persister serializer = new Persister();
        List<Persona> personasList = new ArrayList<>();
        try {
            personasList.add(serializer.read(Persona.class, path));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
        return personasList;
    }

    @Override
    public Persona obtenerPersona(Persona persona) {
        return null;
    }

    @Override
    public void addPersona(Persona persona) {

    }

    @Override
    public void deletePersona(Persona persona) {

    }

    @Override
    public void actualizarPersona(Persona persona) {

    }
}
