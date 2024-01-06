package ies.puerto;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca el precio (sin IGIC) de un producto");
        float precio = lectura.nextFloat();
        float precioTotal = precio + (precio * 0.07f);
        System.out.println("El precio final del producto es: " + precioTotal);
    }
}
