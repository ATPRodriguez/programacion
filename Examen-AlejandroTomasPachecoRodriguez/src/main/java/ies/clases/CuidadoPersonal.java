package ies.clases;

import ies.abstractas.ProductoRecomendable;

public class CuidadoPersonal extends ProductoRecomendable {

    public CuidadoPersonal() {
    }

    public CuidadoPersonal(String id) {
        super(id);
    }

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
    }

    public CuidadoPersonal(String nombre, float precio, String fechaEntrada, String id, int popularidad) {
        super(nombre, precio, fechaEntrada, id, popularidad);
    }


    @Override
    public float precioMaximo() {
        return (getPrecio()*1.8f);
    }

    @Override
    public int cantidadDisponible() {
        return getCantidad();
    }

    @Override
    public String toString() {
        return "Cuidado Personal:" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fechaEntrada='" + getFechaEntrada() + '\'' +
                ", id='" + getId() + '\'';
    }
}
