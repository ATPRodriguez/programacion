package ies.puerto.abstractas;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String matricula;
    private int velocidad;

    public Vehiculo() {}


    public Vehiculo(String marca, String modelo, String matricula, int velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.velocidad = velocidad;
    }


}
