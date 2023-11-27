package ies.puerto;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * Escribe un programa que solicite al usuario ingresar una fecha en formato incorrecto
 * y luego intente convertirla a un objeto Date.
 * Maneja la excepción ParseException.
 * @author ATPRodriguez
 */
public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        String fecha = solicitarFecha();
        transformarAFecha(fecha);
    }

    /**
     * Funcion que pide por teclado una fecha
     * @return fecha obtenida
     */
    public static String solicitarFecha (){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Introduzca una fecha");
        return lectura.nextLine();
    }

    public static void transformarAFecha (String fecha) throws Exception {
        /**try {
           String resultado = Date.parse(fecha);
        } catch (ParseException exception) {
            throw new Exception ("No se ha podido hacer el Parse");
        }*/
    }
}
