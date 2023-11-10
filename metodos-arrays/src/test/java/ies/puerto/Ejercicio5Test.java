package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5 = new Ejercicio5();

    @Test
    public void matrizTranspuesta(){
        int[]numeros = {1, 2, 3, 4, 5, 6, 7};
        boolean resultadoOk = true;
        boolean resultado = ejercicio5.buscarElemento(numeros, 5);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
