package ies.puerto;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Escribe un programa que cuente el número de palabras en formato Camel Case (palabras concatenadas sin espacios) en una cadena.
 * @author ATPRodriguez
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String palabras = lectura.nextLine();

        String regex = "([A-Z][a-z]+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(palabras);
        if (matcher.matches()) {
            System.out.println("La fecha es valida.");
        } else {
            System.out.println("La fecha no es valida.");
        }
    }
}
