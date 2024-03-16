package ies.puerto;

/**
 * Haz un programa que utilice una constante para representar el valor de PI (3.14159265)
 * y calcule el área de un círculo.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        final double pi = Math.PI;
        float radio = 4;
        System.out.println("El area de un circulo con radio " + radio + " es " + (pi*(radio*radio)));
    }
}
