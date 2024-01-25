package ies.puerto.ejercicios.uno;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    static List<Integer> listaNumerosPares;
    static List<Integer> listaNumerosImpares;

    public static void main(String[] args) {
        listaNumerosPares = new ArrayList<>();
        listaNumerosImpares = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if (esNumeroPar(i)) {
                listaNumerosPares.add(i);
            } else {
                listaNumerosImpares.add(i);
            }
        }

        System.out.println(listaNumerosPares);
        System.out.println("Tamanio: " + listaNumerosPares.size());
        System.out.println();

        System.out.println(listaNumerosImpares);
        System.out.println("Tamanio " + listaNumerosImpares.size());
    }

    /**
     * Funcion que verifica si un numero es par
     * @param numero numero que verificar
     * @return true o false si es o no par
     */
    public static boolean esNumeroPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        return false;
    }
}
