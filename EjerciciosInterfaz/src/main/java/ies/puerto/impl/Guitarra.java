package ies.puerto.impl;

import ies.puerto.abstrac.InstrumentoMusicalAbstract;
import ies.puerto.interfaz.IInstrumentoMusical;

public class Guitarra extends InstrumentoMusicalAbstract {
    @Override
    public String tocarNota(String nota) {
        return "Tocando la nota " + nota;
    }

    @Override
    public String afinar() {
        return "Afinada la guitarra";
    }

    public String cambiarCuerdas() {
        return "Cambiadas cuerdas de la guitarra";
    }
}
