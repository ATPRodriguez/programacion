package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.entities.Personaje;

import java.util.List;

public interface ICrudDb {
    public List<Personaje> obtenerPersonajes();
    public Personaje obtenerPersonaje (Personaje personaje);
    public void agregarPersonaje (Personaje personaje);
    public void eliminarPersonaje (Personaje personaje);
    public void actualizarPersonaje (Personaje personaje);
}