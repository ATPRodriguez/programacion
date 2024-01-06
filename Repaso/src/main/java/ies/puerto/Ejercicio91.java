package ies.puerto;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Escribe un programa que muestre la fecha actual en el formato "dd/MM/yyyy".
 */
public class Ejercicio91 {
    public static void main(String[] args) {
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formato.format(fechaActual));
    }
}
