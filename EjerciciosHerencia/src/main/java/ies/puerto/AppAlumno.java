package ies.puerto;

import ies.puerto.excepciones.ValidacionException;

/**
 * Programa main para probar los constructores y metodos de la clase Persona y Alumno
 * @author ATPRodriguez
 */
public class AppAlumno {
    static Persona persona;

    static {
        try {
            persona = new Persona("Pepe", 35, "12345678M");
        } catch (ValidacionException e) {
            throw new RuntimeException(e);
        }
    }

    static Alumno alumno;

    static {
        try {
            alumno = new Alumno("Pedro", 23, "87654321G");
        } catch (ValidacionException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        System.out.println(persona.toString());
        persona.setNombre("Jesus");
        persona.setEdad(40);
        persona.setDni("11223344M");
        System.out.println("Ahora " + persona.toString());

        System.out.println();

        System.out.println (alumno.toString());
        alumno.setNombre("Alejandro");
        alumno.setEdad(20);
        alumno.setDni("44332211G");
        System.out.println("Ahora " + alumno.toString());

    }
}
