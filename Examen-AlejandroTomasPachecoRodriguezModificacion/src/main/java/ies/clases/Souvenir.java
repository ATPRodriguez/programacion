package ies.clases;

import ies.abstractas.Producto;

public class Souvenir extends Producto {

    public Souvenir() {
    }

    public Souvenir(String id) {
        super(id);
    }

    public Souvenir(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }

    @Override
    public float precioMaximo() {
        return (getPrecio()*1.3f);
    }

    @Override
    public int cantidadDisponible() {
        return getCantidad();
    }

    @Override
    public String toString() {
        return "Producto:" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fechaEntrada='" + getFechaEntrada() + '\'' +
                ", id='" + getId() + '\'';
    }
}
