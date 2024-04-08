package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.personaje.Personaje;
import es.ies.puerto.modelo.personaje.Poder;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class OperacionesBd extends Conexion {
    public OperacionesBd(String url) throws PersonajeException {
        super(url);
    }

    public Set<Personaje> obtenerPersonajes () throws PersonajeException {
        String query = "SELECT p.id, p.nombre, p.alias, p.genero FROM personajes as p";
        return obtener(query);
    }

    public Set<Poder> obtenerPoderes () throws PersonajeException {
        String query = "SELECT p.poder FROM poderes as p";
        return queryPoderes(query);
    }

    public Personaje obtenerPersonaje (Personaje personaje) throws PersonajeException {
        String query = "SELECT p.id, p.nombre, p.genero, u.ciudad FROM personajes as u WHERE u.id='" + personaje.getId() + "'";
        Set<Personaje> lista = obtener(query);
        if (lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje (Personaje personaje) throws PersonajeException {
        String query = "INSERT INTO personajes (nombre, alias, genero) VALUES ('" + personaje.getNombre() + "','"
                + personaje.getAlias() + "','" + personaje.getGenero() + ",')";
        actualizar(query);
    }


    public void eliminarPersonaje (Personaje personaje) throws PersonajeException {
        String query = "delete FROM personajes where id='" + personaje.getId() + "'";
        actualizar(query);
    }


    public void actualizarPersonaje (Personaje personaje) throws PersonajeException {
        String query = "UPDATE personajes SET nombre='" + personaje.getNombre() + "', ciudad='" +
                personaje.getAlias() + "', edad=" + personaje.getGenero() + " where id='" + personaje.getId() + "'";
        actualizar(query);
    }

    private void actualizar (String query) throws PersonajeException {
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

    private Set<Personaje> obtener (String query) throws PersonajeException {
        Set<Personaje> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String userId = rs.getString("id");
                String userName = rs.getString("nombre");
                int userAge = rs.getInt("alias");
                String userCity = rs.getString("genero");
                Personaje personaje = new Personaje(userId,userName,userAge,userCity);
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

    private Set<Poder> queryPoderes (String query) throws PersonajeException {
        Set<Poder> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String poder = rs.getString("poder");
                Poder personaje = new Personaje(userId,userName,userAge,userCity);
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
