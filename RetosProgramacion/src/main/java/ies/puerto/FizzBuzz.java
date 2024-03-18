package ies.puerto;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " " + fizzBuzz(i));
        }
    }

    public static String fizzBuzz (int i) {
        String mensaje = "";
        if (i % 3 == 0) {
            mensaje += "fizz";
        }
        if (i % 5 == 0) {
            mensaje += "buzz";
        }
        return mensaje;
    }
}