package es.ies.puerto.logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalabraMasLarga {

    public String metodoTradicional(List<String> palabras) {
        if (palabras == null || palabras.isEmpty()) {
            return null;
        }
        String palabraMasLarga = palabras.get(0);
        for (String palabra : palabras) {
            if (palabraMasLarga.length() < palabra.length()) {
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }

    public String metodoRecursivo(List<String> palabras) {
        if (palabras == null || palabras.isEmpty()) {
            return null;
        }
        if (palabras.size() == 1) {
            return palabras.get(0);
        }
        String palabraActual = palabras.get(0);
        palabras.remove(palabras.get(0));
        String palabraMasLarga = metodoRecursivo(palabras);
        if (palabraActual.length() < palabraMasLarga.length()) {
            return palabraMasLarga;
        } else {
            return palabraActual;
        }
    }
}
