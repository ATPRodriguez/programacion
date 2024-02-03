package ies.puerto.vehiculos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Concesionario {
    private HashSet <Coche> coches;
    private List <Motocicleta> motocicletas;
    private HashMap <String, Camion> camiones;
    private HashMap <String, Bicicleta> bicicletas;

    public Concesionario() {
        coches = new HashSet<>();
        motocicletas = new ArrayList<>();
    }

    public Concesionario(HashSet<Coche> coches, List<Motocicleta> motocicletas, HashMap<String, Camion> camiones,
                         HashMap<String, Bicicleta> bicicletas) {
        this.coches = coches;
        this.motocicletas = motocicletas;
        this.camiones = camiones;
        this.bicicletas = bicicletas;
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

    public HashMap<String, Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones(HashMap<String, Camion> camiones) {
        this.camiones = camiones;
    }

    public HashMap<String, Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(HashMap<String, Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
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
        return coches.add(coche);
    }

    public boolean removeCoche (Coche coche) {
        if (!coches.contains(coche)) {
            return false;
        }
        return coches.remove(coche);
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
        return velocidadMediaCoches() + velocidadMediaMotocicletas() + velocidadMediaCamiones() + velocidadMediaBicicletas();
    }

    public boolean addCamion(Camion camion) {
        if (camiones.containsValue(camion)) {
            camiones.put(camion.getMatricula(), camion);
        }
        return true;
    }

    public boolean removeCamion (Camion camion) {
        if (camiones.containsValue(camion)) {
            camiones.remove(camion.getMatricula(), camion);
        }
        return true;
    }

    public Camion obtenerCamion (String matricula) {
        if (camiones.containsKey(matricula)) {
            return camiones.get(matricula);
        }
        return null;
    }

    public float velocidadMediaCamiones () {
        float resultado = 0f;
        if (camiones.isEmpty()) {
            return resultado;
        }
        for (Camion camion : camiones.values()) {
            resultado += camion.getVelocidad();
        }
        return resultado/camiones.size();
    }

    public boolean addBicicleta(Bicicleta bicicleta) {
        if (bicicletas.containsValue(bicicleta)) {
            bicicletas.put(bicicleta.getMatricula(), bicicleta);
        }
        return true;
    }

    public boolean removeBicicleta (Bicicleta bicicleta) {
        if (bicicletas.containsValue(bicicleta)) {
            bicicletas.remove(bicicleta.getMatricula(), bicicleta);
        }
        return true;
    }

    public Bicicleta obtenerBicicleta (String matricula) {
        if (bicicletas.containsKey(matricula)) {
            return bicicletas.get(matricula);
        }
        return null;
    }

    public float velocidadMediaBicicletas () {
        float resultado = 0f;
        if (bicicletas.isEmpty()) {
            return resultado;
        }
        for (Bicicleta bicicleta : bicicletas.values()) {
            resultado += bicicleta.getVelocidad();
        }
        return resultado/bicicletas.size();
    }
    @Override
    public String toString() {
        return "Concesionario" +
                "\nCoches:" + coches +
                "\nMotocicletas: " + motocicletas +
                "\nCamiones: " + camiones +
                "\nBicicletas: " + bicicletas;
    }
}
