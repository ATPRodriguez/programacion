package ies.puerto;

import java.util.Arrays;

public class Ejercicio9 {
    public int[] combinarArrays(int[] array1, int[] array2){
        int[] solucion = new int[array1.length + array2.length];
        for (int i=0; i < array1.length; i++){
            solucion[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++){
            solucion[i+ array1.length] = array2[i];
        }
        Arrays.sort(solucion);
        return solucion;
    }
}
