package ies.puerto.ficheros;

import ies.puerto.interfaces.ICrudOperaciones;
import ies.puerto.personaje.Personaje;
import ies.puerto.utilidades.Utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileCsv extends Utilidades implements ICrudOperaciones {
    String path = "src/main/resources/personajes.csv";
    List<Personaje> personajes;
    List<Personaje> personajesBackup = obtenerPersonajes();

    @Override
    public List<Personaje> obtenerPersonajes() {
        personajes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(DELIMITADOR);
                Personaje personaje = crearPersonaje(datos);
                personajes.add(personaje);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return personajes;
    }

    public Personaje crearPersonaje(String [] datos){
        Set<String> poderes = new HashSet<>();
        for (int i=3; i< datos.length; i++) {
            poderes.add(datos[i].trim());
        }
        return new Personaje(datos[1], datos[0], datos[2], poderes);
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
        if (personajes.contains(personaje)) {
            return;
        }
        personajes.add(personaje);
        actualizarFichero(personajes);
    }

    @Override
    public void eliminarPersonaje (Personaje personaje) {
        if (personajes.remove(personaje)) {
            actualizarFichero(personajes);
        }
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
        try (FileWriter writer = new FileWriter(path)){
            for (Personaje personajeLista : personajes){
                writer.write(personajeLista.toCsv()+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
