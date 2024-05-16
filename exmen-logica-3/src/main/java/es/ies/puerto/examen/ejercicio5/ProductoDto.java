package es.ies.puerto.examen.ejercicio5;

public class ProductoDto {
    String id;
    String nombre;
    long precio;

    public ProductoDto() {
    }

    public ProductoDto(String id) {
        this.id = id;
    }

    public ProductoDto(String id, String nombre, long precio) {
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
}
