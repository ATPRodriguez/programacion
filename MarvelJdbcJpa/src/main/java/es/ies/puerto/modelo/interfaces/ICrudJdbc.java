package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.entities.Personaje;

import java.util.Set;

public interface ICrudJdbc {
    public Set<Personaje> obtener(String query) throws PersonajeException;
    public Set<Personaje> obtenerPersonajes() throws PersonajeException;
    public Personaje obtenerPersonaje(Personaje personaje) throws PersonajeException ;
    public void insertarPersonaje(Personaje personaje) throws PersonajeException;
    public void eliminarPersonaje(Personaje personaje) throws PersonajeException;
    public void actualizarPersonaje(Personaje personaje) throws PersonajeException;
}