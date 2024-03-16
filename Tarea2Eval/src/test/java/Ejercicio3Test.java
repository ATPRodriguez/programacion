import ies.puerto.Ejercicio3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3 = new Ejercicio3();

    @Test
    public void sumarDigitosTest () {
        int numero = 435;
        int resultadoOk = 12;
        int resultado = ejercicio3.sumarDigitos(numero);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha producido el resultado esperado");
    }
}
