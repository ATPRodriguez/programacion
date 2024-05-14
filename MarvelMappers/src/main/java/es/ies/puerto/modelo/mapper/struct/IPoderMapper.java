package es.ies.puerto.modelo.mapper.struct;

import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.dto.PoderDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IPoderMapper {
    IPoderMapper INSTANCE = Mappers.getMapper(IPoderMapper.class);
    public Poder poderDtoToPoder (PoderDTO poderDTO);
    public PoderDTO poderToPoderDTO (Poder poder);
}
