package ies.puerto.excepciones;

public class ValidacionException extends Exception {
    public ValidacionException () {}

    public ValidacionException (String mensaje) {
        super(mensaje);
    }
}
