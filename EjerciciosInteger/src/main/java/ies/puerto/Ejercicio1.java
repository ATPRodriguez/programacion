package ies.puerto;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Crea un programa que tome un número entero como entrada y verifique si es par o impar utilizando los métodos de la clase Integer.
 * Controla las exception que pudiera generar.
 * @author ATPRodriguez
 */
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);
        Integer numero = 0;
        try {
            numero = lectura.nextInt();
        } catch (InputMismatchException exception) {
            throw new Exception("No se ha introducido un numero");
        }
        if (numero % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
    }
}