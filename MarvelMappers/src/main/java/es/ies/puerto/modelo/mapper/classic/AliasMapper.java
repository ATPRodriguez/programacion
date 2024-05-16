package es.ies.puerto.modelo.mapper.classic;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.dto.AliasDTO;

public class AliasMapper {
    public AliasMapper() {
    }

    public static Alias aliasDtoToAlias(AliasDTO aliasDTO) {
        if (aliasDTO == null) {
            return null;
        }
        Alias alias = new Alias();
        alias.setId(aliasDTO.getId());
        alias.setDescripcion(aliasDTO.getDescripcion());
        return alias;
    }

    public static AliasDTO aliasToAliasDTO(Alias alias) {
        if (alias == null) {
            return null;
        }
        AliasDTO aliasDTO = new AliasDTO();
        aliasDTO.setId(alias.getId());
        aliasDTO.setDescripcion(alias.getDescripcion());
        return aliasDTO;
    }
}
