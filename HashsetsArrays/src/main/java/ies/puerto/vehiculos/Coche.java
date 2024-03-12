package ies.puerto.vehiculos;

import ies.puerto.abstractas.Vehiculo;

public class Coche extends Vehiculo {
    public Coche() {
        super();
    }

    public Coche(String matricula) {
        super(matricula);
    }

    public Coche(String marca, String modelo, String matricula, int velocidad) {
        super(marca, modelo, matricula, velocidad);
    }

    public int velocidadMaxima() {
        return 180;
    }

    @Override
    public String toString() {
        return  "Coche: " +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", velocidad=" + getVelocidad();
    }
}
