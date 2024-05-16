package es.ies.puerto.modelo.dto;


public class AliasDTO {
    String id;
    String descripcion;

    public AliasDTO() {
    }

    public AliasDTO(String id) {
        this.id = id;
    }

    public AliasDTO(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
