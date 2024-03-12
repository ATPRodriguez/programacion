package ies.puerto;

import java.util.Scanner;

/**
 * @author Alejandro Tomas
 * 10. Calcular la suma de todos los números pares entre 1 y un número ingresado
 *  por el usuario utilizando un bucle do-while.
 */
public class SumaPares {
    public static void main(String[] args) {

        int numero= 0;
        int suma = 0;
        int i=0;
        Scanner lectura = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        numero = lectura.nextInt();

        do{
            if (i % 2 == 0){
                suma += i;
            }
            i++;
        } while (i<=numero);
        System.out.println("La suma de todos los pares anteriores a "+numero+" es:"+suma);
    }
}