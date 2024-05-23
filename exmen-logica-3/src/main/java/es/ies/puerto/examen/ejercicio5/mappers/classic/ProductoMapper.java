package es.ies.puerto.examen.ejercicio5.mappers.classic;

import es.ies.puerto.examen.ejercicio5.ProductoDto;
import es.ies.puerto.examen.ejercicio5.entity.ProductoEntity;

public class ProductoMapper {
    public static ProductoEntity toProductoEntity(ProductoDto productoDto) {
        ProductoEntity producto = new ProductoEntity();
        producto.setId(productoDto.getId());
        producto.setNombre(producto.getNombre());
        producto.setPrecio(productoDto.getPrecio());
        return producto;
    }
    public static ProductoDto toProductoDto(ProductoEntity producto) {
        ProductoDto productoDto = new ProductoDto();
        productoDto.setId(producto.getId());
        productoDto.setNombre(producto.getNombre());
        productoDto.setPrecio(producto.getPrecio());
        return productoDto;
    }
}
