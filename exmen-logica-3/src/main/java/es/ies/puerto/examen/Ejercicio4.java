package es.ies.puerto.examen;

/**
 * Numero de Divisores
 */
public class Ejercicio4 {

    /**
     * Calculo del numero de divisores convensional
     * @param numero para realizar el calculo secuencial
     * @return numero de divisores
     */
    public int convensional(int numero, int divisor) {
        int resultado=0;
        for (int i=1; i <= numero; i++) {
            if (numero%i==0) {
                resultado++;
            }
        }
        return resultado;
    }

    /**
     * Calculo del numero de divisores convensional
     * @param numero para realizar el calculo recursivo
     * @return numero de divisores
     */
    public int recursivo(int numero, int divisor) {
        if (divisor==1){
            return 1;
        }
        if (numero%divisor==0) {
            return 1 + recursivo(numero, --divisor);
        }
        return recursivo(numero, --divisor);
    }
}
