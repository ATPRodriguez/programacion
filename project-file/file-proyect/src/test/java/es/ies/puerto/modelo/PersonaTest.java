package es.ies.puerto.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonaTest {
    Persona persona;
    int id = 1;
    String nombre = "nombre";
    int edad = 12;
    String email = "test@test.com";
    List<Persona> personas;

    @BeforeEach
    public void beforeEach () {
        persona = new Persona(id, nombre, edad, email);
        personas = new ArrayList<>();
        personas.add(persona);
    }

    @Test
    public void createPersonaTest () {
        Assertions.assertNotNull(persona, "El objeto no puede ser nulo");
    }

    @Test
    public void toStringPersonaTest () {
        Assertions.assertTrue(persona.toString().contains(String.valueOf(id)),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(nombre),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(String.valueOf(edad)),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(email),
                "El resultado no es el esperado");
    }

    @Test
    public void equalsPersonaTest () {
        Persona personaBuscar = new Persona(id);
        Persona personaNula = null;
        Assertions.assertEquals(persona, persona, "Las personas deben de ser iguales");
        Assertions.assertEquals(personaBuscar, persona, "Las personas deben de ser iguales");
        Assertions.assertFalse(persona.equals(id), "Las personas deben de ser iguales");
        Assertions.assertFalse(persona.equals(personaNula), "Las personas deben de ser iguales");
    }

    @Test
    public void toCsvPersonaTest () {
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(id)),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(nombre),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(edad)),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(email),
                "El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(persona.DELIMITADOR),
                "El resultado no es el esperado");
    }
}
