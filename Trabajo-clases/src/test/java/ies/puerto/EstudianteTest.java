package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EstudianteTest {

    Estudiante estudiante = new Estudiante();

    @Test
    public void imprimirTest () {
        Estudiante estudiante1 = new Estudiante("Alex", 20, "DAM", 7);
        String resultado = estudiante1.imprimir();
        String resultadoOK = "Nombre:Alex, Edad:20, Carrera:DAM, Promedio:7.0";
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }

    @Test
    public void aprobadoTest () {
        Estudiante estudiante1 = new Estudiante("Alex", 20, "DAM", 7);
        boolean resultado = estudiante1.aprobado();
        boolean resultadoOK = true;
        Assertions.assertEquals(resultadoOK, resultado, "No es el resultado esperado");
    }
}
