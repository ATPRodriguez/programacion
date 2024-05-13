package es.ies.puerto.modelo.db.jdbc;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.PersonajeException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion extends AppConfig {
    Connection conexion;

    public Conexion() {}

    public Connection getConexion() throws PersonajeException {
        try{
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:"+getUrlDb());
        } catch (Exception exception){
            throw new PersonajeException(exception.getMessage(), exception);
        }
        return conexion;
    }

    public void cerrarConexion() throws PersonajeException{
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        }
    }
}