package es.ies.puerto.db;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.Conexion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConexionTest {
    Conexion conexion;
    String url = "src/main/resources/personajes.db";

    @BeforeEach
    public void beforeEach() throws PersonajeException {
        conexion = new Conexion(url);
    }

    @Test
    public void conectarBd() {
        try {
            conexion.getConexion();
        }catch (PersonajeException exception) {
            Assertions.fail(exception.getMessage(), exception);
        }
    }
}