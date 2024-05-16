package es.ies.puerto.examen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    static Ejercicio3 ejercicio;
    int[] fecha;

    @BeforeAll
    static void beforeAll() {
        ejercicio = new Ejercicio3();
    }

    @Test
    void verificarFechaTest(){
        int dias = 2;
        int horas = 3;
        int minutos = 45;
        int segundos = 30;
        fecha = new int[]{dias,horas,minutos,segundos};
        long fechaMilisegundos = ejercicio.convertirAMilisegundos(fecha);
        int[] fechaRecalculada = ejercicio.convertirAFecha(fechaMilisegundos);
        Assertions.assertArrayEquals(fecha, fechaRecalculada);
    }

}
