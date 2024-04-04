package es.ies.puerto.config;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConfigProyectoTest {
    final String MENSAJE_ERROR = "No se ha obtenido el valor esperado";
    ConfigProyecto configProyecto;

    @BeforeEach
    public void beforeEach () {
        configProyecto = new ConfigProyecto();
    }

    @Test
    public void getPropertiesTest () {
        Assertions.assertNotNull(configProyecto.bundle, MENSAJE_ERROR);
        Assertions.assertNotNull(configProyecto.bundle.keySet(), MENSAJE_ERROR);
    }

    @Test
    public void greetingTest () {
        Assertions.assertNotNull(configProyecto.bundle.getObject("greeting"), MENSAJE_ERROR);
    }

    @Test
    public void farewellTest () {
        Assertions.assertNotNull(configProyecto.bundle.getObject("farewell"), MENSAJE_ERROR);
    }

    @Test
    public void languageEsTest () {
        configProyecto.languageEs();
        String mensaje = (String) configProyecto.bundle.getObject("greeting");
        Assertions.assertEquals(mensaje, "¡Hola!", MENSAJE_ERROR);
        mensaje = (String) configProyecto.bundle.getObject("farewell");
        Assertions.assertEquals(mensaje, "¡Adiós!", MENSAJE_ERROR);
    }

    @Test
    public void languageEnTest () {
        configProyecto.languageEn();
        String mensaje = (String) configProyecto.bundle.getObject("greeting");
        Assertions.assertEquals(mensaje, "Hello!", MENSAJE_ERROR);
        mensaje = (String) configProyecto.bundle.getObject("farewell");
        Assertions.assertEquals(mensaje, "Goodbye!", MENSAJE_ERROR);
    }
}
