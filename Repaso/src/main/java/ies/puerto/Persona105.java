package ies.puerto;

/**
 * Crea un array de objetos Persona y llena la lista con varias instancias.
 * Luego, muestra la información de todas las personas.
 */
public class Persona105 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    public Persona105() {}

    public Persona105(String nombre, String apellido, int edad) {
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

    public void mayor (Persona105 persona1) {
        if (edad > persona1.edad) {
            System.out.println(nombre + " es mayor que " + persona1.nombre);
        } else if (edad < persona1.edad) {
            System.out.println(nombre + " es menor que " + persona1.nombre);
        } else {
            System.out.println("Ambos tienen la misma edad");
        }
    }

    public static void main(String[] args) {
        Persona105[] personas = {new Persona105("Alejandro", "Pacheco", 20), new Persona105("Pedro", "Rodriguez", 23), new Persona105("Pancho", "Diaz", 42)};
        for (int i = 0; i < personas.length; i++) {
            personas[i].informacion();
        }
    }
}
