package ies.puerto;

import java.util.Scanner;

/**
 * Crea un método que acepte un número y maneja la excepción IllegalArgumentException si el número es negativo
 * @author ATPRodriguez
 */
public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        int numero = solicitarNumero();
        try {
            if (numero < 0) ;
        } catch (IllegalArgumentException exception) {
            throw new Exception("Se ha entregado un numero negativo");
        }
    }

    /**
     * Funcion que pide por teclado un numero
     *
     * @return numero obtenido
     */
    public static int solicitarNumero() {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un valor");
        return lectura.nextInt();
    }
}
