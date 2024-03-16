package ies.puerto.impl;

import ies.puerto.abstrac.EmpleadoAbstract;

import java.text.ParseException;

public class Profesor extends EmpleadoAbstract {
    private String especialidad;

    public Profesor() {
    }

    public Profesor(String nombre, String fechaNacimiento, float salario, String especialidad) {
        super(nombre, fechaNacimiento, salario, "Profesor");
        this.especialidad = especialidad;
    }

    @Override
    public float calcularSalario() {
        return super.getSalario();
    }

    @Override
    public String toString() {
        try {
            return "Soy " + getNombre() + ", tengo " + super.anios() +  " anios, trabajo de profesor de "
                    + especialidad + " y tengo un salario de " + calcularSalario() + " euros" ;
        } catch (ParseException e) {
            throw new RuntimeException("La fecha de nacimiento no tiene el formato dd/MM/yyyy");
        }
    }

    public String impartirClase() {
        return "Estoy impartiendo una clase";
    }
}
