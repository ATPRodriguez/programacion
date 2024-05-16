package es.ies.puerto.modelo.mapper.classic;

import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.dto.EquipamientoDTO;

public class EquipamientoMapper {
    public EquipamientoMapper() {
    }

    public static Equipamiento equipamientoDtoToEquipamiento(EquipamientoDTO equipamientoDTO) {
        if (equipamientoDTO == null) {
            return null;
        } else {
            Equipamiento equipamiento = new Equipamiento();
            equipamiento.setId(equipamientoDTO.getId());
            equipamiento.setNombre(equipamientoDTO.getNombre());
            equipamiento.setDescripcion(equipamientoDTO.getDescripcion());
            return equipamiento;
        }
    }

    public static EquipamientoDTO equipamientoToEquipamientoDTO(Equipamiento equipamiento) {
        if (equipamiento == null) {
            return null;
        }
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO();
        equipamientoDTO.setId(equipamiento.getId());
        equipamientoDTO.setNombre(equipamiento.getNombre());
        equipamientoDTO.setDescripcion(equipamiento.getDescripcion());
        return equipamientoDTO;
    }
}
