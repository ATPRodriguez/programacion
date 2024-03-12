package ies.puerto;

/**
 * Crea una clase Persona con atributos como nombre, apellido y edad. Proporciona un constructor para inicializar estos atributos.
 * Implementa el método main para verificar que funciona correctamente.
 */
public class Persona101 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    public Persona101 () {}

    public Persona101(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Persona101 persona = new Persona101("Alejandro", "Pacheco", 20);
    }
}
