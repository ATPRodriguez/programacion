package ies.puerto;

/**
 * Crea una clase Vehiculo con atributos como marca, modelo y precio.
 * @author ATPRodriguez
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;

    public  Vehiculo () {}

    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return ", mi marca es: " + getMarca() + ", mi modelo es: " + getModelo() + ", mi precio es: " + getPrecio();
    }
}
