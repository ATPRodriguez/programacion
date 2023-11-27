package ies.puerto;

import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario dos números e imprima el resultado de la división.
 * Asegúrate de manejar la excepción ArithmeticException si el segundo número ingresado es 0.
 * @author ATPRodriguez
 */
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        int numero1 = solicitarNumero();
        int numero2 = solicitarNumero();
        int resultado = division(numero1,numero2);
        System.out.println("Resultado de la division:"+resultado);
    }

    /**
     * Funcion que divide dos valores
     * @param dividendo de la operacion
     * @param divisor de la operacion
     * @return resultado de la operacion
     */
    public static int division (int dividendo, int divisor) throws Exception {
        int resultado = 0;
        try {
            resultado = dividendo/divisor;
        } catch (ArithmeticException arithmeticException) {
            String mensajeError = "Se intenta realizar una division por 0";
            System.out.println("Mensaje del println "+mensajeError);
            throw new Exception(mensajeError);
        }
        return resultado;
    }

    /**
     * Funcion que pide por teclado un numero
     * @return numero obtenido
     */
    public static int solicitarNumero (){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca un valor");
        return lectura.nextInt();
    }
}
