package es.ies.puerto.examen.ejercicio5.mappers.classic;

import es.ies.puerto.examen.ejercicio5.ClienteDto;
import es.ies.puerto.examen.ejercicio5.entity.ClienteEntity;
import es.ies.puerto.examen.ejercicio5.entity.DireccionEntity;

public class ClienteMapper {
    public static ClienteEntity toClienteEntity(ClienteDto clienteDto) {
        ClienteEntity cliente = new ClienteEntity(clienteDto.getDni(),
                clienteDto.getNombre(), clienteDto.getEmail(), toDireccionEntity(clienteDto.getDireccion()),
                ProductoMapper.toProductoEntity(clienteDto.getProductoDto()));
       return cliente;
    }
    public static ClienteDto toClienteDto(ClienteEntity clienteEntity) {
        return new ClienteDto(clienteEntity.getDni(), clienteEntity.getNombre(), clienteEntity.getEmail()
                , clienteEntity.getDireccionEntity().toString(), ProductoMapper.toProductoDto(clienteEntity.getProductoEntity()));
    }

    public static DireccionEntity toDireccionEntity (String direccion) {
        String[] direccionArray = direccion.split(",");
        return new DireccionEntity(Integer.parseInt(direccionArray[0]),
                Integer.parseInt(direccionArray[1]), direccionArray[2], direccionArray[3]);
    }

}
