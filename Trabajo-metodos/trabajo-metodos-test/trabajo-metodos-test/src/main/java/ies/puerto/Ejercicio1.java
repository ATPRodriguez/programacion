package ies.puerto;

/**
 * Clase que tiene como objetivo realizar el cálculo de un número factorial
 * @author ATPRodriguez
 */
public class Ejercicio1 {
    public static void main(String[] args) {

    }

    /**
     * Función que calcula el factorial de un número
     * @param numero de entrada para el cálculo
     * @return resultado de la operación factorial
     */
    public int calcularFactorial(int numero) {
        int resultado = 1;

        for (int i = 2; i<= numero; i++){
            resultado*=i;
        }

        return resultado;
    }

}