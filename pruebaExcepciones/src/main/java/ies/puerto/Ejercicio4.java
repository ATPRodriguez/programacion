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
        String vacio = null;
        try {
            int tamanioTexto = vacio.length();
            System.out.println("La longitud del string es: " + tamanioTexto);
        } catch (NullPointerException exception) {
            System.out.println("Se ha producido un NullPointerException");
        }
    }
}

