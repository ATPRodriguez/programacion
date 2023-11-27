package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio5Test{
    Ejercicio5 ejercicio5;

    @BeforeEach
    public void before() {ejercicio5 = new Ejercicio5();}

    @Test
    public void esPrimoTestOK() {
        int numero = 5;
        boolean resultadoOK = true;
        boolean resultado = ejercicio5.esPrimo(numero);
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }
}