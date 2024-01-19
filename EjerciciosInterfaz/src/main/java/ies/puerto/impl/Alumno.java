package ies.puerto.impl;

import ies.puerto.abstrac.PersonaAbstract;

public class Alumno extends PersonaAbstract {
    private String nivel;

    public Alumno() {
    }

    public Alumno(String nombre, String fechaNacimiento, String nivel) {
        super(nombre, fechaNacimiento);
        this.nivel = nivel;
    }

    public String estudiar () {
        return "Estoy estudiando";
    }
}
