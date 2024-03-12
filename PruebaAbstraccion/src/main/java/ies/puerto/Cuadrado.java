package ies.puerto;

public class Cuadrado extends Rectangulo {
    public Cuadrado () {}
    public Cuadrado (float lado) {
        super(lado, lado);
    }
    public Cuadrado(float base, float altura) {
    }

    @Override
    public float calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public String toString () {
        return "Lado A:" + getBase() + ", LadoB:" + getAltura();
    }
}
