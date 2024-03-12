package ies.puerto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {
    String dni;
    String nombre;
    String apellido1;
    String apellido2;
    List<Double>calificaciones;

    public Persona () {}

    public Persona(String dni, String nombre, String apellido1, String apellido2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        calificaciones = new ArrayList<>();
    }

    public Persona(String dni, String nombre, String apellido1, String apellido2, List<Double> calificaciones) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.calificaciones = calificaciones;
    }

    public double mediaCalificaciones (){
        Double resultado = 0d;
        Double suma = 0d;
        if (calificaciones.isEmpty())
            return resultado;
        for (Double nota: calificaciones) {
            suma += nota;
        }
        resultado = suma / calificaciones.size();

        return resultado;
    }

    @Override
    public String toString() {
        return  "{dni:" + dni + ", nombre:" + nombre + ", apellido1:" + apellido1 + ", apellido2:" + apellido2 +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }
}
