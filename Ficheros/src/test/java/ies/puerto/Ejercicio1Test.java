package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    @Test
    public void crearTrianguloInvertidoTest() {
        int columnas = 5;
        String[][] resultadoOk = {{"*","*","*","*","*"},{null,"*","*","*",null},{null, null,"*",null,null}};
        String[][] resultado = Ejercicio1.crearTrianguloInvertido(columnas);
        Assertions.assertArrayEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void verificarColumnasTest() {
        int columnas = 5;
        boolean resultadoOk = true;
        boolean resultado = Ejercicio1.verificarColumnas(columnas);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
