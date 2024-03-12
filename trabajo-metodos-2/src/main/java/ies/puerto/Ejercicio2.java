package ies.puerto;

/**
 * Realiza un programa que tenga un método al que se le pase un número e indique si es positivo o negativo y si es par o impar.
 */
public class Ejercicio2 {
    /**
     * Ejercicio que comprueba el signo de un numero
     * @param numero a comprobar
     * @return signo del numero
     */
    public String signoNumero (int numero){
        String signo = "+";
        if (numero<0)
            signo = "-";
        return signo;
    }

    /**
     * Ejercicio que comprueba la paridad de un numero
     * @param numero a comprobar
     * @return paridad del numero
     */
    public String paridadNumero (int numero){
        String paridad = "impar";
        if (numero % 2 == 0)
            paridad = "par";
        return paridad;
    }
}
