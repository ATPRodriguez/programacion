package ies.puerto.ficheros;

import ies.puerto.interfaces.ICrudOperaciones;
import ies.puerto.personaje.Personaje;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FileCsvTest {
    String nombre = "NombreNuevo";
    String alias = "AliasNuevo";
    String genero = "GeneroNuevo";
    Set<String> poderes;
    ICrudOperaciones persistencia;
    List<Personaje> personajes;
    String MENSAJE_ERROR = "No se ha obtenido el resultado esperado";

    @BeforeEach
    public void beforeEach(){
        persistencia = new FileCsv();
        personajes = persistencia.obtenerPersonajes();
        poderes = new HashSet<>(Arrays.asList("poder1", "poder2", "poder3"));
    }

    @Test
    public void obtenerPersonajesTest(){
        Assertions.assertNotNull(personajes, MENSAJE_ERROR);
    }

    @Test
    public void obtenerPersonajeTest(){
        Personaje personajeObtener = new Personaje("Tony Stark");
        personajeObtener = persistencia.obtenerPersonaje(personajeObtener);
        Assertions.assertEquals(personajeObtener.getAlias(),"Tony Stark", MENSAJE_ERROR);
        Assertions.assertEquals(personajeObtener.getNombre(), "Iron Man", MENSAJE_ERROR);
        Assertions.assertFalse(personajeObtener.getPoderes().isEmpty(), MENSAJE_ERROR);
        Assertions.assertEquals(personajeObtener.getGenero(), "Masculino", MENSAJE_ERROR);
    }

    @Test
    public void agregarEliminarPersonajeTest(){
        int tamanioOriginal = personajes.size();
        Personaje personajeAgregar = new Personaje (alias, nombre, genero, poderes);
        persistencia.agregarPersonaje(personajeAgregar);
        personajes = persistencia.obtenerPersonajes();
        int tamanioNuevo = personajes.size();

        Assertions.assertTrue(personajes.contains(personajeAgregar), MENSAJE_ERROR);
        Assertions.assertEquals(tamanioOriginal + 1, tamanioNuevo, MENSAJE_ERROR);

        persistencia.eliminarPersonaje(personajeAgregar);
        Assertions.assertFalse(personajes.contains(personajeAgregar), MENSAJE_ERROR);
    }

    @Test
    public void modificarPersonajeTest(){
        Personaje personajeModificar = new Personaje("Peter Parker");

        Personaje personajeBackup = persistencia.obtenerPersonaje(personajeModificar);

        personajeModificar = persistencia.obtenerPersonaje(personajeModificar);
        personajeModificar.setNombre(nombre);
        personajeModificar.setGenero(genero);
        personajeModificar.setPoderes(poderes);

        persistencia.modificarPersonaje(personajeModificar);

        Assertions.assertEquals(personajeModificar,
                persistencia.obtenerPersonaje(personajeModificar), MENSAJE_ERROR);
        persistencia.cargarBackup();
    }
}