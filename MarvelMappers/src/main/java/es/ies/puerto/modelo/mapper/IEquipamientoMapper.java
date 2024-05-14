package es.ies.puerto.modelo.mapper;

import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.dto.EquipamientoDTO;

public interface IEquipamientoMapper {
    public Equipamiento equipamientoDtoToEquipamiento (EquipamientoDTO equipamientoDTO);
    public EquipamientoDTO equipamientoToEquipamientoDto (Equipamiento equipamiento);
}
