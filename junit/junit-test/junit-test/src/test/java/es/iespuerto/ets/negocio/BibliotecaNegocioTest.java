package es.iespuerto.ets.negocio;

import es.iespuerto.ets.modelo.Libro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaNegocioTest {
    private int id = 1;
    private String nombre = "nombre";
    private String direccion = "direccion";
    BibliotecaNegocio bibliotecaNegocio;
    Libro libro;

    @BeforeEach
    public void beforeEach() {
        bibliotecaNegocio = new BibliotecaNegocio(id);
        bibliotecaNegocio = new BibliotecaNegocio(id, nombre, direccion);
        libro = new Libro(String.valueOf(id), nombre, "autor", "fPublicacion");
        bibliotecaNegocio.addLibro(libro);
    }

    @Test
    public void bibliotecaNegocioNotNullTest () {
        Assertions.assertNotNull(bibliotecaNegocio, "El objeto no puede ser nulo");
        Assertions.assertNotNull(bibliotecaNegocio.obtenerLibros(), "El conjunto de libros no puede ser nulo");
    }

    @Test
    public void addLibroDuplicadoTest () {
        bibliotecaNegocio.addLibro(libro);
        Assertions.assertEquals(1, bibliotecaNegocio.obtenerLibros().size(),
                "No se ha obtenido el numero esperado");
    }

    @Test
    public void contieneLibroTest () {
        Assertions.assertTrue(bibliotecaNegocio.existeLibro(libro));
    }

    @Test
    public void obtenerLibroTest () {
        Libro libroBuscar = new Libro(String.valueOf(id));
        Assertions.assertEquals(libro, bibliotecaNegocio.obtenerLibro(libroBuscar));
    }

    @Test
    public void obtenerLibroNoExisteTest () {
        Libro libroBuscar = new Libro(String.valueOf(2));
        Assertions.assertNull(bibliotecaNegocio.obtenerLibro(libroBuscar));
    }

    @Test
    public void eliminarLibroTest () {
    Libro libroEliminar = new Libro(String.valueOf(1));
    bibliotecaNegocio.eliminarLibro(libroEliminar);
    Assertions.assertEquals(0, bibliotecaNegocio.obtenerLibros().size(),"El numero no es el esperado");
    Libro libroEliminarNoExiste = new Libro(String.valueOf(2));
    Assertions.assertTrue(bibliotecaNegocio.eliminarLibro(libroEliminarNoExiste),"El numero no es el esperado");
    }

    @Test
    public void actualizarLibroTest () {
        String otroTitulo = "Otro titulo";
        libro.setTitulo(otroTitulo);
        Assertions.assertTrue(bibliotecaNegocio.actualizarLibro(libro),
                "No se ha actualizado de forma correcta");
        Libro libroBuscar = new Libro(String.valueOf(id));
        libroBuscar = bibliotecaNegocio.obtenerLibro(libroBuscar);
        Assertions.assertEquals(otroTitulo, libroBuscar.getTitulo(), "No se ha obtenido el texto esperado");
        Libro libroNoExiste = new Libro(String.valueOf(2));
        Assertions.assertFalse(bibliotecaNegocio.actualizarLibro(libroNoExiste), "El libro no deberia existir");
    }
}
