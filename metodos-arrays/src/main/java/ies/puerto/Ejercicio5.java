package ies.puerto;

public class Ejercicio5 {
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
