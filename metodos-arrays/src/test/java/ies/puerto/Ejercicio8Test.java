package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio8Test {
    Ejercicio8 ejercicio8 = new Ejercicio8();

    @Test
    public void matrizSinDuplicadosTestOk(){
        int[] numeros = {1, 2, 3, 4, 5, 6, 6, 4, 2, 9};
        int[] resultado = ejercicio8.eliminarDuplicados(numeros);
        int[] resultadoOk = {1, 2, 3, 4, 5, 6, 9};
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
