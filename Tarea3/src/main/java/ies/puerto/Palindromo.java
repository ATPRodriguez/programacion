package ies.puerto;

import java.util.Scanner;

/** 4. Escribe un programa en Java que verifique si un número es palindromo.
 * Se debe solicitar el numero por teclado.
 */
public class Palindromo {
    public static void main(String[] args) {
        int numero_original = 0;
        int numero = 0;
        int numero2 = 0;
        int multiplicador = 1;
        Scanner lectura = new Scanner (System.in);

        System.out.println("Escriba un numero para verificar si es un palindromo");
        numero_original = lectura.nextInt();
        numero = numero_original;
        while (numero > 10){
            numero/=10;
            multiplicador*=10;
        }
        numero = numero_original;
        while (numero >= 1){
            numero2 += ((numero % 10)*multiplicador);
            numero/=10;
            multiplicador/=10;
        }
        if (numero_original == numero2)
            System.out.println(numero_original+" es un palindromo");
        else
            System.out.println(numero_original+" no es un palindromo");
    }
}