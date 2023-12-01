package ies.puerto;

import java.util.Calendar;

/**
 * Desarrollar un programa que verifique si la fecha actual es un sábado o domingo utilizando la clase Calendar y muestre un mensaje apropiado.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Calendar calendario1 = Calendar.getInstance();
        if (verificarSabDom(calendario1)) {
            System.out.println("Hoy es Sabado o Domingo");
        } else {
            System.out.println("Hoy no es Sabado o Domingo");
        }
    }

    public static boolean verificarSabDom (Calendar calendario1) {
        if (calendario1.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || calendario1.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            return true;
        } else {
            return false;
        }
    }
}
