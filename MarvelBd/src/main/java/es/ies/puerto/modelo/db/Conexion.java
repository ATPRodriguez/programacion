package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.PersonajeException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection con;

    private String url;

    public Conexion(String url) throws PersonajeException {
        this.url = "jdbc:sqlite:" + url;
    }

    public Connection getConexion() throws PersonajeException {
        try {
            this.con = DriverManager.getConnection(url);
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
            throw new PersonajeException ("No se ha podido establecer la conexion",
                    exception);
        }
        return con;
    }
}
