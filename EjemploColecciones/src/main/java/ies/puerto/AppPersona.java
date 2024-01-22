package ies.puerto;

import java.util.ArrayList;
import java.util.List;

public class AppPersona {
    static Persona ramon;
    static Persona juan;
    static String dni1 = "00000000T";
    static String dni2 = "11111111H";
    static List<Persona> personas;

    public static void main(String[] args) {
        ramon = new Persona(dni1,"Ramon", "Gonzalez", "Perez");
        juan = new Persona(dni2, "Juan", "Gonzalez", "Perez");

        personas = new ArrayList<>();
        personas.add(ramon);
        personas.add(juan);

        System.out.println(personas);

        Persona ramon2 = new Persona(dni1, "Ramon", "Gonzalez", "Perez");
        if (personas.contains(ramon2)) {
            System.out.println("La lista contiene a " + ramon);
        }
        System.out.println(ramon.mediaCalificaciones());
    }
}
