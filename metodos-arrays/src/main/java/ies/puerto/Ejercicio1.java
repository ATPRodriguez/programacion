package ies.puerto;

/**
 * Programa que calcula la suma de todos los elementos en un array de enteros.
 * @author ATPRodriguez
 */
public class Ejercicio1 {
    /**
     * Ejercicio que calcula la suma de un array de enteros
     * @param numeros del array
     * @return suma de todos los elementos del array
     */
    public int calcularSuma(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    /**
     * Ejercicio que muestra el resultado de la suma anterior
     * @param suma realizada previamente
     * @return "La suma de los elementos es:" + resultado de la suma del metodo anterior
     */
    public String mostrarSuma (int suma) {
        String resultado;
        resultado = "La suma de los elementos es:"+suma;
        return resultado;
    }
}