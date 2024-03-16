package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    Ejercicio4 ejercicio4;

    @BeforeEach
    public void before() {ejercicio4 = new Ejercicio4();}

    @Test
    public void calcularMaximo2NumerosTestOK (){
        int numero1 = 3;
        int numero2 = 5;
        int resultado = 0;
        resultado = ejercicio4.calcularMaximo(numero1,numero2);
        Assertions.assertEquals(5, resultado, "No es el resultado esperado");
    }
    @Test
    public void calcularMaximo3NumerosTestOK () {
        int numero1 = 3;
        int numero2 = 5;
        int numero3 = 0;
        int resultado = 0;
        resultado = ejercicio4.calcularMaximo(numero1, numero2, numero3);
        Assertions.assertEquals(5, resultado, "No es el resultado esperado");
    }
}