package ies.puerto.presentacion;

import java.util.Objects;

public class Personaje {
    private String id;
    private String nombre;
    private String papel;
    private String habilidad;

    public Personaje(String id, String nombre, String papel, String habilidad) {
        this.id = id;
        this.nombre = nombre;
        this.papel = papel;
        this.habilidad = habilidad;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", papel='" + papel + '\'' +
                ", habilidad='" + habilidad + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje personaje = (Personaje) o;
        return Objects.equals(id, personaje.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
