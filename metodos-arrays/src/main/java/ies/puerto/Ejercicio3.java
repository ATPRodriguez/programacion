package ies.puerto;

public class Ejercicio3 {
    /**
     * Ejercicio que calcula el numero mayor de un array
     * @param numeros array de enteros
     * @return numero mayor del array
     */
    public int mayor (int[] numeros){
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        return mayor;
    }

    /**
     * Ejercicio que calcula el numero menor de un array
     * @param numeros array de enteros
     * @return numero menor del array
     */
    public int menor (int[] numeros){
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        return menor;
    }
}
