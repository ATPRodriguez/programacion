package ies.puerto;

import java.util.Scanner;

/** 3. Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.
 * (0 1 1 2 3 5 8 13 21 34 55...)
 */
public class PosicionFibonacci {
    public static void main(String[] args) {

        int posicion = 0;
        int solucion = 0;
        int numero1 = 0;
        int numero2 = 1;
        int apoyo = 0;

        Scanner lectura = new Scanner (System.in);

        System.out.println("El numero de la secuencia de Fibonacci que quiero saber esta en la posición:");
        posicion = lectura.nextInt();

        if (posicion == 0)
            System.out.println("El número en dicha posición ("+posicion+") es: "+numero1);
        else if (posicion == 1) {
            System.out.println("El número en dicha posición ("+posicion+") es: "+numero2);
        } else {
            for (int i = 1; i <= (posicion - 1); i++) {
                solucion = (numero1 + numero2);
                apoyo = numero2;
                numero2 = apoyo + numero1;
                numero1 = apoyo;
            }
            System.out.println("El número en dicha posición(" + (posicion) + ") es: " + solucion);
        }
    }
}