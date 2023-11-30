package ies.puerto;

import java.util.Scanner;

/**
 * Crea una excepción personalizada llamada NumeroNegativoException que se lance cuando un método recibe un número negativo como argumento.
 * Luego, implementa una clase que contenga un método que acepte un número y lance esta excepción si es negativo.
 * @author ATPRodriguez
 */
public class Ejercicio9 {

    public static void main(String[] args) throws NumeroNegativoException {
        Scanner lectura = new Scanner(System.in);
        int numero = lectura.nextInt();
        esNegativo(numero);
    }

    public static boolean esNegativo(int numero) throws NumeroNegativoException{
        if (numero < 0) {
            throw new NumeroNegativoException("El numero" + numero + "es negativo");
        }
        return true;
    }
}
