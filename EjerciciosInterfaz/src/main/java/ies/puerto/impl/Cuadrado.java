package ies.puerto.impl;

import ies.puerto.abstrac.RegularesAbstract;
import ies.puerto.interfaz.IFormaGeometrica;

public class Cuadrado extends RegularesAbstract implements IFormaGeometrica {
    public Cuadrado() {}

    public Cuadrado(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcularArea() {
        return getAltura() * getBase();
    }
}
