package ies.puerto;

/**
 * Escribe un método en la clase Persona para comparar la edad de dos personas y determinar cuál es mayor.
 * Implementa el método main para verificar que funciona correctamente.
 */
public class Persona104 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    public Persona104() {}

    public Persona104(String nombre, String apellido, int edad) {
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

    public void mayor (Persona104 persona1) {
        if (edad > persona1.edad) {
            System.out.println(nombre + " es mayor que " + persona1.nombre);
        } else if (edad < persona1.edad) {
            System.out.println(nombre + " es menor que " + persona1.nombre);
        } else {
            System.out.println("Ambos tienen la misma edad");
        }
    }

    public static void main(String[] args) {
        Persona104 persona1 = new Persona104("Alejandro", "Pacheco", 20);
        Persona104 persona2 = new Persona104("Pedro", "Rodriguez", 23);
        persona1.mayor(persona2);
    }
}
