import ies.puerto.Ejercicio2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2 = new Ejercicio2();

    @Test
    public void contarVocalesTest () {
        String cadena = "Esto es una cadena";
        int resultadoOk = 8;
        int resultado = ejercicio2.contarVocales(cadena);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha producido el resultado esperado");
    }
}
