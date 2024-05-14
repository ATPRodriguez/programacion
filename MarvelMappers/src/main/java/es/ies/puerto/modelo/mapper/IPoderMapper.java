package es.ies.puerto.modelo.mapper;

import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.dto.PoderDTO;

public interface IPoderMapper {
    public Poder poderDtoToPoder (PoderDTO poderDTO);
    public PoderDTO poderToPoderDto (Poder poder);
}
