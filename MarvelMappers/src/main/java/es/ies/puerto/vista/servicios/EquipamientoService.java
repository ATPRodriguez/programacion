package es.ies.puerto.vista.servicios;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.dto.EquipamientoDTO;
import es.ies.puerto.modelo.mapper.struct.IEquipamientoMapper;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/equipamiento")
@Consumes("application/json")
@Produces("application/json")
public class EquipamientoService {
    private DaoEquipamiento daoEquipamiento;

    public EquipamientoService() throws MarvelException {
        daoEquipamiento = new DaoEquipamiento();
    }

    public EquipamientoService(DaoEquipamiento daoEquipamiento) throws MarvelException {
        this.daoEquipamiento = daoEquipamiento;
    }

    @GET
    @Path("/")
    public Response getAllMarvel() throws MarvelException {
        Set<EquipamientoDTO> equipamiento = new HashSet<>();
        for (Equipamiento equipamientoBd : daoEquipamiento.findAllEquipamiento()) {
            equipamiento.add(IEquipamientoMapper.INSTANCE.equipamientoToEquipamientoDTO(equipamientoBd));
        }
        return Response.ok(equipamiento).build();
    }

    @GET
    @Path("/{id}")
    public Response getMarvelId (@PathParam("id") String id) throws MarvelException {
        EquipamientoDTO equipamiento = IEquipamientoMapper.INSTANCE.equipamientoToEquipamientoDTO(daoEquipamiento.findEquipamiento(new Equipamiento(id)));
        if (equipamiento != null) {
            return Response.ok(equipamiento).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response addEquipamiento (EquipamientoDTO equipamientoDTO) {
        boolean resultado = false;
        try {
            resultado = daoEquipamiento.updateEquipamiento(IEquipamientoMapper.INSTANCE.equipamientoDtoToEquipamiento(equipamientoDTO));
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
    public Response deleteEquipamientoById(@PathParam("id") String id) {
        boolean deleted = false;
        try {
            deleted = daoEquipamiento.deleteEquipamiento(new Equipamiento(id));
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
