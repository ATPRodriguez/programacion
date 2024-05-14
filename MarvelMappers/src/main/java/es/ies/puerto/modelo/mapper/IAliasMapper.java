package es.ies.puerto.modelo.mapper;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.dto.AliasDTO;

public interface IAliasMapper {

    public Alias aliasDtoToAlias (AliasDTO aliasDTO);
    public AliasDTO aliasToAliasDTO (Alias alias);
}
