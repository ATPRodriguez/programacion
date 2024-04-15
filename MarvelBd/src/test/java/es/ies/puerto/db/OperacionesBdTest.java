package es.ies.puerto.db;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.OperacionesBd;
import es.ies.puerto.modelo.personaje.Personaje;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class OperacionesBdTest {
    OperacionesBd operacionesBd;
    String url = "src/main/resources/personajes.db";
    String MESSAGE_ERROR = "No se ha obtenido el resultado esperado";
    Personaje personaje;
    Set<String> poderes;
    @BeforeEach
    public void beforeEach () throws PersonajeException {
        operacionesBd = new OperacionesBd(url);
        poderes = new HashSet<>(Set.of("poder1","poder2", "poder3"));
        personaje = new Personaje(3, "pepe", "pepeman", "M", poderes);
    }

    @Test
    public void obtenerUsuariosTest () {
        try {
            Set<Personaje> lista = operacionesBd.obtenerPersonajes();
            Assertions.assertEquals(2, lista.size(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail();
        }
    }

    @Test
    public void obtenerUsuarioTest () {
        Personaje personajeObtener = new Personaje(2);
        try {
            personajeObtener = operacionesBd.obtenerPersonaje(personajeObtener);
            Assertions.assertNotNull(personajeObtener, MESSAGE_ERROR);
            Assertions.assertNotNull(personajeObtener.getId(), MESSAGE_ERROR);
            Assertions.assertNotNull(personajeObtener.getNombre(), MESSAGE_ERROR);
            Assertions.assertNotNull(personajeObtener.getAlias(), MESSAGE_ERROR);
            Assertions.assertNotNull(personajeObtener.getGenero(), MESSAGE_ERROR);
            Assertions.assertNotNull(personajeObtener.getPoderes(), MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail();
        }
    }

    @Test
    public void insertarEliminarUsuarioTest () {
        try {
            int numeroPersonajes = operacionesBd.obtenerPersonajes().size();
            operacionesBd.insertarPersonaje(personaje);
            int numeroPersonajesActualizado = operacionesBd.obtenerPersonajes().size();
            Personaje personajeObtenido = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, personajeObtenido, MESSAGE_ERROR);
            Assertions.assertEquals(numeroPersonajes+1, numeroPersonajesActualizado, MESSAGE_ERROR);
            operacionesBd.eliminarPersonaje(personajeObtenido);
            numeroPersonajesActualizado = operacionesBd.obtenerPersonajes().size();
            Assertions.assertFalse(operacionesBd.obtenerPersonajes().contains(personajeObtenido), MESSAGE_ERROR);
            Assertions.assertEquals(numeroPersonajes, numeroPersonajesActualizado, MESSAGE_ERROR);
        } catch (PersonajeException e) {
            Assertions.fail();
        }
    }

    @Test
    public void actualizarUsuarioTest() {
        String nombreUpdate = "Pepe Juan";
        String aliasUpdate = "Pepe JuanMan";
        String genero = "F";
        Set<String> poderesUpdate = Set.of("poder1update", "poder2update");
        try {
            operacionesBd.insertarPersonaje(personaje);
            personaje.setNombre(nombreUpdate);
            personaje.setAlias(aliasUpdate);
            personaje.setGenero(genero);
            personaje.setPoderes(poderesUpdate);
            operacionesBd.actualizarPersonaje(personaje);
            Personaje personajeEncontrado = operacionesBd.obtenerPersonaje(personaje);
            Assertions.assertEquals(personaje, personajeEncontrado);
            Assertions.assertEquals(personaje.getId(), personajeEncontrado.getId(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getNombre(), personajeEncontrado.getNombre(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getAlias(), personajeEncontrado.getAlias(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getGenero(), personajeEncontrado.getGenero(), MESSAGE_ERROR);
            Assertions.assertEquals(personaje.getPoderes(), personajeEncontrado.getPoderes(), MESSAGE_ERROR);
            operacionesBd.eliminarPersonaje(personajeEncontrado);
        } catch (PersonajeException exception) {
            Assertions.fail(MESSAGE_ERROR);
        }
    }
}