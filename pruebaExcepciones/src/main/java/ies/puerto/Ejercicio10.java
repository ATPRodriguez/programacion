package ies.puerto;


/**
 * Crea una excepción personalizada llamada NombreInvalidoException que se lance cuando un método reciba
 * un nombre nulo o vacío como argumento. Implementa una clase que contenga un método
 * que acepte un nombre y lance esta excepción si es inválido.
 * @author ATPRodriguez
 */
public class Ejercicio10 {
    public static void main(String[] args) throws InvalidNameException {
        boolean condition = true;
        nombre(condition);
    }

    public static void nombre(boolean condition) throws InvalidNameException {
        if (condition){
            throw new InvalidNameException(1, "InvalidNameException shows a message");
        }
    }
}
