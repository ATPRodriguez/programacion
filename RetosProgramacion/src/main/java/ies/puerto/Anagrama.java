package ies.puerto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrama {
    public static void main(String[] args) {
        String palabra1 = "orvito";
        String palabra2 = "loghito";
        String palabra3 = "ootivr";

        System.out.println(anagrama(palabra1, palabra1));
        System.out.println(anagrama(palabra1, palabra2));
        System.out.println(anagrama(palabra1, palabra3));
    }

    public static boolean anagrama (String palabra, String palabra2) {
        boolean resultado = false;
        if (palabra.equals(palabra2)) {
            return resultado;
        }
        if (palabra.length() != palabra2.length()) {
            return resultado;
        }
        char[] palabra1Array = palabra.toLowerCase().toCharArray();
        char[] palabra2Array = palabra2.toLowerCase().toCharArray();

        Arrays.sort(palabra1Array);
        Arrays.sort(palabra2Array);

        return Arrays.equals(palabra1Array, palabra2Array);
    }
}
