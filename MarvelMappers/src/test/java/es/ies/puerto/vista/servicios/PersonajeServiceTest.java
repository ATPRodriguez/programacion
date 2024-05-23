package es.ies.puerto.vista.servicios;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.dto.PersonajeDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
public class PersonajeServiceTest {
    public static final String MESSAGE_ERROR = "No se ha obtenido el resultado esperado";
    PersonajeService marvelService;

    @Mock
    DaoPersonaje daoMarvelMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        marvelService = new PersonajeService(daoMarvelMock);
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllPersonaje()).thenReturn(new HashSet<>());
        Response respuesta = marvelService.getAllMarvel();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200, respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findPersonaje(any(Personaje.class))).thenReturn(new Personaje());
        Response respuesta = marvelService.getMarvelId("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200, respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findPersonaje(any(Personaje.class))).thenReturn(null);
        Response respuesta = marvelService.getMarvelId("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404, respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoMarvelMock.updatePersonaje(any(Personaje.class))).thenReturn(true);
        String id = "aliasId";
        Response respuesta = marvelService.addPersonaje(new PersonajeDTO(id));
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201, respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updatePersonaje(any(Personaje.class))).thenReturn(false);
        String id = "aliasId";
        Response respuesta = marvelService.addPersonaje(new PersonajeDTO(id));
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(304, respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deletePersonaje(any(Personaje.class))).thenReturn(true);
        Response respuesta = marvelService.deletePersonajeById("aliasId");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204, respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deletePersonaje(any(Personaje.class))).thenReturn(false);
        Response respuesta = marvelService.deletePersonajeById("aliasId");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404, respuesta.getStatus(), MESSAGE_ERROR);
    }
}
