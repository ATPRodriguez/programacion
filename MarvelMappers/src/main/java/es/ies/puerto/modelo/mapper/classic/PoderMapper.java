package es.ies.puerto.modelo.mapper.classic;

import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.dto.PoderDTO;

public class PoderMapper {
    public PoderMapper() {
    }

    public static Poder poderDtoToPoder(PoderDTO poderDTO) {
        if (poderDTO == null) {
            return null;
        } else {
            Poder poder = new Poder();
            poder.setId(poderDTO.getId());
            poder.setNombre(poderDTO.getNombre());
            return poder;
        }
    }

    public static PoderDTO poderToPoderDTO(Poder poder) {
        if (poder == null) {
            return null;
        } else {
            PoderDTO poderDTO = new PoderDTO();
            poderDTO.setId(poder.getId());
            poderDTO.setNombre(poder.getNombre());
            return poderDTO;
        }
    }
}
