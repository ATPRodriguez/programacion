package es.ies.puerto.vista.servicios.equipamiento;


import es.ies.puerto.exception.MarvelException;
import es.ies.puerto.modelo.db.dao.DaoAlias;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.dto.AliasDTO;
import es.ies.puerto.modelo.mapper.classic.AliasMapper;
import es.ies.puerto.vista.interfaces.ICrudServicios;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.HashSet;
import java.util.Set;

@Path("/alias")
public class AliasService implements ICrudServicios {
    private DaoAlias daoAlias;

    public AliasService() throws MarvelException {
        daoAlias = new DaoAlias();
    }

    @GET
    @Path("/alias/")
    @Consumes("application/json")
    @Produces("application/json")
    @Override
    public Response getAllMarvel() throws MarvelException {
        Set<AliasDTO> alias  = new HashSet<>();
        for (Alias aliasBd : daoAlias.findAllAlias()) {
            alias.add(AliasMapper.aliasToAliasDTO(aliasBd));
        }
        return Response.ok(alias).build();
    }

    @GET
    @Path("/alias/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    @Override
    public Response getMarvelId(@PathParam("id") String id) throws MarvelException {
        AliasDTO alias = AliasMapper.aliasToAliasDTO(daoAlias.findAlias(new Alias(id)));
        if (alias != null) {
            return Response.ok(alias).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
}