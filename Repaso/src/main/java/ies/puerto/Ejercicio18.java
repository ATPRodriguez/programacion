package ies.puerto;

/**
 * Escribe un programa que declare una variable double y otra int,
 * luego realiza una conversión explícita de double a int y muestre el resultado.
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        double decimal = 4.1234567890;
        int entero = 0;
        entero = (int) decimal;
        System.out.println("El decimal: " + decimal + " se convierte en el entero: " + entero);
    }
}
