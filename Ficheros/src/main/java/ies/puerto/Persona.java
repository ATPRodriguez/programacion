package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Ejercicio 3: Crea una aplicación en Java para gestionar los dni´s de personas. Debes implementar una clase llamada Persona que tenga los siguientes atributos:
 *
 *     nombre (String): El nombre de la persona.
 *     ndi (String): Dni de la persona.
 *     fechaNacimiento(String): La fecha en la que se llevará a cabo el evento, en formato dd/MM/aaaa.
 *
 * Además, la clase Persona debe tener los siguientes métodos:
 *
 *     Constructores:
 *         Un constructor vacío.
 *         Un constructor con el nombre del nombre, dni y la fecha tipo String aa/MM/aaaa. Si el formato o valor es incorrecto se debe lanzar una exception (propia o genérica) indicando el error.
 *     informacion(): Un método que devuelve una cadena de texto que representa la información de la persona. Incluye el nombre dni y fecha de nacimiento.
 *     mayorEdad():  Función que determina si una persona (dados sus datos) es mayor de edad o no, es decir mayor de 18 años.
 *
 * El ejercicio debe de poseer además una clase que implemente el método main para hacer uso de la clase Persona, haciendo la llamada a los distintos constructores, y permita mostrar el correcto funcionamiento de la clase evento y todos sus métodos.
 */
public class Persona {

    private String nombre;
    private String dni;
    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String dni, String fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String informacion() {
        return "Nombre: " + nombre + ", dni: " + dni + ", fecha de nacimiento: " + fechaNacimiento;
    }

    public boolean mayorEdad() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date nacimiento = format.parse(fechaNacimiento);
        Date fechaActual = new Date();
        long edad = (fechaActual.getTime() - nacimiento.getTime()) /(1000*60*60*24)/365;
        if (edad < 18) {
            return false;
        } else {
            return true;
        }
    }
}