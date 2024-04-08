package es.ies.puerto.exception;

public class PersonajeException extends Throwable {
    public PersonajeException(String message) {
        super(message);
    }

    public PersonajeException(String message, Throwable tipo) {
        super(message,tipo);
    }
}
