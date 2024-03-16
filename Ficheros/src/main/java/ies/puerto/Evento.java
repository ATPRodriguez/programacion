package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Ejercicio 2: Crea una aplicación en Java para gestionar eventos. Debes implementar una clase llamada Evento que tenga los siguientes atributos:
 *
 *     nombre (String): El nombre del evento.
 *     fecha (String): La fecha en la que se llevará a cabo el evento, en formato dd/MM/aaaa.
 *
 * Además, la clase Evento debe tener los siguientes métodos:
 *
 *     Constructores:
 *         Un constructor vacío.
 *         Un constructor con el nombre del evento, y la fecha tipo String aa/MM/aaaa. Si el formato o valor es incorrecto se debe lanzar una exception (propia o genérica) indicando el error.
 *         Un constructor con el nombre del evento y que calcule la fecha del evento, a partir de la cual, asigne la fecha del evento sumando un mes más a la fecha actual.
 *         Se debe verificar en los últimos constructores que el nombre del evento no es superior a 20 caracteres. Si fuera superior se debe lanzar una exception (propia o genérica) indicando el error..
 *     informacion(): Un método que devuelve una cadena de texto que representa la información del evento. Incluye el nombre del evento y la fecha formateada (dd/MM/aaaa).
 *     eventoProximo():  Un evento se considera próximo si su fecha está dentro de los próximos 7 días siguientes a la fecha actual.
 *
 * El ejercicio debe de poseer además una clase que implemente el método main para hacer uso de la clase Evento, haciendo la llamada a los distintos constructores, y permita mostrar el correcto funcionamiento de la clase evento y todos sus métodos.
 */
public class Evento {
    private String nombre = "";
    private String fecha = "";

    public Evento() {}

    public Evento(String nombre) {
        this.nombre = nombre;
        Date fecha = new Date();
        fecha.setMonth(fecha.getMonth() + 1);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.fecha = format.format(fecha);
    }
    public Evento(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String informacion() {
        return ("Nombre: " + this.nombre + ", fecha: " + this.fecha);
    }

    public boolean estaProximo() throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaEvento = format.parse(fecha);
        Date fechaActual = new Date();
        long proximo = ((Math.abs(fechaEvento.getTime() - fechaActual.getTime()))/(1000*60*60*24));
        if (proximo < 7 && proximo > 0) {
            return true;
        }
        return false;
    }
}