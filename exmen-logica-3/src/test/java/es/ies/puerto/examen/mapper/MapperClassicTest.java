package es.ies.puerto.examen.mapper;

import es.ies.puerto.examen.MappersHelp;
import es.ies.puerto.examen.ejercicio5.*;
import es.ies.puerto.examen.ejercicio5.entity.ClienteEntity;
import es.ies.puerto.examen.ejercicio5.mappers.classic.ClienteMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class MapperClassicTest extends MappersHelp {

    /**
     * Genera los test para verificar que los mappers son correctos
     * y funcionan. Debes de implementar los mappers siguiendo la
     * interfaz IClienteMapper
     */
    ClienteDto clienteDtoMapper;
    ClienteEntity clienteMapper;

    @Test
    public void clienteEntityToClienteDtoTest() {
        clienteDtoMapper = ClienteMapper.toClienteDto(cliente);
        Assertions.assertEquals(clienteDto.getDni(), clienteDtoMapper.getDni(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteDto.getNombre(), clienteDtoMapper.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteDto.getDireccion(), clienteDtoMapper.getDireccion(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteDto.getEmail(), clienteDtoMapper.getEmail(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteDto.getProductoDto().getId(),
                clienteDtoMapper.getProductoDto().getId(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteDto.getProductoDto().getNombre(),
                clienteDtoMapper.getProductoDto().getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(clienteDto.getProductoDto().getPrecio(),
                clienteDtoMapper.getProductoDto().getPrecio(), MESSAGE_ERROR);
    }

    @Test
    public void clienteDtoToClienteEntityTest() {
        clienteMapper = ClienteMapper.toClienteEntity(clienteDto);
        Assertions.assertEquals(cliente.getDni(), clienteMapper.getDni(), MESSAGE_ERROR);
        Assertions.assertEquals(cliente.getNombre(), clienteMapper.getNombre(), MESSAGE_ERROR);
        Assertions.assertEquals(cliente.getDireccionEntity(), clienteMapper.getDireccionEntity(), MESSAGE_ERROR);
        Assertions.assertEquals(cliente.getEmail(), clienteMapper.getEmail(), MESSAGE_ERROR);
        Assertions.assertEquals(cliente.getProductoEntity(), clienteMapper.getProductoEntity(), MESSAGE_ERROR);
    }
}
