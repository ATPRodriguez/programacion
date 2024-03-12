package ies.puerto;


public class NombreInvalidoException extends Exception {
    private  int codigoError;

    public NombreInvalidoException() {}

    public NombreInvalidoException(int codigoError) {
        this.codigoError = codigoError;
    }

    public NombreInvalidoException(String mensaje){
        super(mensaje);
    }

    public NombreInvalidoException(int codigo, String mensaje){
        super(mensaje);
        this.codigoError =  codigo;
    }
}
