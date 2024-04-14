package es.ies.puerto.modelo.personaje;

import es.ies.puerto.modelo.utilidades.Utilidades;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Personaje extends Utilidades {
    private int id;
    private String nombre;
    private String alias;
    private String genero;
    private Set<String> poderes;

    public Personaje(){
        poderes = new HashSet<>();
    }

    public Personaje(int id) {
        this.id = id;
    }

    public Personaje(int id, String nombre, String alias, String genero, Set<String> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id='" + id + '\'' +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje character = (Personaje) o;
        return Objects.equals(id, character.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}