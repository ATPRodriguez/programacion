package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que calcule y muestre cuántos días han pasado
 * desde una fecha ingresada por el usuario hasta la fecha actual.
 */
public class Ejercicio92 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una fecha");
        String fecha = lectura.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = new Date();
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException exception) {
            System.out.println("Introduzca la fecha en formatoo dd/MM/yyyy");
        }

        Date fechaActual = new Date();
        long diferenciaDias = Math.abs((fechaActual.getTime() - fechaDate.getTime())/(1000*60*60*24));
        System.out.println("Entre ambas fechas hay una diferencia de " + diferenciaDias + " dias");
    }
}
