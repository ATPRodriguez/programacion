package es.ies.puerto.ejercicio.tres;

import java.util.HashMap;
import java.util.Map;

public class HechiceroBienHecho {

    public char vocalMasPoderosa(String texto) {
        char vocal = ' ';
        Map<Character, Integer> letras = new HashMap<>();
        letras.put('a',0);
        letras.put('e',0);
        letras.put('i',0);
        letras.put('o',0);
        letras.put('u',0);
        for (int i = 0; i < texto.length(); i++) {
            if (letras.containsKey(texto.charAt(i))) {
                //letras.put(texto.charAt(i), );
            }
        }
        return vocal;
    }
}
