package es.ies.puerto.modelo.db;

import es.ies.puerto.modelo.db.jdbc.Conexion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConexionTest {
    Conexion conexion;

    @BeforeEach
    public void beforeEach() {
        conexion = new Conexion();
    }

    @Test
    public void conectar(){
        try {
            conexion.getConexion();
        } catch (Exception exception){
            Assertions.fail(exception.getMessage());
        }
    }
}