package ies.puerto.abstrac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class PersonaAbstract {
    private String nombre;
    private String fechaNacimiento;

    public PersonaAbstract() {
    }

    public PersonaAbstract(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int anios () throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaActual = new Date();
        fechaActual = formato.parse(formato.format(fechaActual));
        Date nacimiento = formato.parse(fechaNacimiento);
        long diferencia = (nacimiento.getTime() - fechaActual.getTime()) / (1000L*60*60*24*365);
        return Math.abs((int) diferencia);
    }
}