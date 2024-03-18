package ies.puerto.ficheros;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import ies.puerto.interfaces.ICrudOperaciones;
import ies.puerto.personaje.Personaje;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileJson implements ICrudOperaciones {
    String path ="src/main/resources/personajes.json";
    List<Personaje> personajes;
    List<Personaje> personajesBackup = obtenerPersonajes();

    public FileJson(){
        personajes = new ArrayList<>();
    }
    @Override
    public List<Personaje> obtenerPersonajes() {
        try {
            String json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<ArrayList<Personaje>>() {}.getType();
            personajes = new Gson().fromJson(json, listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return personajes;
    }

    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
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
        personajes.set(posicion, personaje);
        actualizarFichero(personajes);
    }

    @Override
    public void cargarBackup() {
        actualizarFichero(personajesBackup);
    }

    public void actualizarFichero(List<Personaje> personajes){
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personajes, writer);
        } catch (IOException e) {
            System.err.println("Error while saving data: " + e.getMessage());
        }
    }
}