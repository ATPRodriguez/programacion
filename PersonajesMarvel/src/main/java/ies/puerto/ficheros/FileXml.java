package ies.puerto.ficheros;

import ies.puerto.interfaces.ICrudOperaciones;
import ies.puerto.personaje.Personaje;
import ies.puerto.personaje.PersonajeList;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileXml implements ICrudOperaciones {

    String path ="src/main/resources/personajes.xml";
    List<Personaje> personajes;

    public FileXml (){
        personajes = new ArrayList<>();
    }

    @Override
    public List<Personaje> obtenerPersonajes() {
        Persister serializer = new Persister();
        try {
            File file = new File(path);
            PersonajeList personajeList = serializer.read(PersonajeList.class, file);
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
        if (!personajes.contains(personaje)){
            return;
        }
        personajes.remove(personaje);
        actualizarFichero(personajes);
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