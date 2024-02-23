package ies.clases;

import ies.abstractas.Producto;

public class Aparato extends Producto {

    public Aparato() {
    }

    public Aparato(String id) {
        super(id);
    }

    public Aparato(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }

    @Override
    public float precioMaximo() {
        return (getPrecio()*1.42f);
    }

    @Override
    public int cantidadDisponible() {
        return getCantidad();
    }

    @Override
    public String toString() {
        return "Aparato:" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fechaEntrada='" + getFechaEntrada() + '\'' +
                ", id='" + getId() + '\'';
    }
}
