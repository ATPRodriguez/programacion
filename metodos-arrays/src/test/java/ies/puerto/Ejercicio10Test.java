package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio10Test {
    Ejercicio10 ejercicio10 = new Ejercicio10();

    @Test
    public void matrizDiagonalTestOk() {
        int[][] numeros = {{1, 0, 0}, {0, 2, 0}, {0, 0, 3}};
        boolean resultado = ejercicio10.matrizDiagonal(numeros);
        boolean resultadoOk = true;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
