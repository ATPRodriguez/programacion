package ies.puerto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AppListaInteger {
    static List<Integer> miListaEnteros;
    static List<Integer> sublista;

    public static void main(String[] args) {
        miListaEnteros = new ArrayList<>();
        sublista = new ArrayList<>();

        addElemento(1);
        addElemento(2);

        sublista.add(3);
        sublista.add(4);
        addSublista(sublista);

        System.out.println(miListaEnteros);
    }

    public static boolean addElemento(Integer elemento) {
        return miListaEnteros.add(elemento);
    }

    public static boolean removeElemento(Integer elemento){
        return miListaEnteros.remove(elemento);
    }

    public static boolean addSublista (Collection sublista){
        return miListaEnteros.addAll(sublista);
    }
}