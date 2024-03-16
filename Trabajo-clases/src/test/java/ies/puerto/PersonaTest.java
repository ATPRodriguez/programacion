package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PersonaTest {

    /**
     * @author ATPRodriguez
     */
    Persona persona = new Persona();

    @Test
    public void imprimirTest(){
        Persona persona1 = new Persona("Alex", 20, "alex@gmail.com", 123456789);
        String resultadoOk = "nombre:Alex, edad:20, email:alex@gmail.com, telefono:123456789";
        Assertions.assertEquals(resultadoOk, persona1.imprimir(), "No es el resultado esperado");
    }
}
