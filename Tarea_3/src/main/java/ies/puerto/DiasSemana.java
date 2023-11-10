package ies.puerto;

import java.util.Scanner;

/**
 * @author Alejandro Tomas
 * 7. Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
 *    El día a verificar se debe de pedir por teclado.
 */
public class DiasSemana {
    public static void main(String[] args) {

        int numero = 0;

        Scanner lectura = new Scanner(System.in);

        System.out.println("Introduzca el numero para saber a qué dia de la semana pertenece:");
        numero = lectura.nextInt();

        while (numero > 7){
            numero-=7;
        }
        switch (numero) {
            case 1:
                System.out.println("El día indicado es lunes");
                break;
            case 2:
                System.out.println("El día indicado es martes");
                break;
            case 3:
                System.out.println("El día indicado es miercoles");
                break;
            case 4:
                System.out.println("El día indicado es jueves");
                break;
            case 5:
                System.out.println("El día indicado es viernes");
                break;
            case 6:
                System.out.println("El día indicado es sabado");
                break;
            case 7:
                System.out.println("El día indicado es domingo");
                break;
        }
    }
}