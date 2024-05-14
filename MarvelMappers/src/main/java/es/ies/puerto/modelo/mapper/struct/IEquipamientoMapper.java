package es.ies.puerto.modelo.mapper.struct;

import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.dto.EquipamientoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IEquipamientoMapper {
    IEquipamientoMapper INSTANCE = Mappers.getMapper(IEquipamientoMapper.class);
    public Equipamiento equipamientoDtoToEquipamiento (EquipamientoDTO equipamientoDTO);
    public EquipamientoDTO equipamientoToEquipamientoDTO (Equipamiento equipamiento);
}
