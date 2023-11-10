package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio7Test {
    Ejercicio7 ejercicio7 = new Ejercicio7();

    @Test
    public void ordenAscendenteTestOk() {
        int[] numeros = {1, 4, 3, 0, 2, 5};
        int[] resultado = ejercicio7.ordenAscendente(numeros);
        int[] resultadoOk = {0, 1, 2, 3, 4, 5};
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}