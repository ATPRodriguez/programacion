package ies.puerto;

import ies.puerto.excepciones.ValidacionException;

public class AppEstudiante {

    static Persona persona;

    static {
        try {
            persona = new Persona("Pepe", 35, "12345678M");
        } catch (ValidacionException e) {
            throw new RuntimeException(e);
        }
    }

    static int[] notas = {5,6,7,8,9};
    static Estudiante estudiante;

    static {
        try {
            estudiante = new Estudiante("Pablo", 18, "12345678M", "2º Bachillerato", notas);
        } catch (ValidacionException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(estudiante.toString());
        for (int i = 0; i < estudiante.getNotas().length; i++) {
            System.out.println("He sacado un " + estudiante.getNotas()[i] + " en la asignatura " + (i+1));
        }

        System.out.println();
        System.out.println(persona.saludar());
        System.out.println();
        System.out.println(estudiante.saludar());
    }
}
