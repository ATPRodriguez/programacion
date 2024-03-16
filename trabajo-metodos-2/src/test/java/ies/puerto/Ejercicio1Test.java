package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();
    @Test
    public void calcularSueldoHorasOkTest(){
        float resultado = ejercicio1.calcularSueldoHoras(10);
        Assertions.assertEquals(100, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public  void calcularSueldoHoras205(){
        Assertions.assertEquals(205, ejercicio1.calcularSueldoHoras(20.5f), "No es el resultado esperado");
    }
}
