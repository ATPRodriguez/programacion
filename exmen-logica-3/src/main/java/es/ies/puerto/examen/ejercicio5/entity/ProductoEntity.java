package es.ies.puerto.examen.ejercicio5.entity;

import java.util.Objects;

public class ProductoEntity {

    String id;
    String nombre;
    long precio;

    public ProductoEntity() {
    }

    public ProductoEntity(String id) {
        this.id = id;
    }

    public ProductoEntity(String id, String nombre, long precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

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

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductoEntity producto = (ProductoEntity) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
