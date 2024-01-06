package ies.puerto;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca dos numeros");
        int numero1 = lectura.nextInt();
        int numero2 = lectura.nextInt();
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
    }
}
