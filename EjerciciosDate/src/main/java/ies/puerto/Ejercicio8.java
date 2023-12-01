package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Implementar un programa que parsee una cadena en formato "dd-MM-yyyy" a un objeto Date utilizando SimpleDateFormat.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese una fecha de forma dd-MM-yyyy");
        String fecha = lectura.nextLine();

        DateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

        try {
            formato.parse(fecha);
        } catch (ParseException e) {
            System.out.println("Hubo un problema en el parse");
        }
    }
}
