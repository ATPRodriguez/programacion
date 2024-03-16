package ies.puerto;

import java.util.Calendar;

/**
 * Crear un programa que obtenga y muestre el primer día del mes actual utilizando la clase Calendar.
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.DAY_OF_MONTH, 1);
        System.out.println("El primer dia del mes es:" + calendario.getActualMinimum(Calendar.DAY_OF_MONTH));
    }
}
