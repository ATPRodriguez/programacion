package ies.puerto.abstrac;

import ies.puerto.interfaz.ITrabajador;

public abstract class EmpleadoAbstract extends PersonaAbstract implements ITrabajador {
    private float salario;
    private String trabajo;

    public EmpleadoAbstract() {
    }

    public EmpleadoAbstract(String nombre, String fechaNacimiento, float salario, String trabajo) {
        super(nombre, fechaNacimiento);
        this.salario = salario;
        this.trabajo = trabajo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    @Override
    public String trabajar() {
        return "Trabajando de " + trabajo;
    }

    public abstract float calcularSalario();

    @Override
    public abstract String toString ();
}
