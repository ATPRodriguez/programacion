package ies.puerto;

public class Ejercicio4 {
    /**
     * Ejercicio que muestra los numeros pares de un array
     * @param numeros array de enteros
     * @return String con todos los numeros pares del array
     */
    public String mostrarPares(int[] numeros){
        String resultado = "";
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                resultado += (numeros[i] + " ");
            }
        }
        return resultado;
    }
}
