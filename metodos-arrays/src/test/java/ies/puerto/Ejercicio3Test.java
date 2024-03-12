package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void mayorTestOk(){
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado = ejercicio3.mayor(numeros);
        int resultadoOk = 5;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void menorTestOk(){
        int[] numeros = {1, 2, 3, 4, 5};
        int resultado = ejercicio3.menor(numeros);
        int resultadoOk = 1;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
