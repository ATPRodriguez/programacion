package ies.puerto;

import java.util.Scanner;

public class Ejemplo {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        int edad = 0;

        edad = 10;
        nombre = "Juan";

        Persona persona = new Persona(nombre, edad);
        System.out.println("Es mayor de edad: " + persona.mayorEdad());
    }

    public static class Persona {
        String nombre;
        int edad;
        public Persona () {}
        public Persona (String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        public boolean mayorEdad() {
            if (edad > 18) {
                return false;
            }
            return true;
        }
    }
}