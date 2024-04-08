package es.ies.puerto.config;

import es.ies.puerto.exception.PersonajeException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String urlBd;
    public AppConfig() throws PersonajeException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
            urlBd= (String) properties.get("urlBd");
        } catch (IOException exception) {
            throw new PersonajeException(exception.getMessage(), exception);
        }
    }

    public String getUrlBd() {
        return urlBd;
    }
}
