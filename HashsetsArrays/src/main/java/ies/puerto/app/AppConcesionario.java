package ies.puerto.app;

import ies.puerto.clases.Coche;
import ies.puerto.clases.Concesionario;
import ies.puerto.clases.Motocicleta;

public class AppConcesionario {
    static Concesionario concesionario;
    static Coche coche1;
    static Coche coche2;
    static Coche coche3;
    static Coche coche4;
    static Coche coche5;
    static Motocicleta motocicleta1;
    static Motocicleta motocicleta2;
    static Motocicleta motocicleta3;
    static Motocicleta motocicleta4;
    static Motocicleta motocicleta5;

    public static void main(String[] args) {
        concesionario = new Concesionario();

        coche1 = new Coche("Toyota","Corolla","ABC123",60);
        coche2 = new Coche("Honda","Civic","XYZ789",75);
        coche3 = new Coche("Ford","Mustang","DEF456",100);
        coche4 = new Coche("Chevrolet","Impala","GHI789",80);
        coche5 = new Coche("Volkswagen","Golf","JKL012",65);

        motocicleta1 = new Motocicleta();
        motocicleta2 = new Motocicleta();
        motocicleta3 = new Motocicleta();
        motocicleta4 = new Motocicleta();
        motocicleta5 = new Motocicleta();
    }

}
