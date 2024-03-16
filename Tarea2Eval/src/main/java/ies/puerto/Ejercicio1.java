package ies.puerto;

/**
 * Implementa un programa que invierta una cadena de texto dada.
 * La cadena debe de tener al menos 10 caracteres no vacíos. Puntuación 1 punto.
 * (Con test que verifique el comportamiento 1,25)
 * @author ATPRodriguez
 */
public class Ejercicio1 {
    public String invertirCadena(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length()-1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }
}