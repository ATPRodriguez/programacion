package ies.puerto;

import java.util.Date;

public class Ejercicio6 {
    public static void main(String[] args) {
        Date fecha1 = new Date();
        Date fecha2 = new Date();
        System.out.println(comparar(fecha1, fecha2));
    }

    public static String comparar (Date fecha1, Date fecha2) {
        if (fecha1.compareTo(fecha2) == 0) {
            return "Las fechas son las mismas";
        }
        else
            return "Las fechas son distintas";
    }
}
