package ies.puerto;

public class Fibonacci {
    public static void main(String[] args) {
        int numeroActual = 1;
        int numeroPrevio = 0;
        System.out.print("0 1 1 ");
        for (int i = 0; i < 50; i++) {
            numeroActual = numeroActual + numeroPrevio;
            numeroPrevio = numeroActual;
            System.out.print(numeroActual + " ");
        }
    }
}
