package ies.puerto;

/**
 * Programa main para probar los constructores y metodos de la clase Persona y Alumno
 * @author ATPRodriguez
 */
public class AppAlumno {
    static Persona persona = new Persona("Pepe", 35, "12345678M");
    static Alumno alumno = new Alumno("Pedro", 23, "87654321G");

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
