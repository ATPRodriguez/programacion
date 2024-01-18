package ies.puerto.impl;

import ies.puerto.interfaz.IConexionRed;

public class ConexionWiFi implements IConexionRed {
    @Override
    public String conectar() {
        return "Conectando via Wifi";
    }
}
