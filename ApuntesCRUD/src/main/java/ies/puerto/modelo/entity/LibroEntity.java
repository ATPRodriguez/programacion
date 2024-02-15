package ies.puerto.modelo.entity;

public class LibroEntity {
    private String id;
    private String titulo;
    private String autor;
    private String fechaPublicacion;
    private int idBiblioteca;

    public LibroEntity() {
        id = "";
        titulo = "";
        autor = "";
        fechaPublicacion = "";
    }

    public LibroEntity(String id, String titulo, String autor, String publicacion, int idBiblioteca) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = publicacion;
        this.idBiblioteca = idBiblioteca;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }
}
