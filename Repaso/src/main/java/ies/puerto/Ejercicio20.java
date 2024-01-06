package ies.puerto;

/**
 * Crea un programa que declare dos variables booleanas,
 * representando por ejemplo si está lloviendo y si es de noche,
 * y luego utilice operadores lógicos para determinar si se debe encender una lámpara.
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        boolean noche = true;
        boolean lloviendo = false;
        if ((noche) || (lloviendo)) {
            System.out.println("Se debe encender una lampara");
        } else {
            System.out.println("No se debe encender una lampara");
        }
    }
}
