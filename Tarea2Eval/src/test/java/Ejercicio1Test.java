import ies.puerto.Ejercicio1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {
    Ejercicio1 ejercicio1 = new Ejercicio1();

    @Test
    public void cadenaInvertidaTest ()  {
        String cadena = "Esto es una cadena";
        String resultadoOk = "anedac anu se otsE";
        String resultado = ejercicio1.invertirCadena(cadena);
        Assertions.assertEquals(resultadoOk, resultado, "La cadena no se ha invertido correctamente");
    }
}
