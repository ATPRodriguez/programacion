package ies.puerto;

public class Ejercicio6 {
    /**
     * Ejercicio que pasa de grados fahrenheit a grados celsius
     * @param fahrenheit grados fahrenheit
     * @return grados celsius equivalentes a los fahrenheit dados
     */
    public double FahrenheitToCelsius(double fahrenheit){
        double celsius = 0;
        celsius = (fahrenheit - 32)*5/9;
        return celsius;
    }
}