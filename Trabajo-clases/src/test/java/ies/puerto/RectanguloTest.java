package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
    Rectangulo rectangulo = new Rectangulo();

    @Test
    public void calcularAreaTest() {
        Rectangulo rectangulo1 = new Rectangulo(10, 20);
        float resultado = rectangulo1.calcularArea();
        float resultadoOk = 200;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void calcularPerimetroTest() {
        Rectangulo rectangulo1 = new Rectangulo(10, 20);
        float resultado = rectangulo1.calcularPerimetro();
        float resultadoOk = 60;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
