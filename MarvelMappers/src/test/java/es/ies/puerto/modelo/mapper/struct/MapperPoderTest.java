package es.ies.puerto.modelo.mapper.struct;

import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.dto.PoderDTO;
import es.ies.puerto.modelo.mapper.MappersHelp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperPoderTest extends MappersHelp {
    PoderDTO poderDTOMappper;
    Poder poderMapper;

     @Test
     public void poderToPoderDTOTest() {
        poderDTOMappper = IPoderMapper.INSTANCE.poderToPoderDTO(poder);
        Assertions.assertEquals(poderDTO.getId(), poderDTOMappper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(poderDTO.getNombre(), poderDTOMappper.getNombre(), MESSAGE_ERROR);
    }

    @Test
    public void poderDTOToPoderTest() {
        poderMapper = IPoderMapper.INSTANCE.poderDtoToPoder(poderDTO);
        Assertions.assertEquals(poder.getId(), poderMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(poder.getNombre(), poderMapper.getNombre(), MESSAGE_ERROR);
    }
}