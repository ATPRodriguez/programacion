package es.ies.puerto.vista.servicios.equipamiento;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.dto.PoderDTO;
import es.ies.puerto.modelo.mapper.classic.PoderMapper;
import es.ies.puerto.vista.interfaces.ICrudServicios;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/poder")
public class PoderService implements ICrudServicios {
    private DaoPoder daoPoder;

    public PoderService() throws MarvelException {
        daoPoder = new DaoPoder();
    }

    @GET
    @Path("/poder/")
    @Consumes("application/json")
    @Produces("application/json")
    @Override
    public Response getAllMarvel() throws MarvelException {
        Set<PoderDTO> poderes = new HashSet<>();
        for (Poder poderBd : daoPoder.findAllPoder()) {
            poderes.add(PoderMapper.poderToPoderDTO(poderBd));
        }
        return Response.ok(poderes).build();
    }

    @GET
    @Path("/poder/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    @Override
    public Response getMarvelId(@PathParam("id") String id) throws MarvelException {
        PoderDTO poder = PoderMapper.poderToPoderDTO(daoPoder.findPoder(new Poder(id)));
        if (poder != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}
