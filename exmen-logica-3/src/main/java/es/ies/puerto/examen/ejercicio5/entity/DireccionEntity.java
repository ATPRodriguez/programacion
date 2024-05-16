package es.ies.puerto.examen.ejercicio5.entity;

import java.util.Objects;

public class DireccionEntity {
    int numero;
    int provincia;
    String calle;
    String ciudad;

    public DireccionEntity() {
    }

    public DireccionEntity(int numero) {
        this.numero = numero;
    }

    public DireccionEntity(int numero, int provincia, String calle, String ciudad) {
        this.numero = numero;
        this.provincia = provincia;
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getProvincia() {
        return provincia;
    }

    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DireccionEntity that = (DireccionEntity) o;
        return numero == that.numero && provincia == that.provincia && Objects.equals(calle, that.calle) && Objects.equals(ciudad, that.ciudad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero, provincia, calle, ciudad);
    }

    @Override
    public String toString() {
        return numero +
                "," + provincia +
                "," + calle +
                "," + ciudad;
    }
}
