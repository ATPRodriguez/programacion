package es.ies.puerto.examen;

import java.util.Arrays;
import java.util.Collections;

/**
 * Partido de Tenis
 */
public class Ejercicio2 {
    public static final String DEUCE = "Deuce";
    public static final String P1 = "P1";
    public static final String P2 = "P2";

    public String partido(String[] secuencia) {
        String ganador = null;
        String p1 = "0";
        String p2 = "0";
        for (int i = 0; i< secuencia.length; i++) {
            switch (secuencia[i]) {
                case "P1":
                    p1 = darPuntos(p1);
                    break;
                case "P2":
                    p2 = darPuntos(p2);
                    break;
            }
            if (p1.equals("VV")) {
                ganador = "P1";
                return ganador;
            } else if (p2.equals("VV")){
                ganador= "P2";
                return ganador;
            }
        }
        if (p2.equals(p1)) {
            ganador = "Deuce";
            return ganador;
        }
        return ganador;
    }

    public String darPuntos(String jugador) {
        switch (jugador) {
            case "0":
                return "15";
            case "15":
                return "30";
            case "30":
                return "40";
            case "40":
                return "V";
            default:
                return "VV";
        }
    }
}
