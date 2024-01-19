package ies.puerto.app;

import ies.puerto.abstrac.ConductorAbstract;
import ies.puerto.impl.Automovil;
import ies.puerto.interfaz.IConductor;

public class AppConductor {
    static Automovil automovil;

    public static void main(String[] args) {
        automovil = new Automovil();

        System.out.println(automovil.arrancar());
        System.out.println(automovil.conducir());
        System.out.println(automovil.detener());
    }
}
