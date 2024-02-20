package ies.puerto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppPersona {

    static HashMap<String, Persona> personaHashMap;
    static List<Persona> personaList;

    public static void main(String[] args) {
        personaHashMap = new HashMap<>();
        personaList = new ArrayList<>();

        Persona persona = new Persona("Carlos","11111111A");
        addPersonaLista(persona);
        addPersonaHashMap(persona);
    }

    public static boolean addPersonaLista (Persona persona) {
        if (existePersonaLista(persona)) {
            return false;
        }
        return personaList.add(persona);
    }

    public static boolean existePersonaLista (Persona persona) {
       if (personaList.isEmpty()) {
           return false;
       }
       if (!personaList.contains(persona)) {
           return false;
       }

       return true;
    }

    public static boolean addPersonaHashMap(Persona persona) {
        if (!existePersonaHashMap(persona)) {
            return false;
        }
        personaHashMap.put(persona.getDni(), persona);
        return true;
    }

    public static boolean existePersonaHashMap (Persona persona) {
        if (personaHashMap.isEmpty()) {
            return false;
        }
        if (!personaHashMap.containsKey(persona.getDni())) {
            return false;
        }

        return true;
    }
}
