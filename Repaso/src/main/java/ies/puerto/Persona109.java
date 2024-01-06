package ies.puerto;

import java.util.Objects;

/**
 * Escribe un método que reciba un nombre como parámetro y devuelva una lista de todas las personas con ese nombre.
 */
public class Persona109 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    public Persona109() {}

    public Persona109(String nombre, String apellido, int edad) {
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

    public void mayor (Persona109 persona1) {
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
        Persona109[] personas = {new Persona109("Alejandro", "Pacheco", 20), new Persona109("Pedro", "Rodriguez", 23), new Persona109("Pedro", "Diaz", 13)};
        Persona109[] pedros = buscarNombre("Pedro", personas);
        for (int i = 0; i < pedros.length; i++) {
            pedros[i].informacion();
        }
    }

    public static float promedio (Persona109[] personas) {
        float promedio = 0;
        for (int i = 0; i < personas.length; i++) {
            promedio += personas[i].getEdad();
        }
        promedio /= personas.length;
        return promedio;
    }

    public static void ordenar (Persona109[] personas) {
        boolean swapped = false;
        for (int i = 0; i < personas.length- 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona109 temp = personas[j];
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

    public static Persona109[] buscarNombre (String nombre, Persona109[] personas) {
        Persona109[] nombres = new Persona109[personas.length];
        int contador = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(nombre)) {
                nombres[contador] = personas[i];
                contador++;
            }
        }
        Persona109[] resultado = new Persona109[contador];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = nombres[i];
        }
        return resultado;
    }
}
