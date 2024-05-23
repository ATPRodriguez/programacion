package es.ies.puerto.examen;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio1Test {

    static Ejercicio1 ejercicio1;

    int numero;

    @BeforeAll
    static void beforeAll() {
        ejercicio1 = new Ejercicio1();
    }

    @Test
    void testInvertirNumero1Test() {
        assertEquals(54321, ejercicio1.invertirNumero(12345));
    }

    @Test
    void testInvertirNumero2Test() {
        assertEquals(987654321, ejercicio1.invertirNumero(123456789));
    }

    @Test
    void testInvertirNumero0Test() {
        assertEquals(0, ejercicio1.invertirNumero(0));
    }

    @Test
    void testInvertirNumero4Test() {
        assertEquals(-54321, ejercicio1.invertirNumero(-12345));
    }

    @Test
    void testInvertirNumero5Test() {
        assertNotEquals(00001, ejercicio1.invertirNumero(0));
    }

    @Test
    void testInvertirNumero6Test() {
        assertEquals(00001, ejercicio1.invertirNumero(10000));
    }
}
