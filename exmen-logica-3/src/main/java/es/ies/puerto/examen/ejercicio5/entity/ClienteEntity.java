package es.ies.puerto.examen.ejercicio5.entity;

import java.util.Objects;

public class ClienteEntity {

    private String dni;
    private String nombre;
    private String email;
    DireccionEntity direccionEntity;
    ProductoEntity productoEntity;

    public ClienteEntity() {
    }

    public ClienteEntity(String dni) {
        this.dni = dni;
    }

    public ClienteEntity(String dni, String nombre, String email, DireccionEntity direccionEntity, ProductoEntity productoEntity) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.direccionEntity = direccionEntity;
        this.productoEntity = productoEntity;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DireccionEntity getDireccionEntity() {
        return direccionEntity;
    }

    public void setDireccionEntity(DireccionEntity direccionEntity) {
        this.direccionEntity = direccionEntity;
    }

    public ProductoEntity getProductoEntity() {
        return productoEntity;
    }

    public void setProductoEntity(ProductoEntity productoEntity) {
        this.productoEntity = productoEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity cliente = (ClienteEntity) o;
        return Objects.equals(dni, cliente.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
