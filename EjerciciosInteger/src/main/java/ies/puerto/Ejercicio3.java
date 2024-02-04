    package ies.puerto;

    /**
     * Desarrolla un programa que determine
     * si un número entero es primo o no utilizando los métodos de la clase Integer.
     * @author ATPRodriguez
     */
    public class Ejercicio3 {
        public static void main(String[] args) {
            Integer numero = 5;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    System.out.println("No es primo");
                    break;
                }
                if (i == numero-1) {
                    System.out.println("Es primo");
                }
            }
        }
    }