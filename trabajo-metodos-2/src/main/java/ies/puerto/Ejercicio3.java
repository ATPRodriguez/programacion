package ies.puerto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Realiza un programa que contenga los suficientes métodos para: pedir 5 números, mostrar los 5 números,
 * muestra la suma y los muestra en orden creciente y en orden decreciente.
 */
public class Ejercicio3 {

    /**
     * Ejercicio que muestra los numeros dados
     *
     * @param numero1
     * @param numero2
     * @param numero3
     * @param numero4
     * @param numero5
     */
    public String mostrarNumeros(int numero1, int numero2, int numero3, int numero4, int numero5) {
        String resultado = (numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " " + numero5);
        return resultado;
    }

    /**
     * Ejercicio que muestra la suma de los numeros dados
     *
     * @param numero1
     * @param numero2
     * @param numero3
     * @param numero4
     * @param numero5
     */
    public int mostrarSumaNumeros(int numero1, int numero2, int numero3, int numero4, int numero5) {
        int suma = numero1 + numero2 + numero3 + numero4 + numero5;
        return suma;
    }

    public int primeroNumeros(int numero1, int numero2){
        int mayor = numero1;
        if (numero2 > numero1)
            mayor = numero2;
        return mayor;
    }

    public int primeroNumeros (int numero1, int numero2, int numero3){
        return primeroNumeros(primeroNumeros(numero1, numero2),numero3);
    }

    public int primeroNumeros (int numero1, int numero2, int numero3, int numero4){
        return primeroNumeros(primeroNumeros(numero1, numero2, numero3), numero4);
    }

    public int primeroNumeros (int numero1, int numero2, int numero3, int numero4, int numero5){
        return primeroNumeros(primeroNumeros(numero1, numero2, numero3, numero4), numero5);
    }

    public int ultimoNumeros(int numero1, int numero2){
        int mayor = numero1;
        if (numero2 < numero1)
            mayor = numero2;
        return mayor;
    }

    public int ultimoNumeros (int numero1, int numero2, int numero3){
        return ultimoNumeros(ultimoNumeros(numero1, numero2),numero3);
    }

    public int ultimoNumeros (int numero1, int numero2, int numero3, int numero4){
        return ultimoNumeros(ultimoNumeros(numero1, numero2, numero3), numero4);
    }

    public int ultimoNumeros (int numero1, int numero2, int numero3, int numero4, int numero5){
        return ultimoNumeros(ultimoNumeros(numero1, numero2, numero3, numero4), numero5);
    }

    public int terceroNumeros(int numero1, int numero2, int numero3){
        int tercero = numero1;
        if ( numero2 < primeroNumeros(numero1, numero3) && numero2 > ultimoNumeros(numero1, numero3))
            tercero = numero2;
        else if (numero3 < primeroNumeros(numero1, numero2) && numero3 > ultimoNumeros(numero2, numero3)) {
            tercero = numero3;
        }
        return tercero;
    }

    public int terceroNumeros(int numero1, int numero2, int numero3, int numero4, int numero5){
        return terceroNumeros(terceroNumeros(numero1,numero2,numero3),numero4, numero5);
    }

    public int segundoNumeros (int numero1, int numero2, int numero3, int numero4, int numero5){
        int segundo = numero1;
        if ((numero2 < primeroNumeros(numero1,numero2,numero3,numero4,numero5)) && (numero2 > terceroNumeros(numero1,numero2,numero3,numero4,numero5)))
            segundo = numero2;
        else if ((numero3 < primeroNumeros(numero1,numero2,numero3,numero4,numero5)) && (numero3 > terceroNumeros(numero1,numero2,numero3,numero4,numero5)))
            segundo = numero3;
        else if ((numero4 < primeroNumeros(numero1,numero2,numero3,numero4,numero5)) && (numero4 > terceroNumeros(numero1,numero2,numero3,numero4,numero5)))
            segundo = numero4;
        else if ((numero5 < primeroNumeros(numero1,numero2,numero3,numero4,numero5)) && (numero5 > terceroNumeros(numero1,numero2,numero3,numero4,numero5)))
            segundo = numero5;
        return segundo;
    }

    public int cuartoNumeros (int numero1, int numero2, int numero3, int numero4, int numero5){
        int segundo = numero1;
        if ((numero2 < terceroNumeros(numero1,numero2,numero3,numero4,numero5)) && (numero2 > ultimoNumeros(numero1,numero2,numero3,numero4,numero5)))
            segundo = numero2;
        else if ((numero3 < terceroNumeros(numero1,numero2,numero3,numero4,numero5)) && (numero3 > ultimoNumeros(numero1,numero2,numero3,numero4,numero5)))
            segundo = numero3;
        else if ((numero4 < terceroNumeros(numero1,numero2,numero3,numero4,numero5)) && (numero4 > ultimoNumeros(numero1,numero2,numero3,numero4,numero5)))
            segundo = numero4;
        else if ((numero5 < terceroNumeros(numero1,numero2,numero3,numero4,numero5)) && (numero5 > ultimoNumeros(numero1,numero2,numero3,numero4,numero5)))
            segundo = numero5;
        return segundo;
    }
    public String mostrarNumerosCreciente(int numero1, int numero2, int numero3, int numero4, int numero5) {
        int primero = primeroNumeros(numero1,numero2,numero3,numero4,numero5);
        int segundo = segundoNumeros(numero1,numero2,numero3,numero4,numero5);
        int tercero = terceroNumeros(numero1,numero2,numero3,numero4,numero5);
        int cuarto = cuartoNumeros(numero1,numero2,numero3,numero4,numero5);
        int quinto = ultimoNumeros(numero1, numero2, numero3, numero4, numero5);
        String resultado = (primero + " " + segundo + " " + tercero + " " + cuarto + " " + quinto);
        return resultado;
    }
}