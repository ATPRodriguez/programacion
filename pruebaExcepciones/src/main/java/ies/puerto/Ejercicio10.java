package ies.puerto;

public class Ejercicio10 {

    public static void main(String[] args) throws MiException {
        boolean verdadero = true;

        metodoConCondicion(verdadero);
    }

    public static void metodoConCondicion(boolean verdadero) throws MiException {
        if (verdadero) {
            throw new MiException(1,"MiException lanza un mensaje");
        }
    }
}
