package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2;
    @BeforeEach
    public void before() {
        ejercicio2 = new Ejercicio2();
    }

    @Test
    public void calcularCirculoTestOK() {
        int radio = 1;
        double resultadoOk = Math.PI;
        double resultado = ejercicio2.areaCirculo(radio);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
}