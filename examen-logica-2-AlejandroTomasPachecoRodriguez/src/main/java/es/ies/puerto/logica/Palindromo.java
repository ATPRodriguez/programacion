package es.ies.puerto.logica;

public class Palindromo {
    public boolean palindromoTradicional(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        if (cadena.contains(" ")) {
            cadena = cadenaSinEspacios(cadena);
        }
        cadena = cadena.toLowerCase();
        for (int i = 0; i < cadena.length(); i++) {
            if (!(cadena.charAt(i) == cadena.charAt(cadena.length()-i-1))) {
                return false;
            }
        }
        return true;
    }

    public boolean palindromoRecursivo(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return false;
        }
        if (cadena.length() <= 1) {
            return true;
        }
        if (cadena.contains(" ")) {
            cadena = cadenaSinEspacios(cadena);
        }
        cadena = cadena.toLowerCase();
        if (!(cadena.charAt(cadena.length()-1) == cadena.charAt(0))) {
            return false;
        }
        return palindromoRecursivo(cadena.substring(1, cadena.length()-1));
    }

    public String cadenaSinEspacios (String cadena) {
        String[] palabras = cadena.split(" ");
        String palabrasSinEspacio = "";
        for (String palabra : palabras) {
            palabrasSinEspacio += palabra;
        }
        return palabrasSinEspacio;
    }
}
