package ies.puerto;

/**
 * Crea una clase Alumno que haga uso (extends) de la clase Alumno.
 * @author ATPRodriguez
 */
public class Alumno extends Persona {
    public Alumno () {}

    public Alumno (String nombre, int edad, String dni) {
        super (nombre, edad, dni);
    }

    @Override
    public String toString() {
        return "Soy el alumno " + getNombre() + ", tengo " + getEdad() + " anios y mi dni es: " + getDni();

    }
}
