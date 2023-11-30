package ies.puerto;


public class InvalidNameException extends Exception {
    private  int codigoError;

    public InvalidNameException () {}

    public InvalidNameException (int codigoError) {
        this.codigoError = codigoError;
    }

    public InvalidNameException (String mensaje){
        super(mensaje);
    }

    public InvalidNameException (int codigo, String mensaje){
        super(mensaje);
        this.codigoError =  codigo;
    }
}
