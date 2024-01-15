package ies.puerto;

import ies.puerto.acceso.Autenticacion;
import ies.puerto.excepciones.ValidacionException;

/**
 * Crea una clase Persona con atributos como nombre, edad y dni. Añade métodos para obtener y establecer los valores de los atributos.
 * @author ATPRodriguez
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;

    private final Autenticacion autenticacion = new Autenticacion();

    public  Persona () {}

    public Persona(String nombre, int edad, String dni) throws ValidacionException {
        if (autenticacion.validarNombre(nombre) && autenticacion.validarDni(dni)) {
            this.nombre = nombre;
            this.edad = edad;
            this.dni = dni;
        } else {
            throw new ValidacionException("El nombre o el dni no es valido, no se ha podido construir la persona");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (autenticacion.validarNombre(nombre))
            this.nombre = nombre;
        else
            System.out.println("El nombre no es valido, no se ha podido hacer set");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws ValidacionException {
        if (autenticacion.validarDni(dni))
            this.dni = dni;
        else
            throw new ValidacionException("Dni no es valido");
    }

    public String saludar() {
        return "La persona " + getNombre() + " te saluda";
    }

    @Override
    public String toString() {
        return "Soy la persona " + nombre + ", tengo " + edad + " anios y mi dni es: " + dni;
    }
}
