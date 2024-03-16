package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Implementa un validador que verifique si una cadena sigue el formato de fecha común (por ejemplo, DD/MM/AAAA).
 * @author ATPRodriguez
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String fecha = lectura.nextLine();

        String regex = "(^[0-9]{2})/([0-9]{2})/([0-9]{4}$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(fecha);
        if (matcher.matches()) {
            System.out.println("El formato de la fecha es valido.");
        } else {
            System.out.println("El formato de la fecha no es valido.");
        }
    }
}
