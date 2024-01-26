package ies.puerto.ejercicios.cuatro;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    static List<Integer> listaEnteros1;
    static List<Integer> listaEnteros2;

    public static void main(String[] args) {
        listaEnteros1 = new ArrayList<>();
        listaEnteros2 = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            if (esNumeroPar(i)) {
                listaEnteros1.add(i);
            } else {
                listaEnteros2.add(i);
            }
        }

        System.out.println("Lista 1: " + listaEnteros1);
        System.out.println("Lista 2: "+ listaEnteros2);
        System.out.println();

        System.out.println("Tienen un elemento en comun?");
        System.out.println(elementoComun(listaEnteros1, listaEnteros2));
        System.out.println();

        listaEnteros2.add(2);

        System.out.println("Lista 1: " + listaEnteros1);
        System.out.println("Lista 2: "+ listaEnteros2);
        System.out.println();

        System.out.println("Y ahora?");
        System.out.println(elementoComunRecursivo(listaEnteros1, listaEnteros2));
    }

    /**
     * Funcion que verifica que exita un elemento comun entre dos listas de enteros
     * @param lista1 de enteros
     * @param lista2 de enteros
     * @return true o false si existe un elemento comun entre ambas listas
     */
    public static boolean elementoComun (List<Integer> lista1, List<Integer> lista2) {
        for (Integer elemento:listaMayor(lista1, lista2)) {
            if (listaMenor(lista1, lista2).contains(elemento)){
                return true;
            }
        }
        return false;
    }

    /**
     * Funcion que verifica que exita un elemento comun entre dos listas de enteros mediante recursividad
     * @param lista1 de enteros
     * @param lista2 de enteros
     * @return true o false si existe un elemento comun entre ambas listas
     */
    public static boolean elementoComunRecursivo (List<Integer> lista1, List<Integer> lista2) {
        if (lista2.size() > lista1.size()) {
            return elementoComunRecursivo(lista2, lista1);
        }

        for (Integer elemento:lista1) {
            if (lista2.contains(elemento)){
                return true;
            }
        }
        return false;
    }

    /**
     * Comprueba que lista tiene mayor tamanio entre dos
     * @param lista1 a comprobar
     * @param lista2 a comprobar
     * @return lista con mayor tamanio
     */
    public static List<Integer> listaMayor (List<Integer> lista1, List<Integer> lista2) {
        if (lista1.size() > lista2.size()) {
            return lista1;
        } else {
            return lista2;
        }
    }

    /**
     * Comprueba que lista tiene menor tamanio entre dos
     * @param lista1 a comprobar
     * @param lista2 a comprobar
     * @return lista con menor tamanio
     */
    public static List<Integer> listaMenor (List<Integer> lista1, List<Integer> lista2) {
        if (lista1.size() < lista2.size()) {
            return lista1;
        } else {
            return lista2;
        }
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
