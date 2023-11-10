package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();
    @Test
    public void signoNumeroTestOk(){
        String resultadoOk = "+";
        String resultado = ejercicio2.signoNumero(3);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }

    @Test
    public void paridadNumeroTestOk(){
        String resultado = ejercicio2.paridadNumero(4);
        String resultadoOk = "par";
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void comprobacionesTests(){
        Assertions.assertEquals("-", ejercicio2.signoNumero(-5), "No es el resultado esperado");
        Assertions.assertEquals("impar", ejercicio2.paridadNumero(5), "No es el resultado esperado");
    }
}
