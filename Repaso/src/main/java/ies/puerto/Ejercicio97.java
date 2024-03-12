package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Crea un programa que solicite al usuario ingresar su fecha de nacimiento
 * y muestre su edad exacta en años, meses y días.
 */
public class Ejercicio97 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca su fecha de nacimiento en formato dd/MM/yyyy");
        String fecha = lectura.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = new Date();

        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException exception) {
            System.out.println("Use el formato dd/MM/yyyy");
        }

        Date fechaActual = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaDate);

        long actual = fechaActual.getTime();
        long nacimiento = calendar.getTimeInMillis();

        long diferencia = Math.abs(actual - nacimiento) / (24 * 60 * 60 * 1000);

        long dias = diferencia % 30;
        long meses = (diferencia % 365) / 30;
        long anios = diferencia / 365;

        System.out.println("Usted tiene " + anios + " anios, " + meses + " meses y " + dias + " dias");
    }
}
