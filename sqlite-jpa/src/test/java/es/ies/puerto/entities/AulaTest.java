package es.ies.puerto.entities;

import es.ies.puerto.modelo.entities.Alias;
import es.ies.puerto.modelo.implementacion.CrudAlias;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AulaTest {

    public static final String NOMBRE_ALIAS = "NombreAlias";
    static CrudAlias crudAlias;

    static EntityManagerFactory emf;

    Alias alias;

    @BeforeAll
    public static void setUp() {
        emf = Persistence.createEntityManagerFactory("pu-sqlite-jpa");
        crudAlias = new CrudAlias(emf);
    }

    @BeforeEach
    public void initEntityManager() {
        alias = new Alias();
        alias.setAlias(NOMBRE_ALIAS);
        crudAlias.addAlias(alias);
    }

    @Test
    public void findAulaTest() {
        try {
            Alias aliasFind= crudAlias.getAlias(alias.getId());
            Assertions.assertEquals(alias.getAlias(),aliasFind.getAlias());
        }catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @AfterEach
    public void afterEach() {
        crudAlias.deleteAlias(alias);
    }
}
