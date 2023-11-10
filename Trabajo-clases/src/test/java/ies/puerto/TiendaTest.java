package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TiendaTest {

    Tienda tienda = new Tienda();

    @Test
    public void agregarTest() {
        Producto producto1 = new Producto("Libro", 10, 20);
        Producto producto2 = new Producto("Cartas", 2, 70);
        Producto producto3 = new Producto("Chicles", 1, 50);
        Producto[] productos = {producto1, producto2, producto3};
        Tienda tienda1 = new Tienda(productos);
        int resultado = tienda1.agregar("Libro", 10);
        int resultadoOk = 30;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void venderTest() {
        Producto producto1 = new Producto("Libro", 10, 20);
        Producto producto2 = new Producto("Cartas", 2, 70);
        Producto producto3 = new Producto("Chicles", 1, 50);
        Producto[] productos = {producto1, producto2, producto3};
        Tienda tienda1 = new Tienda(productos);
        int resultado = tienda1.vender("Libro", 10);
        int resultadoOk = 10;
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }

    @Test
    public void mostrarInventarioTest() {
        Producto producto1 = new Producto("Libro", 10, 20);
        Producto producto2 = new Producto("Cartas", 2, 70);
        Producto producto3 = new Producto("Chicles", 1, 50);
        Producto[] productos = {producto1, producto2, producto3};
        Tienda tienda1 = new Tienda(productos);
        String resultado = tienda1.mostrarInventario();
        String resultadoOk = "Objeto 1:Nombre:Libro, Precio:10.0, Stock:20 Objeto 2:Nombre:Cartas, Precio:2.0, Stock:70 Objeto 3:Nombre:Chicles, Precio:1.0, Stock:50 ";
        Assertions.assertEquals(resultadoOk, resultado, "No es el resultado esperado");
    }
}
