package ies.puerto;

public class Bicicleta extends Vehiculo {
    private String talla;

    public Bicicleta (String talla, String color) {
        super(color);
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Yo soy una Bicicleta, con talla " + this.talla + " y color " + getColor();
    }
}
