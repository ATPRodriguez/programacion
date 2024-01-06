package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Haz un programa que compare dos fechas ingresadas por el usuario y determine cuál es anterior, o si son iguales.
 */
public class Ejercicio95 {
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
        if (fechaDate.getTime() < fechaDate2.getTime()) {
            System.out.println(fecha + " esta antes del " + fecha2);
        } else if (fechaDate.getTime() > fechaDate2.getTime()) {
            System.out.println(fecha + " esta despues del " + fecha2);
        } else {
            System.out.println("Ambas fechas son la misma");
        }
    }
}
