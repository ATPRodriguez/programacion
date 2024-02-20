package es.iespuerto.productos;

import es.iespuerto.abstractas.Producto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Alimento extends Producto {

    public Alimento() {
    }

    public Alimento(String udi) {
        super(udi);
    }

    public Alimento(String nombre, float precio, String fechaEntrada, String udi) {
        super(nombre, precio, fechaEntrada, udi);
    }

    @Override
    public float precioMaximo() {
        return (getPrecio() * 0.23f);
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    public int diasDisponibles() {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        Date fechaEntrada = new Date();
        try {
            fechaEntrada = formato.parse(getFechaEntrada());
        } catch (ParseException exception) {
            System.out.println("Hubo un fallo con la fecha de entrada, no está en formato dd-MM-yyyy");
        }
        long diferenciaMilisecs = Math.abs(fechaActual.getTime() - fechaEntrada.getTime());
        return (int) (diferenciaMilisecs / (1000 * 60 * 60 * 24));
    }

    public boolean caducado () {
        if (diasDisponibles() > 30) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Alimento:" +
                "nombre='" + getNombre() + '\'' +
                ", precio=" + getPrecio() +
                ", fechaEntrada='" + getFechaEntrada() + '\'' +
                ", udi='" + getUdi() + '\'';
    }
}
