package ies.puerto;

public class MiException extends Exception {
    private int codigoError;

    public MiException () {}

    public MiException (int codigoError) {
        this.codigoError = codigoError;
    }

    public MiException (String mensaje) {
        super (mensaje);
    }

    public MiException (int codigoError, String mensaje) {
        super (mensaje);
        this.codigoError = codigoError;
    }

    public int getCodigoError () {
        return this.codigoError;
    }

    public void setCodigoError (int codigoError) {
        this.codigoError = codigoError;
    }
}
