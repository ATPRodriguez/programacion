package es.ies.puerto.modelo.db;

import es.ies.puerto.modelo.exception.PersonajeException;
import es.ies.puerto.modelo.entities.Personaje;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class OperacionesBd extends Conexion {
    public OperacionesBd(String url) throws PersonajeException {
        super(url);
    }

    public Set<Personaje> obtenerPersonajes () throws PersonajeException {
        String query = "SELECT id, nombre, alias, genero FROM personajes";
        return obtener(query);
    }

    public Set<String> obtenerPoderes (Personaje personaje) throws PersonajeException {
        String query = "SELECT poder FROM poderes WHERE personaje_id=" + personaje.getId();
        return queryPoderes(query);
    }

    public Personaje obtenerPersonaje (Personaje personaje) throws PersonajeException {
        String query = "SELECT id, nombre, alias, genero FROM personajes WHERE id=" + personaje.getId();
        Set<Personaje> lista = obtener(query);
        if (lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarPersonaje (Personaje personaje) throws PersonajeException {
        String query = "INSERT INTO personajes (id, nombre, alias, genero) VALUES (" + personaje.getId() +",'" + personaje.getNombre() + "','"
                + personaje.getAlias() + "','" + personaje.getGenero() + "'); ";
        actualizar(query);
        insertarPoderes(personaje);
    }

    public void insertarPoderes (Personaje personaje) throws PersonajeException {
        String query = "";
        for (String poder : personaje.getPoderes()) {
            query+= "INSERT INTO Poderes (personaje_id, poder) VALUES (" + personaje.getId() + ", '" + poder + "'); ";
        }
        actualizar(query);
    }


    public void eliminarPersonaje (Personaje personaje) throws PersonajeException {
        String query = "DELETE FROM personajes where id=" + personaje.getId() + "; " +
                "DELETE FROM Poderes where personaje_id=" + personaje.getId();
        actualizar(query);
    }


    public void actualizarPersonaje (Personaje personaje) throws PersonajeException {
        eliminarPersonaje(personaje);
        insertarPersonaje(personaje);
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
                int IdPersonaje = rs.getInt("id");
                String nombrePersonaje = rs.getString("nombre");
                String aliasPersonaje = rs.getString("alias");
                String generoPersonaje = rs.getString("genero");
                Set<String> poderes = obtenerPoderes(new Personaje(IdPersonaje));
                Personaje personaje = new Personaje(IdPersonaje,nombrePersonaje, aliasPersonaje,generoPersonaje, poderes);
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

    private Set<String> queryPoderes (String query) throws PersonajeException {
        Set<String> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String poder = rs.getString("poder");
                lista.add(poder);
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
