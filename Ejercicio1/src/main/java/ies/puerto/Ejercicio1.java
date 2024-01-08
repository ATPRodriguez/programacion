package ies.puerto;

import java.util.Arrays;

/**
 * Implementa el algoritmo de búsqueda binaria para encontrar la posición de un elemento en un array ordenado.
 * La búsqueda binaria es un algoritmo de búsqueda eficiente que sigue estos pasos:
 *     Inicio y Fin:
 *         Inicia con el array ordenado y establece un índice de inicio y fin.
 *     Punto Medio:
 *         Calcula el índice del punto medio entre el inicio y el fin.
 *     Comparación:
 *         Compara el valor buscado con el elemento en el punto medio.
 *             Si son iguales, se ha encontrado el elemento y se devuelve su posición.
 *             Si el valor buscado es menor, repite la búsqueda en la mitad izquierda.
 *             Si el valor buscado es mayor, repite la búsqueda en la mitad derecha.
 *     Repetición:
 *         Repite los pasos 2 y 3 hasta encontrar el elemento o hasta que el índice de inicio sea mayor que el índice de fin.
 */
public class Ejercicio1 {

    /**
     * Ejercicio que realiza la busqueda binaria
     * @param array donde realizar la busqueda
     * @param elemento a buscar
     * @return posicion del elemento
     */
    public int busquedaBinaria (int[] array, int elemento){
        boolean encontrado = false;
        int inicio = 0;
        int fin = array.length-1;
        int puntoMedio = 0;

        while (inicio <= fin) {
            puntoMedio = (inicio + fin) / 2;
            if (array[puntoMedio] == elemento) {
                return puntoMedio;
            }
            else if (array[puntoMedio] < elemento) {
                inicio = puntoMedio + 1;
            } else {
                fin = puntoMedio - 1;
            }
        }
        return -1;
    }
}