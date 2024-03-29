package ies.puerto;

public class AppFigura {
    static Cuadrado cuadrado;
    static Triangulo triangulo;
    static Rectangulo rectangulo;

    public static void main(String[] args) {
        cuadrado = new Cuadrado(5.0f);
        triangulo = new Triangulo(10f, 5f);
        rectangulo = new Rectangulo(4f, 3f);

        System.out.println("Valor cuadrado: " + cuadrado);
        mostrarArea(cuadrado);

        System.out.println("Valor triangulo: " + triangulo);
        mostrarArea(triangulo);

        System.out.println("Valor rectangulo: " + rectangulo);
        mostrarArea(rectangulo);
        System.out.println("Valor de mi area rectangulo: " +rectangulo.area());
    }

    public static void mostrarArea(Figura figura) {
        System.out.println("Valor del area " + figura.calcularArea());
    }
}
