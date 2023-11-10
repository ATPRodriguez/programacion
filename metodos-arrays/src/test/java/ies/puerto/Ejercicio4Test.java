package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4 = new Ejercicio4();

    @Test
    public void mayorTestOk(){
        int[] numeros = {1, 2, 3, 4, 5, 6};
        String resultado = ejercicio4.mostrarPares(numeros);
        String resultadoOk = "2 4 6 ";
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
