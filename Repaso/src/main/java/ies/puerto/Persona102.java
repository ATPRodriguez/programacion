package ies.puerto;

/**
 * Añade métodos en la clase Persona para establecer y obtener el nombre, apellido y edad. (Gettes/Setters).
 * Implementa el método main para verificar que funciona correctamente.
 */
public class Persona102 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    public Persona102 () {}

    public Persona102(String nombre, String apellido, int edad) {
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

    public static void main(String[] args) {
        Persona102 persona = new Persona102("Alejandro", "Pacheco", 20);
        persona.setNombre("Pedro");
        persona.setApellido("Rodriguez");
        persona.setEdad(23);
        System.out.println(persona.getNombre() + " " + persona.getApellido() + " tiene " + persona.getEdad());
    }
}
