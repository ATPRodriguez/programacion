package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.jdbc.OperacionesBd;
import es.ies.puerto.modelo.entities.Alias;
import es.ies.puerto.modelo.entities.Personaje;
import es.ies.puerto.modelo.entities.Poder;
import es.ies.puerto.modelo.interfaces.ICrudJdbc;
import es.ies.puerto.modelo.utilidades.Utilidades;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OperacionesJdbcTest extends Utilidades {
    OperacionesBd operaciones;
    int id = 3;
    String nombre = "nombreTest";
    Alias alias = new Alias(3, new Personaje(3), "aliasTest");
    String genero = "generoTest";
    Set<Poder> poderes;
    Poder poder1 = new Poder(10, "poder1");
    Poder poder2 = new Poder(11, "poder2");
    ICrudJdbc persistencia;
    Set<Personaje> personajes;

    public OperacionesJdbcTest() throws PersonajeException {
    }

    @BeforeEach
    public void beforeEach() {
        try {
        persistencia = new OperacionesBd();
        personajes = persistencia.obtenerPersonajes();
        poderes = new HashSet<>(Arrays.asList(poder1, poder2));
        } catch (PersonajeException e) {
            Assertions.fail();
        }
    }

    @Test
    public void obtenerPersonajesTest() {
        Assertions.assertFalse(personajes.isEmpty(), MESSAGE_ERROR);
        Assertions.assertEquals(2, personajes.size(), MESSAGE_ERROR);
    }

    @Test
    public void obtenerPersonajeTest() throws PersonajeException {
        Personaje personajeEncontrar = new Personaje(2);
        personajeEncontrar = persistencia.obtenerPersonaje(personajeEncontrar);
        Alias aliasTest = new Alias(2,new Personaje(2), "Peter Parker");
        Assertions.assertEquals(personajeEncontrar.getAlias(),aliasTest,
                MESSAGE_ERROR);
        Assertions.assertNotNull(personajeEncontrar.getNombre(),
                MESSAGE_ERROR);
        Assertions.assertFalse(personajeEncontrar.getPoderes().isEmpty(), MESSAGE_ERROR);
        Assertions.assertNotNull(personajeEncontrar.getGenero(),
                MESSAGE_ERROR);
    }

    @Test
    public void insertarEliminarPersonajeTest() throws PersonajeException {
        int tamanio = personajes.size();
        Personaje personajeInsertar = new Personaje(id, nombre, genero, alias, poderes);

        persistencia.insertarPersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();

        Assertions.assertTrue(personajes.contains(personajeInsertar), MESSAGE_ERROR);
        int tamanioActualizado = personajes.size();

        Assertions.assertEquals(tamanio + 1, tamanioActualizado, MESSAGE_ERROR);

        persistencia.eliminarPersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        tamanioActualizado = personajes.size();
        Assertions.assertEquals(tamanio, tamanioActualizado, MESSAGE_ERROR);

        persistencia.eliminarPersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();
        tamanioActualizado = personajes.size();
        Assertions.assertEquals(tamanio, tamanioActualizado, MESSAGE_ERROR);
    }

    @Test
    public void actualizarPersonajeTest() throws PersonajeException {
        Personaje personajeInsertar = new Personaje(id, nombre, genero, alias, poderes);
        persistencia.insertarPersonaje(personajeInsertar);
        personajes = persistencia.obtenerPersonajes();

        Personaje personajeEncontrado = new Personaje(personajeInsertar.getPersonajeId());
        personajeEncontrado = persistencia.obtenerPersonaje(personajeEncontrado);

        Personaje personajeActualizar = persistencia.obtenerPersonaje(personajeEncontrado);

        personajeActualizar.setNombre("nombreActualizar");
        personajeActualizar.setGenero("generoActualizar");
        alias.setPersonaje(new Personaje(3));
        alias.setAlias("aliasUpdate");
        personajeActualizar.setAlias(alias);
        poder1.setPoder("poderActualizar");
        Set<Poder> poderesActualizar = new HashSet<>();
        poderesActualizar.add(poder1);
        personajeActualizar.setPoderes(poderesActualizar);

        persistencia.actualizarPersonaje(personajeActualizar);

        personajeEncontrado = persistencia.obtenerPersonaje(personajeEncontrado);
        Assertions.assertEquals(personajeEncontrado.toString(), personajeActualizar.toString(),
                MESSAGE_ERROR);

        persistencia.eliminarPersonaje(personajeActualizar);
    }

    @AfterEach
    public void afterEach() throws PersonajeException {
        operaciones = new OperacionesBd();
        operaciones.actualizar(dropTablesQry);
        operaciones.actualizar(scriptBBDD);
    }
}