package es.iespuerto.ets.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {

    Libro libro;

    String isbn="isbn";
    String titulo="titulo";
    String autor="autor";
    String fPublicacion="20/02/24";

    @BeforeEach
    public void beforeEach() {
        libro = new Libro(isbn, titulo, autor, fPublicacion);
    }

    @Test
    public void libroNotNullTes() {
        Assertions.assertNotNull(libro);
    }

    @Test
    public void libroGetSetTest() {
        String tituloUpdate = "otro nombre";
        String fPublicacionUpdate ="21/02/24";
        String autorUpdate="autorUpdate";
        libro.setAutor(autorUpdate);
        libro.setfPublicacion(fPublicacionUpdate);
        libro.setTitulo(tituloUpdate);
        Assertions.assertEquals(tituloUpdate, libro.getTitulo(), "El resultado no es el esperado");
        Assertions.assertEquals(fPublicacionUpdate, libro.getfPublicacion(), "El resultado no es el esperado");
        Assertions.assertEquals(autorUpdate, libro.getAutor(), "El resultado no es el esperado");
        Assertions.assertEquals(isbn, libro.getIsbn(), "El resultado no es el esperado");
    }

    @Test
    public void toStringTest() {
        Assertions.assertTrue(libro.toString().contains(isbn), "No contiene el valor esperaado");
        Assertions.assertTrue(libro.toString().contains(titulo), "No contiene el valor esperaado");
        Assertions.assertTrue(libro.toString().contains(autor), "No contiene el valor esperaado");
        Assertions.assertTrue(libro.toString().contains(fPublicacion), "No contiene el valor esperaado");
    }

    @Test
    public void equalsTest() {
        Libro libroNulo = null;
        String libroOtraClase = "";
        Libro otroLibro = new Libro(isbn, titulo, autor, fPublicacion);
        Assertions.assertEquals(libro, otroLibro, "No son iguales");
        Assertions.assertEquals(libro, libro);
        Assertions.assertFalse(libro.equals(libroNulo));
        Assertions.assertFalse(libro.equals(libroOtraClase), "No es la misma clase");
    }

    @Test
    public void hashCodeTest () {
        Libro otroLibro = new Libro(isbn,titulo,autor,fPublicacion);
        Assertions.assertEquals(libro.hashCode(), otroLibro.hashCode(), "No tienen mismoHashCode");
    }
}
