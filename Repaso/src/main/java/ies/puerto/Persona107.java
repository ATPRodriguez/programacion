package ies.puerto;

/**
 * Añade un método en la clase Persona para actualizar la edad de una persona
 * y muestre un mensaje indicando si es mayor de edad o no (por ejemplo, si tiene 18 años o más).
 */
public class Persona107 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    public Persona107() {}

    public Persona107(String nombre, String apellido, int edad) {
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

    public void mayor (Persona107 persona1) {
        if (edad > persona1.edad) {
            System.out.println(nombre + " es mayor que " + persona1.nombre);
        } else if (edad < persona1.edad) {
            System.out.println(nombre + " es menor que " + persona1.nombre);
        } else {
            System.out.println("Ambos tienen la misma edad");
        }
    }

    public void actualizarEdad (int edad) {
        this.edad = edad;
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }
    }

    public static void main(String[] args) {
        Persona107 persona = new Persona107("Alejandro", "Pacheco", 16);
        persona.actualizarEdad(20);
    }

    public static float promedio (Persona107[] personas) {
        float promedio = 0;
        for (int i = 0; i < personas.length; i++) {
            promedio += personas[i].getEdad();
        }
        promedio /= personas.length;
        return promedio;
    }
}
