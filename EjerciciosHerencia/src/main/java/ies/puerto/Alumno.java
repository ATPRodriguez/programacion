package ies.puerto;

import ies.puerto.excepciones.ValidacionException;

public class Alumno extends Persona {
    public Alumno () {}

    public Alumno (String nombre, int edad, String dni) throws ValidacionException {
        super (nombre, edad, dni);
    }

    @Override
    public String toString() {
        return "Soy el alumno " + getNombre() + ", tengo " + getEdad() + " anios y mi dni es: " + getDni();
    }
}
