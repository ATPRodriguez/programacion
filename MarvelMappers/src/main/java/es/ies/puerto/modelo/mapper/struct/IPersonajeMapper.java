package es.ies.puerto.modelo.mapper.struct;

import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.dto.PersonajeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IPersonajeMapper {
    IPersonajeMapper INSTANCE = Mappers.getMapper(IPersonajeMapper.class);
    public Personaje personajeDtoToPersonaje (PersonajeDTO personajeDTO);
    public PersonajeDTO personajeToPersonajeDto (Personaje personaje);
}
