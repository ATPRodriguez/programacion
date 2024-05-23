package es.ies.puerto.examen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    public static final String P1 = "P1";
    public static final String P2 = "P2";
    public static final String DEUCE = "Deuce";
    static Ejercicio2 ejercicio;
    String[] secuencia;
    String ganador;

    @BeforeAll
    static void beforeAll() {
        ejercicio = new Ejercicio2();
    }

    @Test
    void partidaGanaJugador1() {
        secuencia = new String[]{"P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1"};
        ganador = ejercicio.partido(secuencia);
        Assertions.assertNotNull(ganador);
        Assertions.assertEquals(ganador, P1);
    }

    @Test
    void partidaGanaJugador2() {
        secuencia = new String[]{"P1", "P2", "P1", "P2", "P2", "P1", "P2", "P2"};
        ganador = ejercicio.partido(secuencia);
        Assertions.assertNotNull(ganador);
        Assertions.assertEquals(ganador, P2);
    }

    @Test
    void partidaGanaJugadorDeuce() {
        secuencia = new String[]{"P1", "P2", "P1", "P2", "P2", "P1"};
        ganador = ejercicio.partido(secuencia);
        Assertions.assertNotNull(ganador);
        Assertions.assertEquals(ganador, DEUCE);
    }

    @Test
    void partidaGanaJugadorNull() {
        secuencia = new String[]{"P1", "P2", "P1", "P2", "P1"};
        ganador = ejercicio.partido(secuencia);
        Assertions.assertNull(ganador);
    }
}
