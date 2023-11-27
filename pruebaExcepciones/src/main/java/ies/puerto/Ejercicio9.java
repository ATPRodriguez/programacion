package ies.puerto;

public class Ejercicio9 {

    public static void main(String[] args) throws MiException {

    }

    public static boolean esNegativo(int numero) throws NumeroNegativoException{
        if (numero < 0) {
            throw new NumeroNegativoException("El numero" + numero + "es negativo");
        }
        return true;
    }
}
