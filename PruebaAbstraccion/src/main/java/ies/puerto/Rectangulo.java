package ies.puerto;

public class Rectangulo extends Figura {
    public Rectangulo() {}

    public Rectangulo (float base, float altura) {
        super(base, altura);
    }

    @Override
    public String toString() {
        return "base: " + getBase() + ", altura: " + getAltura();
    }

    @Override
    @Deprecated(since = "4.5", forRemoval = true)
    public float calcularArea() {
        return area();
    }

    public float area () {
        return getBase()*getAltura();
    }
}
