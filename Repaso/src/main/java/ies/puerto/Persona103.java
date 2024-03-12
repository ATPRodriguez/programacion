package ies.puerto;

/**
 * Desarrolla un método en la clase Persona para mostrar toda la información de una persona (nombre, apellido y edad).
 * Implementa el método main para verificar que funciona correctamente.
 */
public class Persona103 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    public Persona103() {}

    public Persona103(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void informacion () {
        System.out.println("Nombre: " + nombre + ", Apellidos: " + apellido + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        Persona103 persona = new Persona103("Alejandro", "Pacheco", 20);
        persona.setNombre("Pedro");
        persona.setApellido("Rodriguez");
        persona.setEdad(23);
        persona.informacion();
    }
}
