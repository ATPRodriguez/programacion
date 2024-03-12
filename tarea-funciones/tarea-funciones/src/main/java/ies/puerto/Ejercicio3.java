package ies.puerto;

public class Ejercicio3 {
    /**
     * Ejercicio que calcula el area de un cuadrado
     * @param lado del cuadrado
     * @return area del cuadrado
     */
    public int areaCuadrado(int lado) {
        int resultado = 0;
        resultado = lado*lado;
        return resultado;
    }

    /**
     * Ejercicio que calcula el area de un rectangulo
     * @param base del rectangulo
     * @param altura del rectangulo
     * @return area del rectangulo
     */
    public int areaRectangulo(int base, int altura) {
        int resultado = 0;
        resultado = base*altura;
        return resultado;
    }
}