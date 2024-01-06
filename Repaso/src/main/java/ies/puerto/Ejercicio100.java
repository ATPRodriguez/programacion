package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Haz un programa que determine si una fecha ingresada por el usuario corresponde a un día festivo específico
 * (por ejemplo, Navidad o Año Nuevo) y muestre un mensaje adecuado.
 */
public class Ejercicio100 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una fecha en formato dd/MM/yyyy");
        String fecha = lectura.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = new Date();

        try {
            fechaDate = formato.parse(fecha);
        } catch (
                ParseException exception) {
            System.out.println("Use el formato dd/MM/yyyy");
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaDate);
        if (calendar.get(Calendar.MONTH) + 1 == 1) {
            if (calendar.get(Calendar.DAY_OF_MONTH) == 1) {
                System.out.println("Feliz Anio Nuevo");
            }
        } else if (calendar.get(Calendar.MONTH) + 1 == 12) {
            if (calendar.get(Calendar.DAY_OF_MONTH) == 25){
                System.out.println("Feliz Navidad");
            }
        }
    }
}

