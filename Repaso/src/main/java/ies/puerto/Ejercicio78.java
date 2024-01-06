package ies.puerto;

import java.util.Scanner;

/**
 * Crea un programa que simule el juego "Piedra, Papel o Tijera" contra la computadora utilizando un bucle do-while.
 * El juego debe continuar hasta que el usuario elija salir.
 */
public class Ejercicio78 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String respuesta = "";
        String[] posibilidades = {"Piedra", "Papel", "Tijera"};
        do {
            String respuestaOrdenador = posibilidades[(int) (Math.random()*3)];
            System.out.println("Piedra, Papel o Tijera");
            respuesta = lectura.nextLine();
            respuesta = respuesta.toLowerCase();
            switch (respuesta) {
                case "piedra":
                    switch (respuestaOrdenador) {
                        case "Piedra":
                            System.out.println("Ordenador: " + respuestaOrdenador +" -- Empate");
                            break;
                        case "Papel":
                            System.out.println("Ordenador: " + respuestaOrdenador +" -- Pierdes");
                            break;
                        case "Tijera":
                            System.out.println("Ordenador: " + respuestaOrdenador +" -- Ganas");
                            break;
                    }
                    break;
                case "papel":
                    switch (respuestaOrdenador) {
                        case "Piedra":
                            System.out.println("Ordenador: " + respuestaOrdenador +" -- Ganas");
                            break;
                        case "Papel":
                            System.out.println("Ordenador: " + respuestaOrdenador +" -- Empate");
                            break;
                        case "Tijera":
                            System.out.println("Ordenador: " + respuestaOrdenador +" -- Pierdes");
                            break;
                    }
                    break;
                case "tijera":
                    switch (respuestaOrdenador) {
                        case "Piedra":
                            System.out.println("Ordenador: " + respuestaOrdenador +" -- Pierdes");
                            break;
                        case "Papel":
                            System.out.println("Ordenador: " + respuestaOrdenador +" -- Ganas");
                            break;
                        case "Tijera":
                            System.out.println("Ordenador: " + respuestaOrdenador +" -- Empate");
                            break;
                    }
                    break;
            }
        } while (!respuesta.equals("salir"));
    }
}
