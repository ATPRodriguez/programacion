package ies.puerto;

/**
 * Haz un programa que calcule el promedio de las notas almacenadas en un array de decimales.
 */
public class Ejercicio84 {
    public static void main(String[] args) {
        float[] notas = {3f, 4f, 6f, 5f, 9.5f};
        calcularPromedio(notas);
    }

    public static void calcularPromedio (float[] notas) {
        float promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio+= notas[i];
        }
        promedio/= notas.length;
        System.out.println("El promedio de las notas almacenadas es: " + promedio);
    }
}
