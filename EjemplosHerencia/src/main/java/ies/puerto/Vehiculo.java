package ies.puerto;

public class Vehiculo {
    private String color;

    public Vehiculo () {}
    public Vehiculo (String color) {
        this.color = color;
    }
    public void mover () {
        System.out.println("El vehículo se esta moviendo.");
    }

    public void miColor() {
        System.out.println("Mi color es: " + color);
    }

   private void apagar () {
       System.out.println("El vehiculo se esta apagando.");
   }

    @Override
    public String toString() {
        return "Mi color es:"+color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}