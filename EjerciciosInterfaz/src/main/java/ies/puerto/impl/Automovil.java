package ies.puerto.impl;

import ies.puerto.interfaz.IConductor;

public class Automovil implements IConductor {
    @Override
    public String arrancar() {
        return "Arrancando Automovil...";
    }

    @Override
    public String detener() {
        return "Deteniendo Automovil...";
    }

    public String conducir() {
        return "Conduciendo...";
    }
}
