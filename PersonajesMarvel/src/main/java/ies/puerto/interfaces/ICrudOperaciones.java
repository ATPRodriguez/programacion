package ies.puerto.interfaces;

import ies.puerto.personaje.Personaje;

import java.util.List;

public interface ICrudOperaciones {
    List<Personaje> obtenerPersonajes();
    Personaje obtenerPersonaje(Personaje personaje);
    void agregarPersonaje(Personaje personaje);
    void eliminarPersonaje(Personaje personaje);
    void modificarPersonaje(Personaje personaje);
}
