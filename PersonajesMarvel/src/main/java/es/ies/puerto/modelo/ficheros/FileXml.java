package es.ies.puerto.modelo.ficheros;

import es.ies.puerto.modelo.personaje.Personaje;
import es.ies.puerto.modelo.personaje.PersonajeList;
import es.ies.puerto.modelo.interfaces.ICrudOperaciones;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class FileXml implements ICrudOperaciones {

    String path ="src/main/resources/personajes.xml";
    List<Personaje> personajes;
    final List<Personaje> personajesBackup = obtenerPersonajes();

    @Override
    public List<Personaje> obtenerPersonajes() {
        Persister serializer = new Persister();
        try{
            PersonajeList personajeList = serializer.read(PersonajeList.class, new File(path));
            personajes = personajeList.getPersonajes();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return personajes;
    }

    @Override
    public Personaje obtenerPersonaje (Personaje personaje) {
        if (!personajes.contains(personaje)){
            return null;
        }
        int posicion = personajes.indexOf(personaje);
        return personajes.get(posicion);
    }

    @Override
    public void agregarPersonaje (Personaje personaje) {
        if (personajes.contains(personaje)){
            return;
        }
        personajes.add(personaje);
        actualizarFichero(personajes);
    }

    @Override
    public void eliminarPersonaje (Personaje personaje) {
        if (personajes.remove(personaje)){
            actualizarFichero(personajes);
        }
    }

    @Override
    public void modificarPersonaje (Personaje personaje) {
        if (!personajes.contains(personaje)){
            return;
        }
        int posicion = personajes.indexOf(personaje);
        personajes.set(posicion,personaje);
        actualizarFichero(personajes);
    }

    @Override
    public void cargarBackup() {
        actualizarFichero(personajesBackup);
    }

    public void actualizarFichero(List<Personaje> personajes){
        PersonajeList personajeList = new PersonajeList(personajes);
        Persister serializer = new Persister();
        try {
            serializer.write(personajeList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}