package ies.puerto;

import java.util.Scanner;

/**
 * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc") y trata de evaluarla.
 * Maneja la excepción ArithmeticException u otra excepción adecuada.
 * @author ATPRodriguez
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        String operacion = solicitarOperacion();

    }

    /**
     * Funcion que pide por teclado una operacion
     * @return operacion obtenida
     */
    public static String solicitarOperacion (){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un valor");
        return lectura.nextLine();
    }
}
