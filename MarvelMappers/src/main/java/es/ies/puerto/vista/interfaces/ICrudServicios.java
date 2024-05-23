package es.ies.puerto.vista.interfaces;

import es.ies.puerto.exception.MarvelException;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface ICrudServicios {
        javax.ws.rs.core.Response getMarvelId(@PathParam("id") String id) throws MarvelException;

        public Response getAllMarvel() throws MarvelException;
}
