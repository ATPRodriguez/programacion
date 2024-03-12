package ies.puerto.impl;

import ies.puerto.abstrac.PersonaAbstract;

import java.text.ParseException;

public class Alumno extends PersonaAbstract {
    private String nivel;

    public Alumno() {
    }

    public Alumno(String nombre, String fechaNacimiento, String nivel) {
        super(nombre, fechaNacimiento);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String estudiar () {
        return "Estoy estudiando";
    }

    @Override
    public String toString() {
        try {
            return "Soy el estudiante " + getNombre() + ", tengo " + super.anios() + " anios y estoy en " + nivel;
        } catch (ParseException e) {
            throw new RuntimeException("La fecha de nacimiento introducida no esta en formato dd/MM/yyyy");
        }
    }
}
