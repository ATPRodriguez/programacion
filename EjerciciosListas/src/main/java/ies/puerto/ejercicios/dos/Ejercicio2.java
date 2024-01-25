package ies.puerto.ejercicios.dos;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Ejercicio2 {
    static List<String> listaCadenas;

    public static void main(String[] args) {
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
    }

    public static boolean comienzaPorA (String cadena) {
        String regex = "^[Aa].*";
        return  Pattern.matches(regex, cadena);
    }
}
