package es.ies.puerto.vista.servicios.equipamiento;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.dto.PersonajeDTO;
import es.ies.puerto.modelo.mapper.classic.PersonajeMapper;
import es.ies.puerto.vista.interfaces.ICrudServicios;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/personaje")
public class PersonajeService implements ICrudServicios {
    private final DaoPersonaje daoPersonaje;

    public PersonajeService() throws MarvelException {
        daoPersonaje = new DaoPersonaje();
    }

    public PersonajeService(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    @GET
    @Path("/personaje/")
    @Override
    public Response getAllMarvel() throws MarvelException {
        Set<PersonajeDTO> personajes = new HashSet<>();
        for (Personaje personajeBd : daoPersonaje.findAllPersonaje()) {
            personajes.add(PersonajeMapper.personajeToPersonajeDto(personajeBd));
        }
        return Response.ok(personajes).build();
    }

    @GET
    @Path("/personaje/{id}")
    @Override
    public Response getMarvelId(@PathParam("id") String id) throws MarvelException {
        PersonajeDTO personaje = PersonajeMapper.personajeToPersonajeDto(daoPersonaje.findPersonaje(new Personaje(id)));
        if (personaje != null) {
            return Response.ok(personaje).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

}
