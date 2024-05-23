package es.ies.puerto.vista.servicios;

import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoPoder;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.dto.PoderDTO;
import es.ies.puerto.modelo.mapper.struct.IPoderMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/poder")
public class PoderService {
    private DaoPoder daoPoder;

    public PoderService() throws MarvelException {
        daoPoder = new DaoPoder();
    }

    public PoderService(DaoPoder daoPoder) throws MarvelException {
        this.daoPoder = daoPoder;
    }

    @GET
    @Path("/poder/")
    @Consumes("application/json")
    @Produces("application/json")
    public Response getAllMarvel() throws MarvelException {
        Set<PoderDTO> poderes = new HashSet<>();
        for (Poder poderBd : daoPoder.findAllPoder()) {
            poderes.add(IPoderMapper.INSTANCE.poderToPoderDTO(poderBd));
        }
        return Response.ok(poderes).build();
    }

    @GET
    @Path("/poder/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response getMarvelId(@PathParam("id") String id) throws MarvelException {
        PoderDTO poder = IPoderMapper.INSTANCE.poderToPoderDTO(daoPoder.findPoder(new Poder(id)));
        if (poder != null) {
            return Response.ok(poder).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response addPoder (PoderDTO poderDTO) {
        boolean resultado = false;
        try {
            resultado = daoPoder.updatePoder(IPoderMapper.INSTANCE.poderDtoToPoder(poderDTO));
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
    public Response deletePoderById(@PathParam("id") String id) {
        boolean deleted = false;
        try {
            deleted = daoPoder.deletePoder(new Poder(id));
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
