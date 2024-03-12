package ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class AppListaString {
    static List<String> miListaString;

    public static void main(String[] args) {
        String dni1 = "00000000H";
        String dni2 = "11111111H";
        miListaString = new ArrayList<>();

        miListaString.add(dni1);
        miListaString.add(dni2);

        System.out.println(miListaString);

        if (existeElemento(dni1))
            System.out.println("Existe el elemento " + dni1 + ", en la lista: " + miListaString);
        if (!existeElemento("1234"));
        System.out.println("No existe el elemento 1234 en la lista: " + miListaString);
    }

    public static boolean existeElemento(String elemento){
        return miListaString.contains(elemento);
    }
}
