package ies.puerto;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad = lectura.nextInt();
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted no es mayor de edad");
        }
    }
}
