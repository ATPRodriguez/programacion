package es.ies.puerto.vista.servicios;


import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.dto.AliasDTO;
import es.ies.puerto.modelo.mapper.struct.IAliasMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/alias")
@Consumes("application/json")
@Produces("application/json")
public class AliasService {
    private DaoAlias daoAlias;

    public AliasService() throws MarvelException {
        daoAlias = new DaoAlias();
    }

    public AliasService(DaoAlias daoAlias) throws MarvelException {
        this.daoAlias = daoAlias;
    }

    @GET
    @Path("/")
    public Response getAllMarvel() throws MarvelException {
        Set<AliasDTO> alias  = new HashSet<>();
        for (Alias aliasBd : daoAlias.findAllAlias()) {
            alias.add(IAliasMapper.INSTANCE.aliasToAliasDTO(aliasBd));
        }
        return Response.ok(alias).build();
    }

    @GET
    @Path("/{id}")
    public Response getMarvelId(@PathParam("id") String id) throws MarvelException {
        AliasDTO alias = IAliasMapper.INSTANCE.aliasToAliasDTO(daoAlias.findAlias(new Alias(id)));
        if (alias != null) {
            return Response.ok(alias).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    public Response addAlias (AliasDTO aliasDTO) {
        boolean resultado = false;
        try {
            resultado = daoAlias.updateAlias(IAliasMapper.INSTANCE.aliasDtoToAlias(aliasDTO));
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
    public Response deleteAliasById(@PathParam("id") String id) {
        boolean deleted = false;
        try {
            deleted = daoAlias.deleteAlias(new Alias(id));
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