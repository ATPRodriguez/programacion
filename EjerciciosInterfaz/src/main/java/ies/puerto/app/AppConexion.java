package ies.puerto.app;

import ies.puerto.impl.ConexionEthernet;
import ies.puerto.impl.ConexionWiFi;
import ies.puerto.interfaz.IConexionRed;

public class AppConexion {
    static IConexionRed conexionEthernet;
    static IConexionRed conexionWifi;

    public static void main(String[] args) {
        conexionEthernet = new ConexionEthernet();
        conexionWifi = new ConexionWiFi();

        System.out.println("Conexion Ethernet: " + conexionEthernet.conectar());
        System.out.println("Conexion WiFi: " + conexionWifi.conectar());
    }
}
