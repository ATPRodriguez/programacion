package es.iespuerto.productos;

import es.iespuerto.abstractas.Producto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Electronica extends Producto {

    public Electronica() {
    }

    public Electronica(String udi) {
        super(udi);
    }

    public Electronica(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        return (getPrecio() * 0.6f);
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "Electronica:" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fechaEntrada='" + getFechaEntrada() + '\'' +
                ", udi='" + getUdi() + '\'';
    }
}
