package es.ies.puerto.modelo.mapper.classic;

import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.dto.PersonajeDTO;
import es.ies.puerto.modelo.mapper.MappersHelp;
import es.ies.puerto.modelo.mapper.struct.IPersonajeMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapperPersonajeTest extends MappersHelp {
    PersonajeDTO personajeDTOMapper;
    Personaje personajeMapper;
    @Test
    public void personajeToPersonajeDTOTest() {
        personajeDTOMapper = PersonajeMapper.personajeToPersonajeDto(personaje);
        Assertions.assertEquals(personajeDTO.getId(), personajeDTOMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getNombre(), personajeDTOMapper.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getGenero(), personajeDTOMapper.getGenero(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getAlias(), personajeDTOMapper.getAlias(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getEquipamientos(), personajeDTOMapper.getEquipamientos(), MESSAGE_ERROR);
        Assertions.assertEquals(personajeDTO.getPoderes(), personajeDTOMapper.getPoderes(), MESSAGE_ERROR);
    }

    @Test
    public void personajeDTOToPersonajeTest() {
        personajeMapper = PersonajeMapper.personajeDtoToPersonaje(personajeDTO);
        Assertions.assertEquals(personaje.getId(), personajeMapper.getId(), MESSAGE_ERROR);
        Assertions.assertEquals(personaje.getNombre(), personajeMapper.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(personaje.getGenero(), personajeMapper.getGenero(), MESSAGE_ERROR);
        Assertions.assertEquals(personaje.getAlias(), personajeMapper.getAlias(), MESSAGE_ERROR);
        Assertions.assertEquals(personaje.getEquipamientos(), personajeMapper.getEquipamientos(), MESSAGE_ERROR);
        Assertions.assertEquals(personaje.getPoderes(), personajeMapper.getPoderes(), MESSAGE_ERROR);
    }
}