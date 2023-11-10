package ies.puerto;

public class Ejercicio4 {
    /**
     * Ejercicio que calcula el mayor de dos numeros dados
     * @param numero1
     * @param numero2
     * @return numero mayor de los dos dados
     */
    public int calcularMaximo (int numero1, int numero2){
        int maximo = numero1;
        if (numero2 > numero1)
            maximo = numero2;
        return maximo;
    }

    /**
     * Ejercicio que calcula el mayor de tres numeros dados
     * @param numero1
     * @param numero2
     * @param numero3
     * @return numero mayor de los tres dados
     */
    public int calcularMaximo (int numero1, int numero2, int numero3){
        int maximo = numero1;
        if (calcularMaximo(numero2,  numero3) > numero1)
            maximo = calcularMaximo(numero2, numero3);
        return maximo;
    }
}