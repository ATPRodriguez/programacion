package ies.puerto.app;

import ies.puerto.impl.Alumno;
import ies.puerto.impl.Profesor;

import java.text.ParseException;
import java.time.Period;

public class AppPersona {
    static Alumno alumno;
    static Profesor profesor;

    public static void main(String[] args) {
        profesor = new Profesor("Pedro", "28/05/2000", 1000f, "Matematicas");
        alumno = new Alumno("Juan", "19/02/2013", "1º CFGS");

        System.out.println(profesor.toString());
        System.out.println(alumno.toString());
    }
}
