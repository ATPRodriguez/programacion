package ies.clases;

import ies.abstractas.ProductoFresco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimento extends ProductoFresco {

    public Alimento(String id) {
        super(id);
    }

    public Alimento(String id, String fechaCaducidad) {
        super(id, fechaCaducidad);
    }

    public Alimento(String nombre, float precio, String fechaEntrada, String id, String fechaCaducidad) {
        super(nombre, precio, fechaEntrada, id, fechaCaducidad);
    }

    @Override
    public int diasHastaCaducidad() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaCaducidad = new Date();
        Date fechaEntrada = new Date();
        try {
             fechaCaducidad = format.parse(getFechaCaducidad());
             fechaEntrada = format.parse(getFechaEntrada());
        } catch (ParseException exception) {
            System.out.println("El formato de caducidad/entrada del alimento introducido no sigue el patron yyyy-MM-dd");
        }
        long diferencia = fechaCaducidad.getTime() - fechaEntrada.getTime();
        diferencia = diferencia / (1000 * 60 * 60 * 24);
        return (int) diferencia;
    }

    @Override
    public boolean caducado() {
        if (diasHastaCaducidad() > 0) {
            return false;
        }
        return true;
    }

    @Override
    public float precioMaximo() {
        return (getPrecio()*1.35f);
    }

    @Override
    public int cantidadDisponible() {
        return getCantidad();
    }

    @Override
    public String toString() {
        return "Alimento:" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fechaEntrada='" + getFechaEntrada() + '\'' +
                ", id='" + getId() + '\'' +
                ", fecha caducidad='" + getFechaCaducidad() + '\'';
    }
}
