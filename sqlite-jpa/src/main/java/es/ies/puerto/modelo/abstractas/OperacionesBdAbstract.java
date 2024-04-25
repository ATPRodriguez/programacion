package es.ies.puerto.modelo.abstractas;

import es.ies.puerto.modelo.db.Conexion;
import es.ies.puerto.modelo.entities.Alias;
import es.ies.puerto.modelo.entities.Personaje;
import es.ies.puerto.modelo.exception.PersonajeException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public abstract class OperacionesBdAbstract extends Conexion {
    public OperacionesBdAbstract() {
    }

    public OperacionesBdAbstract(String url) throws PersonajeException {
        super(url);
    }

    public void actualizar (String query) throws PersonajeException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (getConexion() != null && !getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException exception) {
                throw new PersonajeException(exception.getMessage(), exception);
            }
        }
    }

    public Set<Personaje> obtener (String query) throws PersonajeException {
        Set<Personaje> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int IdPersonaje = rs.getInt("id");
                String nombrePersonaje = rs.getString("nombre");
                String generoPersonaje = rs.getString("genero");
                Personaje personaje = new Personaje(IdPersonaje, nombrePersonaje, generoPersonaje);
                lista.add(personaje);
            }
        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        } finally {
            try {
                if (rs != null && !rs.isClosed()) {
                    rs.close();
                }
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (getConexion() != null && !getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException exception) {
                throw new PersonajeException(exception.getMessage(), exception);
            }
        }
        return lista;
    }
}
