package ies.puerto;

import java.util.Calendar;

public class Ejercicio4 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        calendario.set(Calendar.DAY_OF_MONTH, calendario.get(Calendar.DAY_OF_MONTH) + 10);
        escribirCalendario(calendario);
    }

    public static void escribirCalendario(Calendar calendario) {
        System.out.println("Año: " + calendario.get(Calendar.YEAR) + ", mes: " + (calendario.get(Calendar.MONTH) + 1) + ", dia: " + calendario.get(Calendar.DAY_OF_MONTH));
    }
}
