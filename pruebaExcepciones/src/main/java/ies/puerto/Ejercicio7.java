package ies.puerto;

import java.util.Scanner;

/**
 * Crea un método que acepte un número y maneja la excepción IllegalArgumentException si el número es negativo
 * @author ATPRodriguez
 */
public class Ejercicio7 {
    public static void main(String[] args) throws NumeroNegativoException {
        int numero = solicitarNumero();
        if (esPositivo(numero)) {
            System.out.println("El numero " + numero + ", es positivo");
        }
    }

    /**
     * Funcion que pide por teclado un numero
     * @return numero obtenido
     */
    public static int solicitarNumero() {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Introduzca un valor ");
        return lectura.nextInt();
    }

    public static boolean esPositivo(int numero) throws NumeroNegativoException{
        if (numero < 0) {
            throw new NumeroNegativoException("El numero " + numero + " es negativo");
        }
        return true;
    }
}
