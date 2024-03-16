package ies.puerto.ejercicios.tres;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppAula {
    static Aula dam1;
    static List<Alumno> alumnos;
    static Alumno alumno1;
    static Alumno alumno2;

    public static void main(String[] args) {
        dam1 = new Aula("1Dam");
        alumno1 = new Alumno("nombre1", "apellido1", Arrays.asList(1f,5f,7f,8f));
        alumno2 = new Alumno("nombre2", "apellido2", Arrays.asList(10f,7f,8f));
        alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        dam1.setAlumnos(alumnos);

        System.out.println("Media aula: " + dam1.media());
    }
}
