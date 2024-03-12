package ies.puerto.ejercicios.seis;

import ies.puerto.ejercicios.tres.Alumno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio6 {
    static Curso dam1;
    static Alumno alumno1;
    static Alumno alumno2;
    static List<Alumno> alumnos;

    public static void main(String[] args) {
        dam1 = new Curso();
        alumno1 = new Alumno("nombre1", "apellido1", Arrays.asList(1f,5f,7f,8f));
        alumno2 = new Alumno("nombre2", "apellido2", Arrays.asList(10f,7f,8f));
        alumnos = new ArrayList<>();
        dam1.agregarAlumnos(alumnos);
        System.out.println(dam1);
    }
}
