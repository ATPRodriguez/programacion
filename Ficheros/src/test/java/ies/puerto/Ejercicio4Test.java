package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {
    @Test
    public void crearTrianguloInvertidoTest() {
        int columnas = 5;
        String[][] resultadoOk = {{"*","*","*","*","*"},{null,"*","*","*",null},{null, null,"*",null,null}};
        String[][] resultado = Ejercicio1.crearTrianguloInvertido(columnas);
        Assertions.assertArrayEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void crearTrianguloTest() {
        int columnas = 5;
        String[][] resultadoOk = {{null,null,null,null,null},{null,null,"*",null,null},{null, "*","*","*",null}};
        String[][] resultado = Ejercicio4.crearTriangulo(columnas);
        Assertions.assertArrayEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void verificarFilasTest() {
        int filas = 5;
        boolean resultadoOk = true;
        boolean resultado = Ejercicio4.verificarFilas(filas);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
