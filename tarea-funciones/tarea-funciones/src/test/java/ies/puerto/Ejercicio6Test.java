package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {

    Ejercicio6 ejercicio6 = new Ejercicio6();

    @Test
    public void FahrenheitToCelsiusTestOK(){
        double fahrenheit = 32;
        double resultadoOK = 0;
        double resultado = ejercicio6.FahrenheitToCelsius(fahrenheit);
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }
}