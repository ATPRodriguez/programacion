package es.ies.puerto.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.modelo.file.FileCsv;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FileCsvTest {
    FileCsv fileCsv;
    List<Persona> personas;

    @BeforeEach
    public void beforeEach() {
        fileCsv = new FileCsv();
        personas = fileCsv.obtenerPersonas();
    }

    @Test
    public void obtenerPersonasTest() {
        Assertions.assertFalse(personas.isEmpty(), "No se ha obtenido el valor esperado");
    }

    @Test
    public void obtenerPersonaTest() {
        Persona personaBuscar = new Persona(2);
        personaBuscar = fileCsv.obtenerPersona(personaBuscar);
        Assertions.assertEquals(personaBuscar.getId(), 2,
                "No se ha obtenido el valor esperado");
        Assertions.assertEquals(personaBuscar.getNombre(), "Jane Smith",
                "No se ha obtenido el valor esperado");
        Assertions.assertEquals(personaBuscar.getEdad(), 25,
                "No se ha obtenido el valor esperado");
        Assertions.assertEquals(personaBuscar.getEmail(), "janesmith@example.com",
                "No se ha obtenido el valor esperado");
    }

    @Test
    public void addPersonaTest () {
        int idInsertar = 5;
        String nombreInsertar = "otro";
        int edadInsertar = 99;
        String emailInsertar = "otro@email.com";
        int numPersonas = personas.size();
        Persona personaInsertar = new Persona(idInsertar, nombreInsertar, edadInsertar, emailInsertar);
        fileCsv.addPersona(personaInsertar);
        personas = fileCsv.obtenerPersonas();
        int numPersonasInsertar = personas.size();
        Assertions.assertTrue(personas.contains(personaInsertar),
                "No se ha encontrado a la persona");
        Assertions.assertEquals(numPersonasInsertar, numPersonas+1,
                "No se ha obtenido el numro esperado");
    }
}
