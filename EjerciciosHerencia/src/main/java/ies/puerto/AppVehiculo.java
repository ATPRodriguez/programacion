package ies.puerto;

public class AppVehiculo {
    static Vehiculo vehiculo = new Vehiculo("Seat", "Ibiza", 18630f);
    static Conductor conductor = new Conductor("Pepe", 20, "12345678M");
    static Coche coche = new Coche("Renault", "Clio", 17000f, "1234BCD", conductor);
    static Motocicleta motocicleta = new Motocicleta("Kawazaki", "Z800", 24800f, "5678KTD", conductor);

    public static void main(String[] args) {
        System.out.println("Soy un vehiculo " + vehiculo.toString());
        System.out.println();

        System.out.println(coche.toString());
        System.out.println();

        System.out.println(motocicleta.toString());
        System.out.println();

        conductor.conduce(coche);
        System.out.println();

        conductor.conduce(motocicleta);
        System.out.println();
    }
}
