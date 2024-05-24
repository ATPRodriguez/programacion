package es.ies.puerto.vista.servicios;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPersonaje;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.dto.EquipamientoDTO;
import es.ies.puerto.modelo.dto.PersonajeDTO;
import es.ies.puerto.modelo.dto.PoderDTO;
import es.ies.puerto.modelo.mapper.struct.IAliasMapper;
import es.ies.puerto.modelo.mapper.struct.IPersonajeMapper;
import es.ies.puerto.modelo.mapper.struct.IPoderMapper;

import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/personaje")
@Consumes("application/json")
@Produces("application/json")
public class PersonajeService {
    private final DaoPersonaje daoPersonaje;

    public PersonajeService() throws MarvelException {
        daoPersonaje = new DaoPersonaje();
    }

    public PersonajeService(DaoPersonaje daoPersonaje) {
        this.daoPersonaje = daoPersonaje;
    }

    @GET
    @Path("/")
    public Response getAllMarvel() throws MarvelException {
        Set<PersonajeDTO> personajes = new HashSet<>();
        Set<PoderDTO> poderes = new HashSet<>();
        Set< EquipamientoDTO> equipamientos = new HashSet<>();
        for (Personaje personajeBd : daoPersonaje.findAllPersonaje()) {
            PersonajeDTO personajeDTO = IPersonajeMapper.INSTANCE.personajeToPersonajeDto(personajeBd);
            personajeDTO.setAlias(IAliasMapper.INSTANCE.aliasToAliasDTO(personajeBd.getAlias()));
            personajeDTO.setPoderes(daoPersonaje.setPoderes);
            personajes.add(personajeDTO);

        }
        return Response.ok(personajes).build();
    }

    @GET
    @Path("/{id}")
    public Response getMarvelId(@PathParam("id") String id) throws MarvelException {
        PersonajeDTO personaje = IPersonajeMapper.INSTANCE.personajeToPersonajeDto(daoPersonaje.findPersonaje(new Personaje(id)));
        if (personaje != null) {
            return Response.ok(personaje).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response addPersonaje (PersonajeDTO personajeDTO) {
        boolean resultado = false;
        try {
            resultado = daoPersonaje.updatePersonaje(IPersonajeMapper.INSTANCE.personajeDtoToPersonaje(personajeDTO));
        } catch (MarvelException exception) {
            throw new RuntimeException(exception.getMessage());
        }
        if (resultado) {
            return Response.status(Response.Status.CREATED).build();
        }
        return Response.status(Response.Status.NOT_MODIFIED).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deletePersonajeById(@PathParam("id") String id) {
        boolean deleted = false;
        try {
            deleted = daoPersonaje.deletePersonaje(new Personaje(id));
        } catch (MarvelException exception) {
            throw new RuntimeException(exception.getMessage());
        }
        if (deleted) {
            return Response.status(Response.Status.NO_CONTENT).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
