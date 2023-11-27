package ies.puerto;

import java.util.Locale;

/**
 * Crea un programa que intente acceder a un método de un objeto que es null.
 * Por ejemplo un String.
 * Maneja la excepción NullPointerException.
 * @author ATPRodriguez
 */
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        String string = "";
        try {
            string.getBytes();
        } catch (NullPointerException exception) {
            throw new Exception("Se ha producido un NullPointerException");
        }
    }
}

