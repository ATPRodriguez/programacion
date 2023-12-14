package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;

    public Persona () {}

    public Persona (String nombre, String fechaNacimiento) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.nombre = nombre;
        this.fechaNacimiento = format.parse(fechaNacimiento);
    }

    public void calcularEdad () {
        Calendar fechaActual = Calendar.getInstance();
        long millisNacer = this.fechaNacimiento.getTime();
        long millisActual = fechaActual.getTimeInMillis();
        long edad = (Math.abs(millisActual - millisNacer) / (1000*60*60*24))/365;
        // Solo lo relaciona con los años
        System.out.println(edad);

    }

    public static void main(String[] args) throws ParseException {
        Persona persona = new Persona("Alex", "15/12/2003");
        persona.calcularEdad();
    }
}
