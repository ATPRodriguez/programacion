package ies.puerto.ejercicios.dos.cinco;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class OperacionesArrayList {
    static List<String> listaCadenas;
    static List<Integer> listaEnteros;

    public static void main(String[] args) {
        listaEnteros = new ArrayList<>();
        listaCadenas = new ArrayList<>();
        int contador = 0;

        listaCadenas.add("No comienzo por A");
        listaCadenas.add("Tampoco comienzo por A");
        listaCadenas.add("A veces comienzo por A");
        listaCadenas.add("Adios mundo cruel");
        listaCadenas.add("El profe de programacion es el mejor");
        listaCadenas.add("Le vamos a traer una caja de dulces");
        listaCadenas.add("Angelo trae la caja de dulces");

        for (String cadena:listaCadenas) {
            if (comienzaPorA(cadena)){
                contador++;
            }
        }

        System.out.println(listaCadenas);
        System.out.println("Numero cadenas que empiezan por 'A': " + contador);
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            listaEnteros.add(i);
        }

        System.out.println("Lista de enteros: " + listaEnteros);
        System.out.println("Pares de esa lista: " + listaPares(listaEnteros));
    }

    /**
     * Funcion que devuelve los numeros pares existentes en una lista de enteros dada
     * @param listaEnteros de los que sacar los pares
     * @return pares de la lista dada
     */
    public static List<Integer> listaPares (List<Integer> listaEnteros) {
        List<Integer> listaPares = new ArrayList<>();

        for (Integer elemento:listaEnteros) {
            if (esNumeroPar(elemento)) {
                listaPares.add(elemento);
            }
        }
        return listaPares;
    }

    /**
     * Funcion que verifica si una cadena empieza por A
     * @param cadena a verificar
     * @return true o false si la cadena dada empieza por A
     */
    public static boolean comienzaPorA (String cadena) {
        String regex = "^[Aa].*";
        return  Pattern.matches(regex, cadena);
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
