package es.ies.puerto.modelo.mapper.classic;

import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.dto.PersonajeDTO;

import java.util.LinkedHashSet;
import java.util.Set;

public class PersonajeMapper {
    public PersonajeMapper() {
    }

    public static Personaje personajeDtoToPersonaje(PersonajeDTO personajeDTO) {
        if (personajeDTO == null) {
            return null;
        }
        Personaje personaje = new Personaje();
        personaje.setId(personajeDTO.getId());
        personaje.setNombre(personajeDTO.getNombre());
        personaje.setGenero(personajeDTO.getGenero());
        personaje.setAlias(personajeDTO.getAlias());
        Set<Equipamiento> set = personajeDTO.getEquipamientos();
        if (set != null) {
            personaje.setEquipamientos(new LinkedHashSet(set));
        }

        Set<Poder> set1 = personajeDTO.getPoderes();
        if (set1 != null) {
            personaje.setPoderes(new LinkedHashSet(set1));
        }

        return personaje;
    }

    public static PersonajeDTO personajeToPersonajeDto(Personaje personaje) {
        if (personaje == null) {
            return null;
        }
        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setId(personaje.getId());
        personajeDTO.setNombre(personaje.getNombre());
        personajeDTO.setGenero(personaje.getGenero());
        personajeDTO.setAlias(personaje.getAlias());
        Set<Equipamiento> set = personaje.getEquipamientos();
        if (set != null) {
            personajeDTO.setEquipamientos(new LinkedHashSet(set));
        }

        Set<Poder> set1 = personaje.getPoderes();
        if (set1 != null) {
            personajeDTO.setPoderes(new LinkedHashSet(set1));
        }

        return personajeDTO;
    }
}
