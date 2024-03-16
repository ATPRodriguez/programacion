package ies.puerto.modelo.entity;

public class Alimento extends Articulo{
    public Alimento(String id, String nombre,
                    float precio, String fCaducidad, String fEntrada) {
        super(id, nombre, precio, fCaducidad, fEntrada);
    }

    public String toCsv () {
        return getId() + DELIMITADOR + getNombre() + DELIMITADOR + getPrecio() + DELIMITADOR + getfCaducidad()
                + DELIMITADOR + getfEntrada();
    }
}
