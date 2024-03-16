package ies.puerto;

/**
 * Desarrolla un método para ordenar un array de objetos Persona por edad, de menor a mayor.
 */
public class Persona108 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    public Persona108() {}

    public Persona108(String nombre, String apellido, int edad) {
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

    public void mayor (Persona108 persona1) {
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
        Persona108[] personas = {new Persona108("Alejandro", "Pacheco", 20), new Persona108("Pedro", "Rodriguez", 23), new Persona108("Pancho", "Diaz", 13)};
        ordenar(personas);
        for (int i = 0; i < personas.length; i++) {
            personas[i].informacion();
        }
    }

    public static float promedio (Persona108[] personas) {
        float promedio = 0;
        for (int i = 0; i < personas.length; i++) {
            promedio += personas[i].getEdad();
        }
        promedio /= personas.length;
        return promedio;
    }

    public static void ordenar (Persona108[] personas) {
        boolean swapped = false;
        for (int i = 0; i < personas.length- 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona108 temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
