package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Motocicleta extends Vehiculo {
    public Motocicleta() {
        super();
    }

    public Motocicleta(String matricula) {
        super(matricula);
    }

    public Motocicleta(String marca, String modelo, String matricula, int velocidad) {
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
