package ies.puerto;

public class Ejercicio6 {
    /**
     * Ejercicio que pasa de grados fahrenheit a grados celsius
     * @param fahrenheit grados fahrenheit
     * @return grados celsius
     */
    public double FahrenheitToCelsius(double fahrenheit){
        double celsius;
        celsius = (fahrenheit-32)*5/9;
        return celsius;
    }
}