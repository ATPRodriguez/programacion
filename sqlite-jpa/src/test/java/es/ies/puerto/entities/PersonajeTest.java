package es.ies.puerto.entities;

import es.ies.puerto.modelo.entities.Personaje;
import es.ies.puerto.modelo.entities.Poder;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class PersonajeTest {
	public static final String PERSONAJE_TEST = "personajeTest";
	public static final String PODER_TEST = "poderTest";
	static EntityManagerFactory emf;
	EntityManager em;
	Personaje personaje;
	Poder poder;

	@BeforeAll
	public static void setUp() {
		emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
	}

	@BeforeEach
	public void initEntityManager() {
		em = emf.createEntityManager();
		personaje = new Personaje();
		personaje.setNombre(PERSONAJE_TEST);
		poder = new Poder();
		poder.setPoder(PODER_TEST);
		Set<Poder> poderes = new HashSet<>();
		poderes.add(poder);
		personaje.setPoderes(poderes);
		try {
			// Persist in database
			em.getTransaction().begin();
			em.persist(poder);
			em.persist(personaje);
			em.getTransaction().commit();
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testPersistFind() {
		try {
			Personaje personajeEncontrado = em.find(Personaje.class, personaje.getId());
			Assertions.assertEquals(personaje.getNombre(), personajeEncontrado.getNombre());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void testUpdate() {
		try {
			Personaje personajeFind = em.find(Personaje.class, personaje.getId()); // See file import.sql
			personajeFind.setGenero("Masculino");

			// Persist in database
			em.getTransaction().begin();
			em.merge(personajeFind);
			em.getTransaction().commit();

			// Find by id
			Personaje personajeActualizar = em.find(Personaje.class, personaje.getId());
			Assertions.assertEquals(personajeFind.getGenero(), personajeActualizar.getGenero());
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void removePerson() {
		try {
			int personajeId = this.personaje.getId();
			Personaje alumno = em.find(Personaje.class, personajeId); // See file import.sql
			em.getTransaction().begin();
			em.remove(alumno);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Personaje alumnoDB = em.find(Personaje.class, personajeId); // See file import.sql

			Assertions.assertNull(alumnoDB);

		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void closeEntityManager() {
		em.close();
		em = null;
	}

	@AfterAll
	public static void closeEntityManagerFactory() {
		emf.close();
	}

}
