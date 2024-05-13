package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.jpa.OperacionesJpa;
import es.ies.puerto.modelo.entities.Alias;
import es.ies.puerto.modelo.entities.Personaje;
import es.ies.puerto.modelo.entities.Poder;
import es.ies.puerto.modelo.utilidades.Utilidades;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class OperacionesJpaTest extends Utilidades {
    static EntityManagerFactory emf;
    static OperacionesJpa operacionesJpa;
    Personaje personaje;
    int id = 3;
    String nombre = "nombreTest";
    Alias alias;
    String generoTest = "generoTest";
    Set<Poder> poderes;
    Poder poder;
    public OperacionesJpaTest() throws PersonajeException {
    }

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        operacionesJpa = new OperacionesJpa(emf);
    }

    @BeforeEach
    public void initEntityManager() {
        poderes = new HashSet<>();
        poder = new Poder(10, "poderTest1");
        poderes.add(poder);
        alias = new Alias(id, new Personaje(id), "aliasTest");

        personaje = new Personaje(id);
        personaje.setNombre(nombre);
        personaje.setGenero(generoTest);
        personaje.setAlias(alias);
        personaje.setPoderes(poderes);

        operacionesJpa.insertarPersonaje(personaje);
    }

    @Test
    public void findTest(){
        Assertions.assertNotNull(operacionesJpa.obtenerPersonajes(), MESSAGE_ERROR);

        Personaje heroCharacterDB = operacionesJpa.obtenerPersonaje(personaje);
        Assertions.assertEquals(personaje.getNombre(), heroCharacterDB.getNombre(), MESSAGE_ERROR);
    }
    @Test
    public void actualizarTest(){
        personaje.setNombre("nombreActualizar");
        personaje.setGenero("generoActualizar");

        operacionesJpa.actualizarPersonaje(personaje);
        Personaje personajeActualizar = operacionesJpa.obtenerPersonaje(personaje);
        Assertions.assertEquals(personaje.getNombre(), personajeActualizar.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(personaje.getGenero(), personajeActualizar.getGenero(), MESSAGE_ERROR);

        operacionesJpa.eliminarPersonaje(personaje);
        Assertions.assertNull(operacionesJpa.obtenerPersonaje(personaje), MESSAGE_ERROR);
    }

    @AfterEach
    public void afterEach() throws PersonajeException {
        dropTablesCreate();
    }

   @AfterAll
    public static void afterAll() {
        emf.close();
    }
}