package ies.puerto;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Crea un programa que valide si una cadena es una dirección de correo electrónico válida utilizando expresiones regulares.
 * @author ATPRodriguez
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String correo = lectura.nextLine();

        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);

        if (matcher.matches()) {
            System.out.println("La dirección de correo electrónico es válida.");
        } else {
            System.out.println("La dirección de correo electrónico no es válida.");
        }
    }
}