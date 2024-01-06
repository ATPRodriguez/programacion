package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que, dado un mes y año ingresados por el usuario,
 * calcule y muestre cuántos días faltan hasta el final del mes.
 */
public class Ejercicio94 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una fecha en formato dd/MM/yyyy");
        String fecha = lectura.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = new Date();
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException exception) {
            System.out.println("Use el formato dd/MM/yyyy");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaDate);
        int finDeMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int diaActual = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Quedan " + (finDeMes-diaActual) + " para fin de mes");
    }
}
