package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que, dado un número de días ingresado por el usuario,
 * calcule y muestre la fecha resultante en el futuro desde la fecha actual.
 */
public class Ejercicio99 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca cuantos dias sumar a la fecha actual");
        int dias = lectura.nextInt();
        Date fechaActual = new Date();
        fechaActual.setTime(fechaActual.getTime() + ((long) dias *1000*60*60*24));
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("A partir de hoy dentro de " + dias + " dias sera: " + formato.format(fechaActual));
    }
}
