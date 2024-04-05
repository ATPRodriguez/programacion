package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Usuario;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class OperacionesBd extends Conexion {
    public OperacionesBd(String url) {
        super(url);
    }

    public Set<Usuario> obtenerUsuarios () throws UsuarioException {
        String query = "SELECT u.id, u.nombre, u.edad, u.ciudad FROM usuarios as u";
        return obtener(query);
    }

    public Usuario obtenerUsuario (Usuario usuario) throws UsuarioException {
        String query = "SELECT u.id, u.nombre, u.edad, u.ciudad FROM usuarios as u WHERE u.id='" + usuario.getId() + "'";
        Set<Usuario> lista = obtener(query);
        if (lista.isEmpty()) {
            return null;
        }
        return lista.iterator().next();
    }

    public void insertarUsuario (Usuario usuario) throws UsuarioException {
        String query = "INSERT INTO usuarios (nombre, edad, ciudad) VALUES ('" + usuario.getNombre() + "','"
                + usuario.getEdad() + "','" + usuario.getCiudad() + "')";
        actualizar(query);
    }


    public void eliminarUsuario (Usuario usuario) throws UsuarioException {
        String query = "delete FROM usuarios where id='" + usuario.getId() + "'";
        actualizar(query);
    }


    public void actualizarUsuario (Usuario usuario) throws UsuarioException {
        String query = "UPDATE usuarios SET nombre='" + usuario.getNombre() + "', ciudad='" +
                usuario.getCiudad() + "', edad=" + usuario.getEdad() + " where id='" + usuario.getId() + "'";
        actualizar(query);
    }

    private void actualizar (String query) throws UsuarioException {
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            statement.executeUpdate(query);
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
        } finally {
            try {
                if (statement != null && !statement.isClosed()) {
                    statement.close();
                }
                if (getConexion() != null && !getConexion().isClosed()) {
                    getConexion().close();
                }
            } catch (SQLException exception) {
                throw new UsuarioException(exception.getMessage(), exception);
            }
        }
    }

    private Set<Usuario> obtener (String query) throws UsuarioException {
        Set<Usuario> lista = new HashSet<>();
        ResultSet rs = null;
        Statement statement = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            while (rs.next()) {
                String userId = rs.getString("id");
                String userName = rs.getString("nombre");
                int userAge = rs.getInt("edad");
                String userCity = rs.getString("ciudad");
                Usuario usuario = new Usuario(userId,userName,userAge,userCity);
                lista.add(usuario);
            }
        } catch (SQLException exception) {
            throw new UsuarioException(exception.getMessage(), exception);
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
                throw new UsuarioException(exception.getMessage(), exception);
            }
        }
        return lista;
    }
}
