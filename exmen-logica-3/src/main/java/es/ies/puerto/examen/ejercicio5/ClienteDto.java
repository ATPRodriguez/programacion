package es.ies.puerto.examen.ejercicio5;

public class ClienteDto {
    private String dni;
    private String nombre;
    private String email;
    private String direccion;
    private ProductoDto productoDto;

    public ClienteDto() {
    }

    public ClienteDto(String dni) {
        this.dni = dni;
    }

    public ClienteDto(String dni, String nombre, String email, String direccion, ProductoDto productoDto) {
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
        this.direccion = direccion;
        this.productoDto = productoDto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ProductoDto getProductoDto() {
        return productoDto;
    }

    public void setProductoDto(ProductoDto productoDto) {
        this.productoDto = productoDto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
