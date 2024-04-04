import es.ies.puerto.modelo.Alimento;
import es.ies.puerto.negocio.Tienda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TiendaTest {
    Tienda tienda;
    String id = "idAlimento";
    String nombre="nombreAlimento";
    String nombreActualizar ="nombreActualizar";
    float precio = 2f;
    float precioActualizar = 3f;
    String fEntrada = "01/03/2024";

    String fEntradaActualizar = "02/03/2024";
    String fCaducidad = "16/03/2024";

    String fCaducidadActualizar = "17/03/2024";
    Alimento alimento;

    @BeforeEach
    public void beforeEach () {
        tienda = new Tienda();
        alimento = new Alimento(id,nombre,precio,fEntrada,fCaducidad);
        tienda.crearProducto(alimento);
    }

    @Test
    public void tiendaNotNullTest() {
        Assertions.assertNotNull(tienda, "no puede ser null");
    }

    @Test
    public void addAlimentoTiendaTest() {
        Assertions.assertEquals(1, tienda.obtenerProductos().size(),
                "No se ha obtenido el tamanio esperado");
    }

    @Test
    public void addAlimentoExisteTiendaTest () {
        tienda.crearProducto(alimento);

        Assertions.assertEquals(1, tienda.obtenerProductos().size(),
                "No se ha obtenido el tamanio esperado");
    }

    @Test
    public void eliminarAlimentoExisteTiendaTest () {
        tienda.eliminarProducto(alimento);

        Assertions.assertEquals(0, tienda.obtenerProductos().size(),
                "No se ha obtenido el tamanio esperado");
    }

    @Test
    public void obtenerAlimentoExisteTiendaTest () {
        Alimento alimentoBuscar = new Alimento(id);
        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(nombre, alimentoBuscar.getNombre(),
                "No se ha obtenido el alimento esperado");
        Assertions.assertEquals(precio, alimentoBuscar.getPrecio(),
                "No se ha obtenido el alimento esperado");
        Assertions.assertEquals(fEntrada, alimentoBuscar.getfEntrada(),
                "No se ha obtenido el alimento esperado");

        Assertions.assertEquals(fCaducidad, alimentoBuscar.getfCaducidad(),
                "No se ha obtenido el alimento esperado");
    }

    @Test
    public void obtenerAlimentoNoExiste () {
        Alimento alimentoBuscar = new Alimento("idNull");
        Assertions.assertNull(tienda.obtenerProducto(alimentoBuscar), "No se ha obtenido el valor esperado");
    }

    @Test
    public void actualizarAlimentoExisteTiendaTest () {
        Alimento alimentoActualizar = new Alimento(id, nombreActualizar, precioActualizar, fEntradaActualizar,
                fCaducidadActualizar);
        tienda.actualizarProducto(alimentoActualizar);

        Alimento alimentoBuscar = new Alimento(id);

        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(nombreActualizar, alimentoBuscar.getNombre(),
                "No se ha obtenido el alimento esperado");

        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(precioActualizar, alimentoBuscar.getPrecio(),
                "No se ha obtenido el alimento esperado");

        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(fEntradaActualizar, alimentoBuscar.getfEntrada(),
                "No se ha obtenido el alimento esperado");

        alimentoBuscar = (Alimento) tienda.obtenerProducto(alimentoBuscar);
        Assertions.assertEquals(fCaducidadActualizar, alimentoBuscar.getfCaducidad(),
                "No se ha obtenido el alimento esperado");
    }
}
