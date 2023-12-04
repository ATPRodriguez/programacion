package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Desarrolla un programa que extraiga todos los números de teléfono válidos (con formato +XX-XXX-XX-XX-XX) de una cadena dada.
 * (Combina lo aprendido).
 * @author ATPRodriguez
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String telefono = lectura.nextLine();

        String regex = "(^\\+[0-9]{2})-([0-9]{3})-([0-9]{2})-([0-9]{2})-([0-9]{2}$)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(telefono);

        if (matcher.matches()) {
            System.out.println("El numero de telefono es valido.");
        } else {
            System.out.println("El numero de telefono no es valido.");
        }
    }
}
