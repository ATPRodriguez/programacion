package ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class AppAnimal {
    static List<Animal> animales;

    static List<Fecha> fechas;

    public static void main(String[] args) {
        String fecha1 = "22/01/24";
        Animal mario = new Gato ("Mario", 12345678);
        animales = new ArrayList<>();
        fechas = new ArrayList<>();

        if(!animales.contains(mario)) {
            animales.add(mario);
        }

        //System.out.println(animales);

        for (Animal animal:animales) {
            System.out.println(animal);
        }
    }
}
