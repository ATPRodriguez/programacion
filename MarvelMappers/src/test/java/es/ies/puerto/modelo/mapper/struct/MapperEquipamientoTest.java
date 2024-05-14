package es.ies.puerto.modelo.mapper.struct;

import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.dto.EquipamientoDTO;
import es.ies.puerto.modelo.mapper.MappersHelp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperEquipamientoTest extends MappersHelp {
    EquipamientoDTO equipamientoDtoMapper;
    Equipamiento equipamientoMapper;

    @Test
    public void equipamientoToEquipamientoDtoTest () {
        equipamientoDtoMapper = IEquipamientoMapper.INSTANCE.equipamientoToEquipamientoDTO(equipamiento);
        Assertions.assertEquals(equipamientoDTO.getId(), equipamientoDtoMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(equipamientoDTO.getDescripcion(), equipamientoDtoMapper.getDescripcion(), MESSAGE_ERROR);

    }

    @Test
    public void equipamientoDtoToEquipamientoTest () {
        equipamientoMapper = IEquipamientoMapper.INSTANCE.equipamientoDtoToEquipamiento(equipamientoDTO);
        Assertions.assertEquals(equipamiento.getId(), equipamientoMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(equipamiento.getNombre(), equipamientoMapper.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(equipamiento.getDescripcion(), equipamientoMapper.getDescripcion(), MESSAGE_ERROR);
    }
}
