package ies.puerto;

/**
 * Haz un método que calcule el promedio de edad de un grupo de personas.
 */
public class Persona106 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    public Persona106() {}

    public Persona106(String nombre, String apellido, int edad) {
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

    public void mayor (Persona106 persona1) {
        if (edad > persona1.edad) {
            System.out.println(nombre + " es mayor que " + persona1.nombre);
        } else if (edad < persona1.edad) {
            System.out.println(nombre + " es menor que " + persona1.nombre);
        } else {
            System.out.println("Ambos tienen la misma edad");
        }
    }

    public static void main(String[] args) {
        Persona106[] personas = {new Persona106("Alejandro", "Pacheco", 20), new Persona106("Pedro", "Rodriguez", 23), new Persona106("Pancho", "Diaz", 42)};
        System.out.println("El grupo tiene un promedio de " + promedio(personas) + " anios");
    }

    public static float promedio (Persona106[] personas) {
        float promedio = 0;
        for (int i = 0; i < personas.length; i++) {
            promedio += personas[i].getEdad();
        }
        promedio /= personas.length;
        return promedio;
    }
}
