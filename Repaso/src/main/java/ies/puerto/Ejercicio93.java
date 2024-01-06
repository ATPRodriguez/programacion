package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *  Crea un programa que determine el día de la semana de una fecha ingresada por el usuario
 *  (por ejemplo, lunes, martes, etc.).
 */
public class Ejercicio93 {
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
        switch (calendar.get(Calendar.DAY_OF_WEEK) -1) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            default:
                System.out.println("Es domingo");
                break;
        }
    }
}
