package ies.puerto;

import java.util.Calendar;

public class Ejercicio7 {
    public static void main(String[] args) {
        Calendar calendario1 = Calendar.getInstance();
        Calendar calendario2 = Calendar.getInstance();
        calendario2.set(Calendar.DAY_OF_MONTH, 30);

        long fin = calendario2.getTimeInMillis();
        long inicio = calendario1.getTimeInMillis();
        int dias = (int) (Math.abs(fin - inicio))/(24*60*60*1000);
        System.out.println("La diferencia es de: " + dias + " dias.");
    }



}
