package es.iespuerto.productos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Supermercado {
    private HashSet<Alimento> alimentos;
    private ArrayList<Electronica> electronica;
    private HashMap<String, Soubenir> soubenirs;

    public Supermercado() {
        alimentos = new HashSet<>();
        electronica = new ArrayList<>();
        soubenirs = new HashMap<>();
    }

    public Supermercado(HashSet<Alimento> alimentos) {
        this.alimentos = alimentos;
        electronica = new ArrayList<>();
        soubenirs = new HashMap<>();
    }

    public Supermercado(ArrayList<Electronica> electronica) {
        alimentos = new HashSet<>();
        this.electronica = electronica;
        soubenirs = new HashMap<>();
    }

    public Supermercado(HashMap<String, Soubenir> soubenirs) {
        alimentos = new HashSet<>();
        electronica = new ArrayList<>();
        this.soubenirs = soubenirs;
    }

    public Supermercado(HashSet<Alimento> alimentos, ArrayList<Electronica> electronica, HashMap<String, Soubenir> soubenirs) {
        this.alimentos = alimentos;
        this.electronica = electronica;
        this.soubenirs = soubenirs;
    }

    public HashSet<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(HashSet<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public ArrayList<Electronica> getElectronica() {
        return electronica;
    }

    public void setElectronica(ArrayList<Electronica> electronica) {
        this.electronica = electronica;
    }

    public HashMap<String, Soubenir> getSoubenirs() {
        return soubenirs;
    }

    public void setSoubenirs(HashMap<String, Soubenir> soubenirs) {
        this.soubenirs = soubenirs;
    }

    public boolean addAlimento (Alimento alimento) {
        if (alimentos.contains(alimento)) {
            return true;
        }
        return alimentos.add(alimento);
    }

    public boolean removeAlimento (Alimento alimento) {
        if (!alimentos.contains(alimento)) {
            return true;
        }
        return alimentos.remove(alimento);
    }

    public Alimento obtenerAlimento (String udi) {
        Alimento alimento = new Alimento(udi);
        if (!alimentos.contains(alimento)) {
            return null;
        }
        for (Alimento alimentoMapa : alimentos) {
            if (alimentoMapa.equals(alimento)) {
                return alimentoMapa;
            }
        }
        return null;
    }

    public boolean addElectronica (Electronica electronicaAniadir) {
        if (electronica.contains(electronicaAniadir)) {
            return true;
        }
        return electronica.add(electronicaAniadir);
    }

    public boolean removeElectronica (Electronica electronicaEliminar) {
        if (!electronica.contains(electronicaEliminar)) {
            return true;
        }
        return electronica.remove(electronicaEliminar);
    }

    public Electronica obtenerElectronica (String udi) {
        Electronica electronicaObtener = new Electronica(udi);
        if (!electronica.contains(electronicaObtener)) {
            return null;
        }
        for (Electronica electronicaLista : electronica) {
            if (electronicaLista.equals(electronicaObtener)) {
                return electronicaLista;
            }
        }
        return null;
    }

    public boolean addSoubenir (Soubenir soubenir) {
        if (soubenirs.containsValue(soubenir)) {
            return true;
        }
        soubenirs.put(soubenir.getUdi(), soubenir);
        return true;
    }

    public boolean removeSoubenir (Soubenir soubenir) {
        if (!soubenirs.containsValue(soubenir)) {
            return true;
        }
        soubenirs.remove(soubenir.getUdi());
        return true;
    }

    public Soubenir obtenerSoubenir (String udi) {
        Soubenir soubenirObtener = new Soubenir(udi);
        if (!soubenirs.containsKey(udi)) {
            return null;
        }
        for (Soubenir soubenirMapa : soubenirs.values()) {
            if (soubenirMapa.equals(soubenirObtener)) {
                return soubenirMapa;
            }
        }
        return null;
    }

    public HashSet<Alimento> obtenerAlimentosCaducados () {
        HashSet<Alimento> alimentosCaducados = new HashSet<>();
        for (Alimento alimento : alimentos) {
            if (alimento.caducado()) {
                alimentosCaducados.add(alimento);
            }
        }
        return alimentosCaducados;
    }

    public float precioAlimentos () {
        float precioTotal = 0f;
        for (Alimento alimento : alimentos) {
            precioTotal += alimento.getPrecio();
        }
        return precioTotal;
    }

    public float precioElectronica () {
        float precioTotal = 0f;
        for (Electronica electronicaLista : electronica) {
            precioTotal += electronicaLista.getPrecio();
        }
        return precioTotal;
    }

    public float precioSoubenirs () {
        float precioTotal = 0f;
        for (Soubenir soubenirMapa : soubenirs.values()) {
            precioTotal += soubenirMapa.getPrecio();
        }
        return precioTotal;
    }

    public float precioProductos () {
        float precioTotal = 0f;
        precioTotal += precioAlimentos();
        precioTotal += precioElectronica();
        precioTotal += precioSoubenirs();
        return precioTotal;
    }

    @Override
    public String toString() {
        return "Supermercado: \n" +
                "Alimentos = " + alimentos +
                "\nElectronica=" + electronica +
                "\nSoubenirs=" + soubenirs;
    }
}
