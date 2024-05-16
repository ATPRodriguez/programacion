package es.ies.puerto.modelo.mapper.struct;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.dto.AliasDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IAliasMapper {
    IAliasMapper INSTANCE = Mappers.getMapper(IAliasMapper.class);
    public Alias aliasDtoToAlias (AliasDTO aliasDTO);
    public AliasDTO aliasToAliasDTO (Alias alias);
}
