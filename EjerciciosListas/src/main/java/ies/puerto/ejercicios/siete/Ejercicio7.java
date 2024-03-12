package ies.puerto.ejercicios.siete;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio7 {
    static List<String> lista;

    public static void main(String[] args) {
        lista = new ArrayList<>(Arrays.asList("uno", "dos", "leche", "agua", "dos", "leche"));
        System.out.println("Lista sin duplicados: " + eliminarCadenasDuplicadas(lista));
    }

    /**
     * Funcion que devuelve una lista sin duplicados dada otra lista
     * @param lista de cadenas con o sin duplicados
     * @return lista con cadenas de la otra lista sin duplicar
     */
    public static List<String> eliminarCadenasDuplicadas(List<String> lista) {
        List<String> resultado = new ArrayList<>();
        for (String cadena:lista) {
            if(!resultado.contains(cadena)) {
                resultado.add(cadena);
            }
        }
        return resultado;
    }
}
