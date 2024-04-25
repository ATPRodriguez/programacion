package es.ies.puerto.entities;

import es.ies.puerto.modelo.entities.Personaje;
import es.ies.puerto.modelo.entities.Poder;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class ProfesorTest {
	public static final String PERSONAJE_TEST = "personajeTest";
	public static final String PODER_TEST = "poder_Test";
	public static final String NOMBRE_UPDATE = "nombre_update";
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
		Set<Personaje> personajes = new HashSet<>();
		personajes.add(personaje);
		poder.setPersonajes(personajes);
		try {
			// Persist in database
			em.getTransaction().begin();
			em.persist(personaje);
			//em.persist(profesor);
			//em.getTransaction().commit();

			//em.getTransaction().begin();
			em.persist(poder);
			//em.persist(profesor);
			em.getTransaction().commit();
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void persistFindProfesorTest() {
		try {
			Poder poderEncontrado = em.find(Poder.class, poder.getId());
			Assertions.assertEquals(poderEncontrado.getPoder(), poder.getPoder());
		} catch (Throwable e) {
			Assertions.fail("Se ha producido un error:"+e.getMessage());
		}
	}

	@Test
	public void updateProfesorTest() {
		try {
			Poder poderEncontrado = em.find(Poder.class, poder.getId());
			Assertions.assertEquals(poderEncontrado.getPoder(), poder.getPoder());
			poderEncontrado.setPoder(NOMBRE_UPDATE);

			// Persist in database
			em.getTransaction().begin();
			em.merge(poderEncontrado);
			em.getTransaction().commit();

			// Find by id
			Poder poderActualizado = em.find(Poder.class, poder.getId());
			Assertions.assertEquals(poderActualizado.getPoder(), NOMBRE_UPDATE);
		} catch (Throwable e) {
			e.printStackTrace();
			Assertions.fail();
		}
	}

	@AfterEach
	public void removeProfesor() {
		try {
			int id = this.poder.getId();
			Poder profesorFind = em.find(Poder.class, id); // See file import.sql
			em.getTransaction().begin();
			em.remove(profesorFind);
			em.getTransaction().commit(); // TODO java.sql.SQLException: database is locked (sometimes)

			// Find by id
			Poder profesorDB = em.find(Poder.class, id); // See file import.sql

			Assertions.assertNull(profesorDB);

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
