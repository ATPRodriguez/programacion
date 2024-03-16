package es.ies.puerto.examen.logica.cuatro;

public class Pergamino {

    Pergamino() {

    }
    Object[] analizador(String texto) {
        Object[] resultado = new Object[4];
        if (texto.isEmpty()) {
            resultado[0] = 0;
            resultado[1] = 0;
            resultado[2] = 0;
            resultado[3] = null;
            return resultado;
        }
        String[] palabras = texto.split(" ");
        String [] oraciones = texto.split("\\.");
        double mediaLongitudPalabras = 0;
        int totalLetras = 0;
        int contadorOraciones = oraciones.length;
        String palabraMasLarga = palabras[0];
        for (String palabra : palabras) {
            totalLetras += palabra.length();
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        mediaLongitudPalabras = (double) totalLetras / palabras.length;
        resultado[0] = palabras.length;
        resultado[1] = mediaLongitudPalabras;
        resultado[2] = contadorOraciones;
        resultado[3] = palabraMasLarga;
        return resultado;
    }
}
