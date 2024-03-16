package ies.puerto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Desarrolla un programa que permita al usuario ingresar una fecha y un número de días,
 * y calcule la fecha resultante después de sumar esos días.
 */
public class Ejercicio96 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una fecha en formato dd/MM/yyyy");
        String fecha = lectura.nextLine();
        System.out.println("Introduzca cuantos dias sumar a la fecha");
        int dias = lectura.nextInt();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = new Date();
        try {
            fechaDate = formato.parse(fecha);
        } catch (ParseException exception) {
            System.out.println("Use el formato dd/MM/yyyy");
        }
        fechaDate.setTime(fechaDate.getTime() + ((long) dias *24*60*60*1000));
        System.out.println(fecha + " despues de " + dias + " dias sera:" + formato.format(fechaDate));
    }
}
