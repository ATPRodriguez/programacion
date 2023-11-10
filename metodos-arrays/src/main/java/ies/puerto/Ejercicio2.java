package ies.puerto;

public class Ejercicio2 {
    /**
     * Ejercicio que calcula el promedio de los elementos de un array
     * @param numeros array de
     * @return
     */
    public float promedio (float[] numeros){
        float suma = 0;
        float promedio;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        promedio = suma / numeros.length;
        return promedio;
    }
}
