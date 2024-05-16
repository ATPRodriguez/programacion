package es.ies.puerto.examen;

import es.ies.puerto.examen.ejercicio5.ClienteDto;
import es.ies.puerto.examen.ejercicio5.ProductoDto;
import es.ies.puerto.examen.ejercicio5.entity.ClienteEntity;
import es.ies.puerto.examen.ejercicio5.entity.DireccionEntity;
import es.ies.puerto.examen.ejercicio5.entity.ProductoEntity;
import org.junit.jupiter.api.BeforeEach;

public class MappersHelp {
    public static final String MESSAGE_ERROR = "NO SE HA OBTENIDO EL RESULTADO ESPERADO";
    public static final String DNI = "dniTest";
    public static final String NOMBRE = "nombreTest";
    public static final String DIRECCION = "1,1,calleTest,ciudadTest";
    public static final DireccionEntity DIRECCION_ENTITY = new DireccionEntity(1,1,
            "calleTest","ciudadTest");
    public static final String EMAIL = "emailTest";
    public static final Long PRECIO = 123456789L;
    public static final ProductoEntity PRODUCTO_ENTITY = new ProductoEntity("idTest", NOMBRE, PRECIO);
    public static final ProductoDto PRODUCTO_DTO = new ProductoDto("idTest", NOMBRE, PRECIO);

    public ClienteEntity cliente;
    public ClienteDto clienteDto;

    public ProductoEntity producto;
    public ProductoDto productoDto;

    @BeforeEach
    public void beforeEach(){
        clienteDto = new ClienteDto();
        clienteDto.setDni(DNI);
        clienteDto.setNombre(NOMBRE);
        clienteDto.setDireccion(DIRECCION);
        clienteDto.setEmail(EMAIL);
        clienteDto.setProductoDto(PRODUCTO_DTO);

        cliente = new ClienteEntity();
        cliente.setDni(DNI);
        cliente.setNombre(NOMBRE);
        cliente.setDireccionEntity(DIRECCION_ENTITY);
        cliente.setEmail(EMAIL);
        cliente.setProductoEntity(PRODUCTO_ENTITY);

        productoDto = new ProductoDto();
        productoDto.setId(DNI);
        productoDto.setPrecio(PRECIO);
        productoDto.setNombre(NOMBRE);

        producto = new ProductoEntity();
        producto.setId(DNI);
        producto.setPrecio(PRECIO);
        producto.setNombre(NOMBRE);
    }
}