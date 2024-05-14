package es.ies.puerto.modelo.mapper;

import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.dto.PersonajeDTO;

@Mapper
public interface IPersonajeMapper {
    public Personaje personajeDtoToPersonaje (PersonajeDTO personajeDTO);
    public PersonajeDTO personajeToPersonajeDTO (Personaje personaje);
}
