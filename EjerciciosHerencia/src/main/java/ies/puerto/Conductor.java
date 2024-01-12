package ies.puerto;

public class Conductor extends Persona{
    public Conductor () {}

    public Conductor (String nombre, int edad, String dni) {
        super(nombre, edad, dni);
    }

    public void conduce (Coche coche) {
        if (coche.getConductor() == this) {
            System.out.println("Soy " + getNombre() + " y estoy conduciendo mi coche");
        }
    }

    public void conduce (Motocicleta motocicleta) {
        if (motocicleta.getConductor() == this) {
            System.out.println("Soy " + getNombre() + " y estoy conduciendo mi motocicleta");
        }
    }
}
