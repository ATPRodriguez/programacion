package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    static Ejercicio6 ejercicio6;

    @BeforeAll
    public  void before(){
        ejercicio6 = new Ejercicio6();
    }
    @Test
    public void verificarArmstrongOK() {
        int numero = 154;
        boolean resultado = ejercicio6.verificaArmstrong(numero);
        Assertions.assertFalse(resultado, "El numero NO debe ser Armstrong");
    }
}
