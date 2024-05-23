package es.ies.puerto.examen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    static Ejercicio4 ejercicio4;

    @BeforeAll
    static void beforeAll(){
        ejercicio4 = new Ejercicio4();
    }

    @Test
    public void testNumeroDivisoresRecursivo() {
        Assertions.assertEquals(6, ejercicio4.recursivo(12,12));
        Assertions.assertEquals(8, ejercicio4.recursivo(24,24));
        Assertions.assertEquals(5, ejercicio4.recursivo(16,16));
    }

    // Pruebas para el enfoque convencional
    @Test
    public void testNumeroDivisoresConvencional() {
        Assertions.assertEquals(6, ejercicio4.convensional(12,12));
        Assertions.assertEquals(8, ejercicio4.convensional(24,24));
        Assertions.assertEquals(5, ejercicio4.convensional(16,16));
    }
}
