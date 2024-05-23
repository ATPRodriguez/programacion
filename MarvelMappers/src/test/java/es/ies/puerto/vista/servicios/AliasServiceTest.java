package es.ies.puerto.vista.servicios;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.dto.AliasDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;
import java.util.HashSet;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class AliasServiceTest {
    public static final String MESSAGE_ERROR = "No se ha obtenido el resultado esperado";
    AliasService marvelService;

    @Mock
    DaoAlias daoMarvelMock;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
        try {
            marvelService = new AliasService(daoMarvelMock);
        } catch (MarvelException exception) {
            Assertions.fail();
        }
    }

    @Test
    void getAllTest() throws MarvelException {
        when(daoMarvelMock.findAllAlias()).thenReturn(new HashSet<>());
        Response respuesta = marvelService.getAllMarvel();
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneOkTest() throws MarvelException {
        when(daoMarvelMock.findAlias(any(Alias.class))).thenReturn(new Alias());
        Response respuesta = marvelService.getMarvelId("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(200,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void getOneNotFoundTest() throws MarvelException {
        when(daoMarvelMock.findAlias(any(Alias.class))).thenReturn(null);
        Response respuesta = marvelService.getMarvelId("idTest");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongOkTest() throws MarvelException {
        when(daoMarvelMock.updateAlias(any(Alias.class))).thenReturn(true);
        String id = "aliasId";
        Response respuesta = marvelService.addAlias(new AliasDTO(id));
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(201,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void saveSongDuplicateTest() throws MarvelException {
        when(daoMarvelMock.updateAlias(any(Alias.class))).thenReturn(false);
        String id = "aliasId";
        Response respuesta = marvelService.addAlias(new AliasDTO(id));
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(304,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneOkTest() throws MarvelException {
        when(daoMarvelMock.deleteAlias(any(Alias.class))).thenReturn(true);
        Response respuesta = marvelService.deleteAliasById("aliasId");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(204,respuesta.getStatus(), MESSAGE_ERROR);
    }

    @Test
    void deleteOneErrorTest() throws MarvelException {
        when(daoMarvelMock.deleteAlias(any(Alias.class))).thenReturn(false);
        Response respuesta = marvelService.deleteAliasById("aliasId");
        Assertions.assertNotNull(respuesta);
        Assertions.assertEquals(404,respuesta.getStatus(), MESSAGE_ERROR);
    }
}