package ies.puerto;

import java.util.Calendar;

public class Ejercicio5 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.MONTH, calendario.get(Calendar.MONTH) - 2);
        escribirCalendario(calendario);
    }

    public static void escribirCalendario(Calendar calendario) {
        System.out.println("Año: " + calendario.get(Calendar.YEAR) + ", mes: " + (calendario.get(Calendar.MONTH) + 1) + ", dia: " + calendario.get(Calendar.DAY_OF_MONTH));
    }
}
