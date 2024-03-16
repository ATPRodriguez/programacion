package ies.puerto;

import java.util.Scanner;

/**
 * 8. Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for.
 * Solicita el límite por teclado.
 */
public class NumerosPerfectos {
    public static void main(String[] args) {
        int rango_inferior=0;
        int rango_superior=0;
        int suma_perfecta=0;

        Scanner lectura = new Scanner(System.in);

        System.out.println ("**Advertencia: El programa no seguirá hasta que rango inferior < rango superior**");
        do{
            System.out.println ("Introduzca el rango inferior");
            rango_inferior = lectura.nextInt();
            System.out.println ("Introduzca el rango superior");
            rango_superior = lectura.nextInt();
        } while (rango_superior <= rango_inferior);
        if (rango_inferior == 0)
            rango_inferior = 1;
        for(int i=rango_inferior; i <= rango_superior; i++){
            suma_perfecta = 0;
            for (int j= rango_inferior; j < i; j++){
                if (i % j == 0)
                    suma_perfecta += j;
                if (suma_perfecta > i)
                    break;
                if ((j == i-1) && (suma_perfecta == i))
                    System.out.println(i);
            }
        }
    }
}