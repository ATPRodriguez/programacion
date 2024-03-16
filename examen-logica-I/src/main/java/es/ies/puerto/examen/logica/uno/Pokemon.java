package es.ies.puerto.examen.logica.uno;

import java.util.HashMap;
import java.util.Map;

public class Pokemon {

    public Pokemon() {
    }

    float danio(String tipoAtacante, String tipoDefensor, int ataque, int defensa) {
        if (ataque > 100) {
            return -1;
        }
        if (defensa > 100) {
            return -2;
        }
        float ataqueDefensa = (float) ataque / defensa;
        if (tipoAtacante.equals(tipoDefensor)) {
            return 50 * (ataqueDefensa / 2);
        }
        if (tipoAtacante.equals("Eléctrico")) {
            return 50 * (ataqueDefensa);
        }
        float danio = (float) (50 * ataqueDefensa * efectividad(tipoAtacante, tipoDefensor));
        return danio;
    }

    public double efectividad(String tipoAtacante, String tipoDefensor) {
        if ((tipoDefensor.equals("Fuego") || tipoAtacante.equals("Fuego"))) {
            return 2;
        } else {
            return 0.5;
        }
    }
}
