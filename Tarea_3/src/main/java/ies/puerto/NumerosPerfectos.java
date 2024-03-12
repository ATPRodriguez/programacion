package ies.puerto;

import java.util.Scanner;

/**
 * @author Alejandro Tomas
 * 8. Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for.
 * Solicita el límite por teclado.
 */
public class NumerosPerfectos {
    public static void main(String[] args) {
        int rangoInferior=0;
        int rangoSuperior=0;
        int sumaPerfecta=0;

        Scanner lectura = new Scanner(System.in);

        System.out.println ("**Advertencia: El programa no seguirá hasta que rango inferior < rango superior**");
        do{
            System.out.println ("Introduzca el rango inferior");
            rangoInferior = lectura.nextInt();
            System.out.println ("Introduzca el rango superior");
            rangoSuperior = lectura.nextInt();
        } while (rangoSuperior <= rangoInferior);

        if (rangoInferior == 0)
            rangoInferior = 1;

        for(int i=rangoInferior; i <= rangoSuperior; i++){
            sumaPerfecta = 0;
            for (int j= rangoInferior; j < i; j++){
                if (i % j == 0)
                    sumaPerfecta += j;
                if (sumaPerfecta > i)
                    break;
                if ((j == i-1) && (sumaPerfecta == i))
                    System.out.println(i);
            }
        }
    }
}