package es.ies.puerto.logica;

public class Digitos {
    public  int sumaTradicional(int numero) {
        int suma = 0;
        for (int i = numero; i > 0; i/=10) {
            suma+= i%10;
        }
        return suma;
    }

    public  int sumaRecursiva(int numero) {
        if (numero <= 0) {
            return 0;
        }
        return numero % 10 + sumaRecursiva(numero/10);
    }
}
