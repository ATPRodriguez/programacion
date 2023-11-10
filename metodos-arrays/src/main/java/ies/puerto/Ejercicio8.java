package ies.puerto;

public class Ejercicio8 {
    public int[] eliminarDuplicados (int [] numeros) {
        int indiceSinDuplicados = 0;
        int[] numerosSinDuplicados = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            if (!buscarElemento(numerosSinDuplicados, numeros[i])) {
                numerosSinDuplicados[indiceSinDuplicados] = numeros[i];
                indiceSinDuplicados++;
            }
        }
        return numerosSinDuplicados;
    }

    public boolean buscarElemento(int[] numeros, int elemento){
        int i = 0;
        while (i < numeros.length){
            if (numeros[i] == elemento)
                return true;
            i++;
        }
        return false;
    }
}
