package es.ies.puerto.modelo.mapper;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import es.ies.puerto.modelo.dto.AliasDTO;
import es.ies.puerto.modelo.dto.EquipamientoDTO;
import es.ies.puerto.modelo.dto.PersonajeDTO;
import es.ies.puerto.modelo.dto.PoderDTO;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;
import java.util.HashSet;

public class MappersHelp {
    public static final String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    public static final String NOMBRE_TEST = "nombreTest";
    public static final String PODER_ID = "poderTest";
    public static final String ALIAS_ID = "aliasTest";
    public static final String DESCRIPCION = "descripcionTest";
    public static final String PERSONAJE_ID = "personajeTest";
    public static final String EQUIPAMIENTO_ID = "EquipamientoTest";
    public static final String GENERO = "generoTest";
    public Poder poder;
    public PoderDTO poderDTO;

    public Alias alias;
    public AliasDTO aliasDTO;

    public Equipamiento equipamiento;
    public EquipamientoDTO equipamientoDTO;

    public Personaje personaje;
    public PersonajeDTO personajeDTO;

    @BeforeEach
    public void beforeEach(){
        poderDTO = new PoderDTO();
        poderDTO.setId(PODER_ID);
        poderDTO.setNombre(NOMBRE_TEST);

        poder = new Poder();
        poder.setId(PODER_ID);
        poder.setNombre(NOMBRE_TEST);

        aliasDTO = new AliasDTO();
        aliasDTO.setId(ALIAS_ID);
        aliasDTO.setDescripcion(DESCRIPCION);

        alias = new Alias();
        alias.setId(ALIAS_ID);
        alias.setDescripcion(DESCRIPCION);
        alias.setPersonaje_id(PERSONAJE_ID);

        equipamientoDTO = new EquipamientoDTO();
        equipamientoDTO.setId(EQUIPAMIENTO_ID);
        equipamientoDTO.setDescripcion(DESCRIPCION);
        equipamientoDTO.setNombre(NOMBRE_TEST);

        equipamiento = new Equipamiento();
        equipamiento.setId(EQUIPAMIENTO_ID);
        equipamiento.setPersonaje_id(PERSONAJE_ID);
        equipamiento.setDescripcion(DESCRIPCION);
        equipamiento.setNombre(NOMBRE_TEST);

        personajeDTO = new PersonajeDTO();
        personajeDTO.setId(PERSONAJE_ID);
        personajeDTO.setAlias(aliasDTO);
        personajeDTO.setGenero(GENERO);
        personajeDTO.setNombre(NOMBRE_TEST);
        personajeDTO.setPoderes(new HashSet<>(Arrays.asList(poderDTO)));
        personajeDTO.setEquipamientos(new HashSet<>(Arrays.asList(equipamientoDTO)));

        personaje = new Personaje();
        personaje.setId(PERSONAJE_ID);
        personaje.setAlias(alias);
        personaje.setGenero(GENERO);
        personaje.setNombre(NOMBRE_TEST);
        personaje.setPoderes(new HashSet<>(Arrays.asList(poder)));
        personaje.setEquipamientos(new HashSet<>(Arrays.asList(equipamiento)));
    }
}