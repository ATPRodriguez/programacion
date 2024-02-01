package ies.puerto.clases;

import ies.puerto.abstractas.Vehiculo;

public class Camion extends Vehiculo {
    public Camion() {
        super();
    }

    public Camion(String matricula) {
        super(matricula);
    }

    public Camion(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    public int velocidadMaxima() {
        return 120;
    }

    @Override
    public String toString() {
        return  "Motocicleta: " +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", velocidad=" + getVelocidad();
    }
}
