package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        float[] notas = new float[5];
        pedirDatos(notas);
        mostrarArray(notas);

    }

    /**
     * Ejercicio que pide las notas del alumno al usuario
     * @param notas del alumno
     */
    public static void pedirDatos(float[] notas) {
        Scanner lectura = new Scanner(System.in);
        int i = 0;
        float temporal = 0;
            do {
                System.out.println("Introduce el valor " + (i + 1));
                temporal = lectura.nextFloat();
                if ((temporal >= 0) && (temporal <= 10)){
                    notas[i] = temporal;
                    i++;
                }
            } while (i < notas.length);
    }
    /**
     * Ejercicio que calcula la notaMedia
     * @param notas del alumno
     * @return media del alumno
     */
    public static float notaMedia (float[] notas) {
        float media = 0;
        float suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        media = suma / notas.length;
        return media;
    }

    /**
     * Ejercicio que muestra las notas del alumno
     * @param notas del alumno
     */
    public static void mostrarArray (float[] notas) {
            for (int i = 0; i < notas.length; i++) {
                System.out.println(notas[i]);
            }
    }

    /**
     * Ejercicio que calcula la nota mas alta
     * @param notas del alumno
     * @return nota mas alta
     */
    public static float maximoNotas (float[] notas) {
        float maximo = notas[0];
        for (int i = 1; i < notas.length; i++){
            if (notas[i] > maximo)
                maximo = notas[i];
        }
        return maximo;
    }

    /**
     * Ejercicio que calcula la nota mas pequeña
     * @param notas del alumno
     * @return nota mas pequeña
     */
    public static float menorNotas (float[] notas) {
        float menor = notas[0];
        for (int i = 1; i < notas.length; i++){
            if (notas[i] < menor)
                menor = notas[i];
        }
        return menor;
    }
}
