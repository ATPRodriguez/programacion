import ies.puerto.Ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {

    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void notasIfElseSuspensoTestOk () {
        String resultadoOk = "Suspenso";
        String resultado = ejercicio3.notasIfElse(4);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }
    @Test
    public void notasIfElseAprobadoTestOk () {
        String resultadoOk = "Aprobado";
        String resultado = ejercicio3.notasIfElse(5);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasIfElseBienTestOk () {
        String resultadoOk = "Bien";
        String resultado = ejercicio3.notasIfElse(6);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasIfElseNotableTestOk () {
        String resultadoOk = "Notable";
        String resultado = ejercicio3.notasIfElse(7);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasIfElseSobresalienteTestOk () {
        String resultadoOk = "Sobresaliente";
        String resultado = ejercicio3.notasIfElse(9);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasIfElseMatriculaTestOk () {
        String resultadoOk = "Matricula";
        String resultado = ejercicio3.notasIfElse(10);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasIfElseValorNegativoTestOk () {
        String resultadoOk = "Suspenso";
        String resultado = ejercicio3.notasIfElse(-3);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void notasIfElseValorSuperior10TestOk () {
        String resultadoOk = "Matricula";
        String resultado = ejercicio3.notasIfElse(27);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void notasSwitch0TestOk () {
        String resultadoOk = "Suspenso";
        String resultado = ejercicio3.notasSwitch(0);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitch1TestOk () {
        String resultadoOk = "Suspenso";
        String resultado = ejercicio3.notasSwitch(1);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitch2TestOk () {
        String resultadoOk = "Suspenso";
        String resultado = ejercicio3.notasSwitch(2);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitch3TestOk () {
        String resultadoOk = "Suspenso";
        String resultado = ejercicio3.notasSwitch(3);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitch4TestOk () {
        String resultadoOk = "Suspenso";
        String resultado = ejercicio3.notasSwitch(4);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitch5TestOk () {
        String resultadoOk = "Aprobado";
        String resultado = ejercicio3.notasSwitch(5);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitch6TestOk () {
        String resultadoOk = "Bien";
        String resultado = ejercicio3.notasSwitch(6);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitch7TestOk () {
        String resultadoOk = "Notable";
        String resultado = ejercicio3.notasSwitch(7);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitch8TestOk () {
        String resultadoOk = "Notable";
        String resultado = ejercicio3.notasSwitch(8);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitch9TestOk () {
        String resultadoOk = "Sobresaliente";
        String resultado = ejercicio3.notasSwitch(9);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }
    @Test
    public void notasSwitch10TestOk () {
        String resultadoOk = "Matricula";
        String resultado = ejercicio3.notasSwitch(10);
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }

    @Test
    public void notasSwitchValorNegativoTestOk () {
        String resultadoOk = "Suspenso";
        String resultado = ejercicio3.notasSwitch(-3);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void notasSwitchValorSuperior10TestOk () {
        String resultadoOk = "Matricula";
        String resultado = ejercicio3.notasSwitch(27);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
