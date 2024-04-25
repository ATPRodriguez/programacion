package es.ies.puerto.exception;

public class PersonajeException extends Exception{
    public PersonajeException(String message, Throwable type){
        super(message, type);
    }
}