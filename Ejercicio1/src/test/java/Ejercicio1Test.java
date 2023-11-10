import ies.puerto.Ejercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void busquedaBinariaTestOk () {
        int resultadoOk = 1;
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado = ejercicio1.busquedaBinaria(array, 1);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void busquedaBinariaTestError () {
        int resultadoOk = -1;
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int resultado = ejercicio1.busquedaBinaria(array, 11);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
