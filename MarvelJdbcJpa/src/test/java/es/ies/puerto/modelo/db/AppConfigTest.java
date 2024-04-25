package es.ies.puerto.modelo.db;

import es.ies.puerto.config.AppConfig;
import es.ies.puerto.exception.PersonajeException;
import es.ies.puerto.modelo.utilidades.Utilidades;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppConfigTest extends Utilidades {
    AppConfig appConfig;
    String url = "src/main/resources/personajes.db";

    public AppConfigTest() throws PersonajeException {
    }

    @BeforeEach
    public void beforeEach() {
        try {
            appConfig = new AppConfig();
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }

    @Test
    public void obtainUrlBd() {
        try {
            String urlObtener = appConfig.getUrlDb();
            Assertions.assertEquals(url, urlObtener, MESSAGE_ERROR);
        } catch (Exception exception) {
            Assertions.fail(exception.getMessage());
        }
    }
}



