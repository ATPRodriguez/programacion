package ies.puerto.impl;

import ies.puerto.abstrac.ConexionRedAbstract;
import ies.puerto.interfaz.IConexionRed;

public class ConexionEthernet extends ConexionRedAbstract {
    @Override
    public String conectar() {
        return "Conectando via Ethernet";
    }
}
