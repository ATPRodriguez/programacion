package ies.puerto;

public class Ejercicio5 {
    /**
     * Ejercicio que verifica si un numero es primo
     * @param numero a verificar
     * @return true si es primo/ false si no es primo
     */
    public boolean EsPrimo (int numero){
        int i = 2;
        while (i < numero){
            if (i== numero -1)
                return true;
            if ( numero % i == 0)
                break;
            i++;
        }
        return false;
    }
}