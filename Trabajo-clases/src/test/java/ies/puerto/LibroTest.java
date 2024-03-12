package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibroTest {

    String autor = "Mi autor";
    String titulo = "Mi titulo";
    int anioPublicacion = 2077;
    Libro libro;

    @BeforeEach
    public void beforeAll() {
        libro = new Libro(titulo, autor, anioPublicacion);
    }

    @Test
    public void constructorTestOk () {
        Assertions.assertEquals(titulo, libro.getTitulo(), "No es el resultado esperado");
        Assertions.assertEquals(autor, libro.getAutor(), "No es el resultado esperado");
        Assertions.assertEquals(anioPublicacion, libro.getAnioPublicacion(), "No es el resultado esperado");
    }

    @Test
    public void setTituloTestOk() {
        String miTitulo = "Otro titulo";
        libro.setTitulo(miTitulo);
        Assertions.assertEquals(miTitulo, libro.getTitulo(), "No es el resultado esperado");
    }

    @Test
    public void setAutorTestOk(){
        String miAutor = "Otro autor";
        libro.setAutor(miAutor);
        Assertions.assertEquals(miAutor, libro.getAutor(), "No es el resultado esperado");
    }

    @Test
    public void setAnioPublicacion(){
        int miAnioPublicacion = 2000;
        libro.setAnioPublicacion(miAnioPublicacion);
        Assertions.assertEquals(miAnioPublicacion, libro.getAnioPublicacion(), "No es el resultado esperado");
    }

    @Test
    public void imprimirTest(){
        String resultadoOk = "Titulo:Mi titulo, Autor:Mi autor, AnioPublicacion:2077";
        Assertions.assertEquals(resultadoOk, libro.imprimir(), "No es el resultado esperado");
    }
}
