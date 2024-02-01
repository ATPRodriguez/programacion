package ies.puerto.clases;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Concesionario {
    private HashSet <Coche> coches;
    private List <Motocicleta> motocicletas;

    public Concesionario() {
        coches = new HashSet<>();
        motocicletas = new ArrayList<>();
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
    }

    public HashSet<Coche> getCoches() {
        return coches;
    }

    public void setCoches(HashSet<Coche> coches) {
        this.coches = coches;
    }

    public List<Motocicleta> getMotocicletas() {
        return motocicletas;
    }

    public void setMotocicletas(List<Motocicleta> motocicletas) {
        this.motocicletas = motocicletas;
    }

    public boolean addMotocicleta (Motocicleta motocicleta) {
        if (motocicletas.contains(motocicleta)) {
            return false;
        }
        motocicletas.add(motocicleta);
        return true;
    }

    public boolean removeMotocicleta (Motocicleta motocicleta) {
        if (!motocicletas.contains(motocicleta)) {
            return false;
        }
        motocicletas.remove(motocicleta);
        return true;
    }

    public Motocicleta obtenerMotocicleta (String matricula) {
        Motocicleta moto = new Motocicleta(matricula);
        if (!motocicletas.contains(moto)) {
            return null;
        }
        for (Motocicleta motocicleta: motocicletas) {
            if (motocicleta.equals(moto)) {
                return motocicleta;
            }
        }
        return null;
    }

    public float velocidadMediaMotocicletas() {
        float velocidadMedia = 0f;

        if (motocicletas.isEmpty()) {
            return velocidadMedia;
        }

        for (Motocicleta motocicleta : motocicletas) {
            velocidadMedia+=motocicleta.getVelocidad();
        }

        return velocidadMedia/motocicletas.size();
    }

    public boolean addCoche (Coche coche) {
        if (coches.contains(coche)) {
            return false;
        }
        coches.add(coche);
        return true;
    }

    public boolean removeCoche (Coche coche) {
        if (!coches.contains(coche)) {
            return false;
        }
        coches.remove(coche);
        return true;
    }

    public Coche obtenerCoche (String matricula) {
        Coche cocheBuscado = new Coche(matricula);
        if (!coches.contains(cocheBuscado)) {
            return null;
        }
        for (Coche coche: coches) {
            if (coche.equals(cocheBuscado)) {
                return coche;
            }
        }
        return null;
    }

    public float velocidadMediaCoches() {
        float velocidadMedia = 0f;

        if (coches.isEmpty()) {
            return velocidadMedia;
        }

        for (Coche coche : coches) {
            velocidadMedia+=coche.getVelocidad();
        }

        return velocidadMedia/coches.size();
    }

    public float velocidadMediaVehiculos () {
        return velocidadMediaCoches() + velocidadMediaMotocicletas();
    }
}
