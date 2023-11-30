package ies.puerto;

import java.util.Calendar;

public class Ejercicio3 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        System.out.println("Año: " + calendario.get(Calendar.YEAR) + ", mes: " + calendario.get(Calendar.MONTH) + ", dia: " + calendario.get(Calendar.DAY_OF_MONTH));
    }
}
