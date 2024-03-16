package ies.puerto.impl;

import ies.puerto.interfaz.ILecturaDatos;

public class LecturaDatosBaseDatos implements ILecturaDatos {
    @Override
    public String lectura() {
        return "Leyendo los datos desde la BBDD";
    }

    @Override
    public String apertura() {
        return "Apertura de la BBDD";
    }

    @Override
    public String cierre() {
        return "Cierre de la BBDD";
    }
}
