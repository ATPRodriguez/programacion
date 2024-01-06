package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que calcule y muestre el número de días entre dos fechas ingresadas por el usuario.
 */
public class Ejercicio98 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una fecha en formato dd/MM/yyyy");
        String fecha = lectura.nextLine();
        System.out.println("Introduzca otra fecha con el mismo formato");
        String fecha2 = lectura.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = new Date();
        Date fechaDate2 = new Date();
        try {
            fechaDate = formato.parse(fecha);
            fechaDate2 = formato.parse(fecha2);
        } catch (ParseException exception) {
            System.out.println("Use el formato dd/MM/yyyy");
        }
        System.out.println("La diferencia de dias entre ambas fechas es de " + (Math.abs(fechaDate.getTime() - fechaDate2.getTime()) / (24 * 60 * 60 * 1000)) + " dias");
    }
}
