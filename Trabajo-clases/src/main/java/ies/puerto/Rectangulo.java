package ies.puerto;

public class Rectangulo {
    private float largo;
    private float ancho;

    /**
     * Constructores
     */

    public Rectangulo () {}

    public Rectangulo (float largo) {
        this.largo = largo;
    }

    public Rectangulo (float largo, float ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    /**
     * Metodos
     */

    public float calcularArea () {
        return this.ancho * this.largo;
    }

    public float calcularPerimetro () {
        return (this.ancho * 2 + this.largo * 2);
    }
}
