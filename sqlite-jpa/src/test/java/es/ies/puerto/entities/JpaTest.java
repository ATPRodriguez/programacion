package es.ies.puerto.entities;

import es.ies.puerto.modelo.db.OperacionesBd;
import es.ies.puerto.modelo.db.OperacionesJpa;
import es.ies.puerto.modelo.entities.Alias;
import es.ies.puerto.modelo.entities.Personaje;
import es.ies.puerto.modelo.entities.Poder;
import es.ies.puerto.modelo.exception.PersonajeException;
import es.ies.puerto.util.Utilidades;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class JpaTest extends Utilidades {
    String MESSAGE_ERROR = "No se ha obtenido el resultado esperado";
    static EntityManagerFactory emf;
    static OperacionesJpa operationsHibernate;
    Personaje personaje;
    int id = 3;
    String name = "nameTesting";
    Alias alias= new Alias(3, new Personaje(3), "aliasTest");;
    String gender = "genderTest";
    Set<Poder> powers;
    Poder power1 = new Poder(10, "powerTesting1");
    Poder power2 = new Poder(11, "powerTesting2");

    OperacionesBd operacionesBd;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        operationsHibernate = new OperacionesJpa(emf);
    }

    @BeforeEach
    public void initEntityManager() {
        powers = new HashSet<>();
        powers.add(power1);
        powers.add(power2);
        personaje = new Personaje(id,name,gender,alias,powers);
        operationsHibernate.agregarPersonaje(personaje);
    }

    @Test
    public void testPersistFindUpdateRemove() {
        Personaje personajeEncontrado = operationsHibernate.obtenerPersonaje(personaje);
        Assertions.assertEquals(personaje.getNombre(), personajeEncontrado.getNombre(), MESSAGE_ERROR);
        personaje.setNombre("nameTest");

        operationsHibernate.actualizarPersonaje(personaje);
        Personaje personajeActualizado = operationsHibernate.obtenerPersonaje(personaje);
        Assertions.assertEquals(personaje.getNombre(), personajeActualizado.getNombre(), MESSAGE_ERROR);


        operationsHibernate.eliminarPersonaje(personaje);
        Assertions.assertNull(operationsHibernate.obtenerPersonaje(personaje), MESSAGE_ERROR);
    }

    @AfterEach
    public void afterEach() throws PersonajeException {
        operacionesBd = new OperacionesBd();
        operacionesBd.actualizar(queryDrop);
        operacionesBd.actualizar(queryReconstruir);
    }

    @AfterAll
    public static void afterAll() {
        emf.close();
    }
}