package es.ies.puerto.modelo.mapper.classic;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.dto.AliasDTO;
import es.ies.puerto.modelo.mapper.MappersHelp;
import es.ies.puerto.modelo.mapper.struct.IAliasMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperAliasTest extends MappersHelp {
    AliasDTO aliasDTOMapper;
    Alias aliasMapper;

    @Test
    public void aliasToAliasDTOTest() {
        aliasDTOMapper = AliasMapper.aliasToAliasDTO(alias);
        Assertions.assertEquals(aliasDTO.getId(), aliasDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(aliasDTO.getDescripcion(), aliasDTOMapper.getDescripcion(), MESSAGE_ERROR);
    }

    @Test
    public void aliasDTOToAliasTest() {
        aliasMapper = AliasMapper.aliasDtoToAlias(aliasDTO);
        Assertions.assertEquals(alias.getId(), aliasMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(alias.getDescripcion(), aliasMapper.getDescripcion(), MESSAGE_ERROR);
    }
}