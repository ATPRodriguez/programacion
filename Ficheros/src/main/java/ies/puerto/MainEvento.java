package ies.puerto;

import java.text.ParseException;

public class MainEvento {
    public static void main(String[] args) throws ParseException {
        Evento evento = new Evento();
        Evento evento1 = new Evento("Navidad");
        Evento evento2 = new Evento("Anio nuevo", "31/12/2023");
        System.out.println(evento2.informacion());
        System.out.println("Esta proximo el evento? " + evento2.estaProximo());
    }
}
