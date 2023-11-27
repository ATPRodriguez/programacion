package ies.puerto;

import java.rmi.server.Operation;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Solicita al usuario ingresar una expresión matemática como texto (por ejemplo, "2 + abc") y trata de evaluarla.
 * Maneja la excepción ArithmeticException u otra excepción adecuada.
 * @author ATPRodriguez
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        int operacion = solicitarOperacion();
    }

    /**
     * Funcion que pide por teclado una operacion
     * @return operacion obtenida
     */
    public static int solicitarOperacion (){
        Scanner lectura = new Scanner(System.in);
        int operacion = 0;
        try {
            System.out.println("Introduzca un valor");
            operacion = lectura.nextInt();
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Se ha producido un inputMismatchException");
        } finally {
            lectura.close();
        }
        return operacion;
    }
}
