package es.ies.puerto.file.cuatro;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;
import java.util.Objects;

@Root (name = "pokemon")
public class Pokemon {
    @Element (name = "id", required = false)
    private String id;
    @Element (name = "nombre", required = false)
    private String nombre;
    @ElementList(name = "tipos", required = false)
    private List<String> tipos;
    @Element (name = "descripcion", required = false)
    private String descripcion;

    public Pokemon() {
    }

    public Pokemon(String id) {
        this.id = id;
    }

    public Pokemon(String id, String nombre, List<String> tipos, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.tipos = tipos;
        this.descripcion = descripcion;
    }

    // Constructor, getters y setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getTipos() {
        return tipos;
    }

    public void setTipos(List<String> tipos) {
        this.tipos = tipos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(id, pokemon.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipos=" + tipos +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
