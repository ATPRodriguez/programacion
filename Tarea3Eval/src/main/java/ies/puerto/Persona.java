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

    public String obtenerSignoZodiacal () {
        int fecha = (int) (this.fechaNacimiento.getTime()* 1000 * 60 * 60 *24)/365;
        switch (fecha) {
            case 20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49:
                return "Acuario";
            default:
                return "Capricornio";
        }
    }

    public static void main(String[] args) throws ParseException {
        Persona persona = new Persona("Alex", "02/02/2003");
        persona.calcularEdad();
        System.out.println(persona.obtenerSignoZodiacal());
    }
}
