package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();
    @Test
    public void mostrarNumerosTestOk(){
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;
        String resultadoOk = "1 2 3 4 5";
        String resultado = ejercicio3.mostrarNumeros(numero1, numero2, numero3, numero4, numero5);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
    @Test
    public void mostrarSumaNumerosTestOk(){
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;
        int resultadoOk = 15;
        int resultado = ejercicio3.mostrarSumaNumeros(numero1, numero2, numero3, numero4, numero5);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }
    @Test
    public void orden2NumerosTestOk(){
        int numero1 = 1;
        int numero2 = 3;
        int resultadoOk = 3;
        int resultado = ejercicio3.primeroNumeros(numero1, numero2);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void orden3NumerosTestOk(){
        int numero1 = 1;
        int numero2 = 3;
        int numero3 = 2;
        int resultadoOk = 3;
        int resultado = ejercicio3.primeroNumeros(numero1, numero2, numero3);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void orden4NumerosTestOk() {
        int numero1 = 1;
        int numero2 = 3;
        int numero3 = 2;
        int numero4 = 0;
        int resultadoOk = 3;
        int resultado = ejercicio3.primeroNumeros(numero1, numero2, numero3, numero4);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void primero5NumerosTestOk() {
        int numero1 = 1;
        int numero2 = 3;
        int numero3 = 2;
        int numero4 = 0;
        int numero5 = 5;
        int resultadoOk = 5;
        int resultado = ejercicio3.primeroNumeros(numero1, numero2, numero3, numero4, numero5);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void ultimo2NumerosTestOk() {
        int numero1 = 1;
        int numero2 = 3;
        int resultadoOk = 1;
        int resultado = ejercicio3.ultimoNumeros(numero1, numero2);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void tercero3NumerosTestOk() {
        int numero1 = 1;
        int numero2 = 3;
        int numero3 = 5;
        int resultadoOk = 3;
        int resultado = ejercicio3.terceroNumeros(numero1, numero2, numero3);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void segundoNumerosTestOk() {
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;
        int resultadoOk = 2;
        int resultado = ejercicio3.segundoNumeros(numero1,numero2,numero3,numero4,numero5);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
    @Test
    public void cuartoNumerosTestOk() {
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;
        int resultadoOk = 4;
        int resultado = ejercicio3.cuartoNumeros(numero1,numero2,numero3,numero4,numero5);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
