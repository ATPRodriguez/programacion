package ies.puerto;

import java.util.Scanner;

/**
 * Crea una excepción personalizada llamada NombreInvalidoException que se lance cuando un método reciba
 * un nombre nulo o vacío como argumento. Implementa una clase que contenga un método
 * que acepte un nombre y lance esta excepción si es inválido.
 * @author ATPRodriguez
 */
public class Ejercicio10 {
    public static void main(String[] args) throws NombreInvalidoException {
        String nombre = null;
        Scanner lectura = new Scanner(System.in);
        nombre = lectura.nextLine();
        if (nombre.isEmpty()) {
            throw new NombreInvalidoException("No se ha escrito nada");
        }
    }
}
