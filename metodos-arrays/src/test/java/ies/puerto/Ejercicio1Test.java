package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void calcularSumaTestOk() {
        int[] numeros = {1,2,3,4,5};
        int resultado = ejercicio1.calcularSuma(numeros);
        int resultadoOk = 15;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void mostarSumaTestOk(){
        int[] numeros = {1,2,3,4,5};
        String resultadoOk = "La suma de los elementos es:"+ejercicio1.calcularSuma(numeros);
        String resultado = ejercicio1.mostrarSuma(ejercicio1.calcularSuma(numeros));
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}