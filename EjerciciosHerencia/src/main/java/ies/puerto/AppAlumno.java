package ies.puerto;

import ies.puerto.excepciones.ValidacionException;

public class AppAlumno {
    static Persona persona;
    static Alumno alumno;

    public static void main(String[] args) throws ValidacionException {
        alumno = new Alumno("Pedro", 23, "87654321G");
        persona = new Persona("Pepe", 35, "12345678M");


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
