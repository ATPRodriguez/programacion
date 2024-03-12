package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario dos números y realice la división.
 * Maneja la excepción InputMismatchException si el usuario ingresa algo que no es un número.
 * @author ATPRodriguez
 */
public class Ejercicio8 {
    public static void main(String[] args) throws NombreInvalidoException {
        Scanner lectura = new Scanner(System.in);
        float numero1;
        float numero2;
        float resultado = 0;
        try {
             numero1 = solicitarNumero(lectura);
             numero2 = solicitarNumero(lectura);
             resultado = dividir(numero1, numero2);
             System.out.println("El resultado de la division es " + resultado);
        } catch (InputMismatchException exception) {
            System.out.println("Uno de los valores introducidos no es un numero");
        } finally {
            lectura.close();
        }
    }
    public static float dividir (float numero1, float numero2) {
        if (numero2 == 0)
            throw new ArithmeticException("No se puede dividir por 0");
        return numero1 / numero2;
    }

    /**
     * Funcion que pide por teclado un numero
     * @return numero obtenido
     */
    public static float solicitarNumero (Scanner lectura){
        System.out.println("Introduzca un valor");
        return lectura.nextFloat();
    }
}
