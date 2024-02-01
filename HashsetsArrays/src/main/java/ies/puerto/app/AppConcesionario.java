package ies.puerto.app;

import ies.puerto.clases.Coche;
import ies.puerto.clases.Concesionario;
import ies.puerto.clases.Motocicleta;

import java.util.HashSet;
import java.util.List;

public class AppConcesionario {
    static Concesionario concesionario;
    HashSet<Coche> coches;
    static Coche coche1;
    static Coche coche2;
    static Coche coche3;
    static Coche coche4;
    static Coche coche5;
    List<Motocicleta> motocicletas;
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

        motocicleta1 = new Motocicleta("Harley-Davidson","Sportster","MNO345",50);
        motocicleta2 = new Motocicleta("Yamaha","YZF R6","PQR678",90);
        motocicleta3 = new Motocicleta("Ducati","Monster","STU901",70);
        motocicleta4 = new Motocicleta("Suzuki","GSX-R750","VWX234",80);
        motocicleta5 = new Motocicleta("Kawasaki","Ninja","ZAB567",85);

    }

}
