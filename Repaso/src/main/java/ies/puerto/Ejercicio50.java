package ies.puerto;

import java.util.Scanner;

public class Ejercicio50 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un anio");
        int anio = lectura.nextInt();
        comprobarBisiesto(anio);
    }

    public static void comprobarBisiesto (int anio) {
        if (((anio % 4 == 0) && (anio % 100 != 0)) || (anio % 400 == 0)) {
            System.out.println(anio + " es un anio bisiesto");
        } else {
            System.out.println(anio + " no es un anio bisiesto");
        }
    }
}
