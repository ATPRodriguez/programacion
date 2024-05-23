package es.ies.puerto.vista.servicios.equipamiento;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoEquipamiento;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.dto.EquipamientoDTO;
import es.ies.puerto.modelo.mapper.classic.EquipamientoMapper;
import es.ies.puerto.vista.interfaces.ICrudServicios;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/equipamiento")
public class EquipamientoService implements ICrudServicios {
    private DaoEquipamiento daoEquipamiento;

    public EquipamientoService() throws MarvelException {
        daoEquipamiento = new DaoEquipamiento();
    }

    @GET
    @Path("/equipamiento")
    @Consumes("application/json")
    @Produces("application/json")
    @Override
    public Response getAllMarvel() throws MarvelException {
        Set<EquipamientoDTO> equipamiento = new HashSet<>();
        for (Equipamiento equipamientoBd : daoEquipamiento.findAllEquipamiento()) {
            equipamiento.add(EquipamientoMapper.equipamientoToEquipamientoDTO(equipamientoBd));
        }
        return Response.ok(equipamiento).build();
    }

    @GET
    @Path("/equipamiento/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    @Override
    public Response getMarvelId (@PathParam("id") String id) throws MarvelException {
        EquipamientoDTO equipamiento = EquipamientoMapper.equipamientoToEquipamientoDTO(daoEquipamiento.findEquipamiento(new Equipamiento(id)));
        if (equipamiento != null) {
            return Response.ok(equipamiento).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
