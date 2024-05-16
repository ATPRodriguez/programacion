package es.ies.puerto.examen;

/**
 * Inversor de numeros
 */
public class Ejercicio1 {

    /**
     * Funcion que invierte un numero entero dado
     * @param numero
     * @return numero invertido
     */
    public int invertirNumero(int numero) {
        String numeroString = String.valueOf(numero);
        String numeroInvertido = "";
        if (numero<0) {
            numeroString+="-";
            numeroString = numeroString.substring(1);
        }
        for (int i = numeroString.length()-1; i >= 0; i--) {
            numeroInvertido+=numeroString.charAt(i);
        }
        return Integer.parseInt(numeroInvertido);
    }
}
