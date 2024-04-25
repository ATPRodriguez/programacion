package es.ies.puerto.modelo.exception;

public class PersonajeException extends Throwable {
    public PersonajeException(String message) {
        super(message);
    }

    public PersonajeException(String message, Throwable tipo) {
        super(message,tipo);
    }
}
