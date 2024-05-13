package es.ies.puerto.modelo.db.jdbc;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.abstractas.OperacionesJdbcAbstract;
import es.ies.puerto.modelo.entities.Alias;
import es.ies.puerto.modelo.entities.Personaje;
import es.ies.puerto.modelo.entities.Poder;
import es.ies.puerto.modelo.interfaces.ICrudJdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class OperacionesBd extends OperacionesJdbcAbstract implements ICrudJdbc {
    public OperacionesBd() {
    }
    @Override
    public Set<Personaje> obtener(String query) throws PersonajeException {
        Set<Personaje> personajes = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            statement = getConexion().createStatement();
            rs = statement.executeQuery(query);
            personajes = new HashSet<>();
            while (rs.next()) {
                personajes.add(crearPersonaje(rs));
            }
        } catch (Exception exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        }finally{
            cerrarRecursos(statement, rs);
        }
        return personajes;
    }
    public Personaje crearPersonaje(ResultSet rs) throws PersonajeException {
        try {
            int id = rs.getInt("personaje_id");
            String name = rs.getString("nombre_personaje");
            String gender = rs.getString("genero");
            Alias alias = obtenerAlias(rs);
            Set<Poder> poderes = obtenerPoderes(rs);
            return new Personaje(id, name, gender,alias, poderes);
        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        }
    }

    public Alias obtenerAlias(ResultSet rs) throws PersonajeException{
        Alias aliasObtener = null;
        try {
            int aliasId = rs.getInt("alias_id");
            int personajeId = rs.getInt("personaje_id");
            String alias = rs.getString("alias");
            aliasObtener = new Alias(aliasId, new Personaje(personajeId), alias);
        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        }
        return aliasObtener;
    }

    public Set<Poder> obtenerPoderes(ResultSet rs) throws PersonajeException {
        Set<Poder> poderes = null;
        try {
            poderes = new HashSet<>();
            int poderId = rs.getInt("poder_id");
            String poder = rs.getString("poder");
            Poder poderInsertar = new Poder(poderId, poder);
            poderes.add(poderInsertar);

        } catch (SQLException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        }
        return poderes;
    }
    @Override
    public Set<Personaje> obtenerPersonajes() throws PersonajeException {
        String qry = "SELECT p.id AS personaje_id, p.nombre AS nombre_personaje, p.genero, " +
                "a.id AS alias_id, a.alias, " +
                "po.id AS poder_id, po.poder " +
                "FROM Personajes AS p " +
                "JOIN Alias AS a ON p.id = a.personaje_id " +
                "JOIN Personajes_Poderes AS ppo ON p.id = ppo.personaje_id " +
                "JOIN Poderes AS po ON ppo.poder_id = po.id";
        return obtener(qry);
    }
    @Override
    public Personaje obtenerPersonaje(Personaje personaje) throws PersonajeException {
        String query = "SELECT p.id AS personaje_id, p.nombre AS nombre_personaje, p.genero, " +
                "a.id AS alias_id, a.alias, " +
                "po.id AS poder_id, po.poder " +
                "FROM Personajes AS p " +
                "JOIN Alias AS a ON p.id = a.personaje_id " +
                "JOIN Personajes_Poderes AS ppo ON p.id = ppo.personaje_id " +
                "JOIN Poderes AS po ON ppo.poder_id = po.id "+
                "WHERE p.id="+ personaje.getPersonajeId();
        Set<Personaje> personajes = obtener(query);
        return personajes.iterator().next();
    }
    @Override
    public void insertarPersonaje(Personaje personaje) throws PersonajeException {
        String query = "INSERT INTO Personajes(id, nombre, genero) " +
                "VALUES ("+ personaje.getPersonajeId()+ ", '"+ personaje.getNombre()+
                "', '"+ personaje.getGenero()+"')";
        actualizar(query);
        insertarPoderes(personaje);
        insertarAlias(personaje);
        insertarPersonajesPoderes(personaje);
    }

    public void insertarPoderes(Personaje personaje) throws PersonajeException{
        for (Poder poder : personaje.getPoderes()){
            String query = "INSERT INTO Poderes(id, poder)" +
                    "VALUES ("+ poder.getIdPoder()+", '"+poder.getPoder()+"')";
            actualizar(query);
        }
    }

    public void insertarAlias(Personaje personaje) throws PersonajeException{
        String query = "INSERT INTO Alias(id, personaje_id, alias) VALUES ("+ personaje.getAlias().getAliasId()+", "
                + personaje.getAlias().getPersonaje().getPersonajeId()+", '"+ personaje.getAlias().getAlias()+"')";
        actualizar(query);
    }

    public void insertarPersonajesPoderes(Personaje personaje) throws PersonajeException{
        for (Poder poder: personaje.getPoderes()) {
            String query = "INSERT INTO Personajes_Poderes(personaje_id, poder_id) VALUES (" +
                    personaje.getPersonajeId() + ", " + poder.getIdPoder() + ")";
            actualizar(query);
        }
    }

    @Override
    public void eliminarPersonaje(Personaje personaje) throws PersonajeException {
        String query = "DELETE FROM Personajes WHERE id="+ personaje.getPersonajeId();
        actualizar(query);
        eliminarPoderes(personaje);
        eliminarPersonajesPoderes(personaje);
        eliminarAlias(personaje);
    }

    public void eliminarPoderes(Personaje personaje) throws PersonajeException{
        for (Poder poder: personaje.getPoderes()) {
            String query = "DELETE FROM Poderes WHERE id=" + poder.getIdPoder();
            actualizar(query);
        }
    }

    public void eliminarAlias(Personaje personaje) throws PersonajeException{
        String query = "DELETE FROM Alias WHERE personaje_id="+ personaje.getPersonajeId();
        actualizar(query);
    }

    public void eliminarPersonajesPoderes(Personaje personaje) throws PersonajeException{
        String query = "DELETE FROM Personajes_Poderes WHERE personaje_id="+ personaje.getPersonajeId();
        actualizar(query);
    }

    @Override
    public void actualizarPersonaje(Personaje personaje) throws PersonajeException {
        String query = "UPDATE Personajes SET nombre='"+ personaje.getNombre()+
                "', genero='"+ personaje.getGenero()+ "' WHERE id="+ personaje.getPersonajeId();
        actualizar(query);
        actualizarPoderes(personaje);
        actualizarAlias(personaje);
        actualizarPersonajesPoderes(personaje);
    }

    public void actualizarPoderes(Personaje personaje) throws PersonajeException{
        for (Poder poder: personaje.getPoderes()) {
            String query = "UPDATE Poderes SET " +
                    "poder='"+poder.getPoder()+"' " +
                    "WHERE id="+poder.getIdPoder()+";";
            actualizar(query);
        }
    }

    public void actualizarAlias(Personaje personaje) throws PersonajeException {
        String query = "UPDATE Alias SET alias='"+ personaje.getAlias().getAlias() + "' " +
                "WHERE id="+ personaje.getAlias().getAliasId();
        actualizar(query);
    }

    public void actualizarPersonajesPoderes(Personaje personaje) throws PersonajeException {
        for (Poder poder : personaje.getPoderes()) {
            String query = "REPLACE INTO Personajes_Poderes (personaje_id, poder_id) VALUES " +
                    "("+ personaje.getPersonajeId()+", "+poder.getIdPoder()+ ")";
            actualizar(query);
        }
    }

}