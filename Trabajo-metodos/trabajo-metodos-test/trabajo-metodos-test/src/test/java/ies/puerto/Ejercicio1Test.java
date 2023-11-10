package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularFactorial5TestOK() {
        int resultado = 0;
        int resultadoCorrecto = 120;
        resultado = ejercicio1.calcularFactorial(5);
        Assertions.assertEquals(resultadoCorrecto, resultado, "No es el resultado esperado");
    }
}