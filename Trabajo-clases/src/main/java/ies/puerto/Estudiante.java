package ies.puerto;

public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;
    private float promedio;

    /**
     * Constructores
     */

    public Estudiante () {}

    public Estudiante (String nombre) {
        this.nombre = nombre;
    }

    public Estudiante (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Estudiante (String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public Estudiante (String nombre, int edad, String carrera, float promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    /**
     * Metodos
     */

    public String imprimir () {
        return "Nombre:" + nombre + ", Edad:" + edad + ", Carrera:" + carrera + ", Promedio:" + promedio;
    }

    boolean aprobado () {
        if (this.promedio >= 5)
            return true;
        return false;
    }
}
