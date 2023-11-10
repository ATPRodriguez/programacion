import ies.puerto.Ejercicio4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    String titular = "Alex";
    double saldo = 200.00;

    Ejercicio4 cuenta = new Ejercicio4();

    @BeforeEach
    public  void beforeEach () {
        cuenta = new Ejercicio4(titular, saldo);
    }

    @Test
    public void constructorTitularTestOk () {
        Ejercicio4 cuenta2 = new Ejercicio4("Alex");
        Assertions.assertEquals(cuenta.getTitular(), cuenta2.getTitular(), "No es el resultado esperado");
    }

    @Test
    public void constructorSaldoTestOk () {
        Ejercicio4 cuenta2 = new Ejercicio4(200.00);
        Assertions.assertEquals(cuenta.getSaldo(), cuenta2.getSaldo(), "No es el resultado esperado");
    }

    @Test
    public void setTitularTestOk () {
        Ejercicio4 cuenta2 = new Ejercicio4();
        cuenta2.setTitular("Alex");
        Assertions.assertEquals(cuenta.getTitular(), cuenta2.getTitular(),"No es el resultado esperado");
    }

    @Test
    public void setSaldoTestOk () {
        Ejercicio4 cuenta2 = new Ejercicio4();
        cuenta2.setSaldo(200.00);
        Assertions.assertEquals(cuenta.getSaldo(), cuenta2.getSaldo(), "No es el resultado esperado");
    }

    @Test
    public void depositarTestOk () {
        double resultadoOk = 243.34;
        double resultado = cuenta.depositar(43.34);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void retirarTestOk () {
        double resultadoOk = 170.00;
        double resultado = cuenta.retirar(30.00);
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void imprimirTestOk () {
        String resultadoOk = "Titular:Alex, Saldo:200.0";
        String resultado = cuenta.imprimir();
        Assertions.assertEquals(resultadoOk,resultado,"No es el resultado esperado");
    }
}
