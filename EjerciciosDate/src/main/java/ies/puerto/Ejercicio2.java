package ies.puerto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio2 {
    public static void main(String[] args) {
        Date fecha = new Date();
        SimpleDateFormat formato= new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fechaFormateada = formato.format(fecha);
        System.out.println(fechaFormateada);
    }
}
