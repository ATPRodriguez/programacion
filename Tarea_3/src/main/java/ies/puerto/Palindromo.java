package ies.puerto;

import java.util.Scanner;

/**
 * @author Alejandro Tomas
 * 4. Escribe un programa en Java que verifique si un número es palindromo.
 * Se debe solicitar el numero por teclado.
 */
public class Palindromo {
    public static void main(String[] args) {
        int numeroOriginal = 0;
        int numero = 0;
        int numero2 = 0;
        int multiplicador = 1;
        Scanner lectura = new Scanner (System.in);

        System.out.println("Escriba un numero para verificar si es un palindromo");
        numeroOriginal = lectura.nextInt();
        numero = numeroOriginal;
        while (numero > 10){
            numero/=10;
            multiplicador*=10;
        }
        numero = numeroOriginal;
        while (numero >= 1){
            numero2 += ((numero % 10)*multiplicador);
            numero/=10;
            multiplicador/=10;
        }
        if (numeroOriginal == numero2)
            System.out.println(numeroOriginal+" es un palindromo");
        else
            System.out.println(numeroOriginal+" no es un palindromo");
    }
}