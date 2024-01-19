package ies.puerto.impl;

import ies.puerto.abstrac.ConductorAbstract;

public class Automovil extends ConductorAbstract {

    @Override
    public String arrancar() {
        return "Arrancando Automovil";
    }

    @Override
    public String detener() {
        return "Deteniendo Automovil";
    }

    public String conducir() {
        return "Conduciendo Automovil";
    }
}
