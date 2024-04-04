package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import es.ies.puerto.utilidades.UtilidadesClass;

import java.util.List;

public class FileJson extends UtilidadesClass implements ICrudOperaciones {
    List<Persona> personas;
    String path="src/main/resources/data.json";
    @Override
    public List<Persona> obtenerPersonas() {
        return null;
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
    public void updatePersona(Persona persona) {

    }
}
