package es.ies.puerto.modelo.abstractas;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.db.jdbc.Conexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class OperacionesJdbcAbstract extends Conexion {
    public OperacionesJdbcAbstract() {
        super();
    }

    public void actualizar(String query) throws PersonajeException {
        Statement statement = null;
        try{
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception){
            throw new PersonajeException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()){
                    statement.close();
                }
                cerrarConexion();

            } catch (SQLException e) {
                throw new PersonajeException(e.getMessage(), e);
            }
        }
    }
    public void cerrarRecursos(Statement statement, ResultSet rs) throws PersonajeException {
        try {
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            cerrarConexion();
        } catch (Exception e) {
            throw new PersonajeException(e.getMessage(), e);
        }
    }
}