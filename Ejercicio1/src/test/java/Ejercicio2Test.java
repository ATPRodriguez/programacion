import ies.puerto.Ejercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {

    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void ordenamientoBurbujaTest () {
        int[] resultadoOk = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array = {1, 3, 6, 5, 4, 8, 9, 7, 2};
        int[] resultado = ejercicio2.ordenamientoBurbuja(array);
        Assertions.assertArrayEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
