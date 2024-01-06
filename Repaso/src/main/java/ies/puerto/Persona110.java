package ies.puerto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Agrega un atributo dni (Documento Nacional de Identidad) a la clase Persona
 * y desarrolla un método para validar si un DNI ingresado es válido.
 */
public class Persona110 {
    private String nombre = "";
    private String apellido = "";
    private int edad = 0;

    private String dni = "";

    public Persona110() {}

    public Persona110(String nombre, String apellido, int edad) {
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void informacion () {
        System.out.println("Nombre: " + nombre + ", Apellidos: " + apellido + ", Edad: " + edad);
    }

    public void mayor (Persona110 persona1) {
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
        validarDni("12345678M");
    }

    public static float promedio (Persona110[] personas) {
        float promedio = 0;
        for (int i = 0; i < personas.length; i++) {
            promedio += personas[i].getEdad();
        }
        promedio /= personas.length;
        return promedio;
    }

    public static void ordenar (Persona110[] personas) {
        boolean swapped = false;
        for (int i = 0; i < personas.length- 1; i++) {
            for (int j = 0; j < personas.length - i - 1; j++) {
                if (personas[j].getEdad() > personas[j + 1].getEdad()) {
                    Persona110 temp = personas[j];
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

    public static Persona110[] buscarNombre (String nombre, Persona110[] personas) {
        Persona110[] nombres = new Persona110[personas.length];
        int contador = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getNombre().equals(nombre)) {
                nombres[contador] = personas[i];
                contador++;
            }
        }
        Persona110[] resultado = new Persona110[contador];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = nombres[i];
        }
        return resultado;
    }

    public static void validarDni (String dni) {
        String regex = "\\d{8}[A-HJ-NP-TV-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);
        if (matcher.matches()) {
            System.out.println("El DNI es valido");
        } else {
            System.out.println("El DNI no es valido");
        }
    }
}
