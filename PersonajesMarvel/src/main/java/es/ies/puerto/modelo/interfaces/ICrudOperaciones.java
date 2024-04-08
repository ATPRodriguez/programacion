package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.personaje.Personaje;

import java.util.List;

public interface ICrudOperaciones {
    List<Personaje> obtenerPersonajes();
    Personaje obtenerPersonaje(Personaje personaje);
    void agregarPersonaje(Personaje personaje);
    void eliminarPersonaje(Personaje personaje);
    void modificarPersonaje(Personaje personaje);
    void cargarBackup();
}
