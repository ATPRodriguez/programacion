package ies.clases;

import java.util.*;

public class Tienda {
    List<Alimento> alimentos;
    Set<Aparato> aparatos;
    Map<String, Souvenir> souvenirs;
    List<CuidadoPersonal> cuidadoPersonal;

    public Tienda() {
        alimentos = new ArrayList<>();
        cuidadoPersonal = new ArrayList<>();
        aparatos = new HashSet<>();
        souvenirs = new HashMap<>();
    }

    public Tienda(List<Alimento> alimentos, Set<Aparato> aparatos, Map<String, Souvenir> souvenirs, List<CuidadoPersonal> cuidadoPersonal) {
        this.alimentos = alimentos;
        this.aparatos = aparatos;
        this.souvenirs = souvenirs;
        this.cuidadoPersonal = cuidadoPersonal;
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public Set<Aparato> getAparatos() {
        return aparatos;
    }

    public void setAparatos(Set<Aparato> aparatos) {
        this.aparatos = aparatos;
    }

    public Map<String, Souvenir> getSouvenirs() {
        return souvenirs;
    }

    public void setSouvenirs(Map<String, Souvenir> souvenirs) {
        this.souvenirs = souvenirs;
    }

    public List<CuidadoPersonal> getCuidadoPersonal() {
        return cuidadoPersonal;
    }

    public void setCuidadoPersonal(List<CuidadoPersonal> cuidadoPersonal) {
        this.cuidadoPersonal = cuidadoPersonal;
    }

    public boolean contieneAlimento (Alimento alimento) {
        return alimentos.contains(alimento);
    }

    public boolean addAlimento (Alimento alimento) {
        if (contieneAlimento(alimento)) {
            return true;
        }
        return alimentos.add(alimento);
    }

    public boolean removeAlimento (Alimento alimento) {
        if (!contieneAlimento(alimento)) {
            return true;
        }
        return alimentos.remove(alimento);
    }

    public boolean removeAlimento (String id) {
        Alimento alimento = new Alimento(id.toUpperCase());
        return removeAlimento(alimento);
    }

    public Alimento obtenerAlimento (String id) {
        Alimento alimentoObtener = new Alimento(id.toUpperCase());
        if (alimentos.isEmpty()) {
            return null;
        }
        if (!contieneAlimento(alimentoObtener)) {
            return null;
        }

        int posicion = alimentos.indexOf(alimentoObtener);
        return  alimentos.get(posicion);
    }

    public boolean contieneCuidadoPersonal (CuidadoPersonal cuidadoPersonalContiene) {
        return cuidadoPersonal.contains(cuidadoPersonalContiene);
    }

    public boolean addCuidadoPersonal (CuidadoPersonal cuidadoPersonalAniadir) {
        if (contieneCuidadoPersonal(cuidadoPersonalAniadir)) {
            return true;
        }
        return cuidadoPersonal.add(cuidadoPersonalAniadir);
    }

    public boolean removeCuidadoPersonal (CuidadoPersonal cuidadoPersonalEliminar) {
        if (!contieneCuidadoPersonal(cuidadoPersonalEliminar)) {
            return true;
        }
        return cuidadoPersonal.remove(cuidadoPersonalEliminar);
    }

    public boolean removeCuidadoPersonal (String id) {
        CuidadoPersonal cuidadoPersonalEliminar = new CuidadoPersonal(id.toUpperCase());
        return removeCuidadoPersonal(cuidadoPersonalEliminar);
    }

    public CuidadoPersonal obtenerCuidadoPersonal (String id) {
        CuidadoPersonal cuidadoPersonalObtener = new CuidadoPersonal(id.toUpperCase());
        if (cuidadoPersonal.isEmpty()) {
            return null;
        }
        if (!contieneCuidadoPersonal(cuidadoPersonalObtener)) {
            return null;
        }
        for (CuidadoPersonal cuidadoPersonalLista : cuidadoPersonal) {
            if (cuidadoPersonalLista.equals(cuidadoPersonalObtener)) {
                return cuidadoPersonalLista;
            }
        }
        return null;
    }

    public boolean contieneAparato (Aparato aparato) {
        return aparatos.contains(aparato);
    }

    public boolean addAparato (Aparato aparato) {
        if (contieneAparato(aparato)) {
            return true;
        }
        return aparatos.add(aparato);
    }

    public boolean removeAparato (Aparato aparato) {
        if (!contieneAparato(aparato)) {
            return true;
        }
        return aparatos.remove(aparato);
    }

    public boolean removeAparato (String id) {
        Aparato aparato = new Aparato(id.toUpperCase());
        return removeAparato(aparato);
    }

    public Aparato obtenerAparato (String id) {
        Aparato aparatoObtener = new Aparato(id.toUpperCase());
        if (aparatos.isEmpty()) {
            return null;
        }
        if (!contieneAparato(aparatoObtener)) {
            return null;
        }
        for (Aparato aparato : aparatos) {
            if (aparato.equals(aparatoObtener)) {
                return aparato;
            }
        }
        return null;
    }

    public boolean contieneSouvenir (Souvenir souvenir) {
        return souvenirs.containsValue(souvenir);
    }

    public boolean addSouvenir (Souvenir souvenir) {
        if (contieneSouvenir(souvenir)) {
            return true;
        }
        souvenirs.put(souvenir.getId(), souvenir);
        return true;
    }

    public boolean removeSouvenir (Souvenir souvenir) {
        if (!contieneSouvenir(souvenir)) {
            return true;
        }
        souvenirs.remove(souvenir.getId());
        return true;
    }

    public boolean removeSouvenir (String id) {
        Souvenir souvenir = new Souvenir(id.toUpperCase());
        return removeSouvenir(souvenir);
    }

    public Souvenir obtenerSouvenir (String id) {
        Souvenir souvenirObtener = new Souvenir(id.toUpperCase());


        for (Souvenir souvenir : souvenirs.values()) {
            if (souvenir.equals(souvenirObtener)) {
                return souvenir;
            }
        }
        return null;
    }

    public float precioTotalAlimentos () {
        float resultado = 0f;
        if (alimentos.isEmpty()) {
            return resultado;
        }
        for (Alimento alimento : alimentos) {
            if (!alimento.caducado()) {
                resultado += alimento.getPrecio();
            }
        }
        return resultado;
    }

    public float gananciaAlimentos () {
        float resultado = 0f;
        if (alimentos.isEmpty()) {
            return resultado;
        }
        for (Alimento alimento : alimentos) {
            if (!alimento.caducado()) {
                resultado += (alimento.getPrecio() * alimento.cantidadDisponible());
            }
        }
        return resultado;
    }

    public float precioTotalCuidadoPersonal () {
        float resultado = 0f;
        if (cuidadoPersonal.isEmpty()) {
            return resultado;
        }
        for (CuidadoPersonal cuidadoPersonalLista : cuidadoPersonal) {
            resultado+=cuidadoPersonalLista.getPrecio();
        }
        return resultado;
    }

    public float gananciaCuidadoPersonal () {
        float resultado = 0f;
        if (cuidadoPersonal.isEmpty()) {
            return resultado;
        }
        for (CuidadoPersonal cuidadoPersonalLista : cuidadoPersonal) {
            resultado+=(cuidadoPersonalLista.getPrecio() * cuidadoPersonalLista.cantidadDisponible());
        }
        return resultado;
    }

    public float precioTotalAparatos () {
        float resultado = 0f;
        if (aparatos.isEmpty()) {
            return resultado;
        }
        for (Aparato aparato : aparatos) {
            resultado+=aparato.getPrecio();
        }
        return resultado;
    }

    public float gananciaAparatos () {
        float resultado = 0f;
        if (aparatos.isEmpty()) {
            return resultado;
        }
        for (Aparato aparato : aparatos) {
            resultado+=(aparato.getPrecio() * aparato.cantidadDisponible());
        }
        return resultado;
    }

    public float precioTotalSouvenirs () {
        float resultado = 0f;
        if (souvenirs.isEmpty()) {
            return resultado;
        }
        for (Souvenir souvenir : souvenirs.values()) {
            resultado+=souvenir.getPrecio();
        }
        return resultado;
    }

    public float gananciaSouvenirs () {
        float resultado = 0f;
        if (souvenirs.isEmpty()) {
            return resultado;
        }
        for (Souvenir souvenir : souvenirs.values()) {
            resultado+=(souvenir.getPrecio()* souvenir.cantidadDisponible());
        }
        return resultado;
    }

    public float precioTotalTodo () {
        float resultado = 0f;
        resultado=precioTotalAlimentos() + precioTotalAparatos() + precioTotalSouvenirs() + precioTotalCuidadoPersonal();
        return resultado;
    }

    public float gananciaTodo () {
        float resultado = 0f;
        resultado=gananciaAlimentos() + gananciaAparatos() + gananciaSouvenirs() + gananciaCuidadoPersonal();
        return resultado;
    }

    public void mostrarAlimentosDisponibles () {
        for (Alimento alimento : alimentos) {
            if (alimento.cantidadDisponible() > 0) {
                System.out.println("- " + alimento.getNombre() + ", cantidad: " + alimento.cantidadDisponible());
            }
        }
    }

    public void mostrarAparatosDisponibles () {
        for (Aparato aparato : aparatos) {
            if (aparato.cantidadDisponible() > 0) {
                System.out.println("- " + aparato.getNombre() + ", cantidad: " + aparato.cantidadDisponible());
            }
        }
    }

    public void mostrarSouvenirsDisponibles () {
        for (Souvenir souvenir : souvenirs.values()) {
            if (souvenir.cantidadDisponible() > 0) {
                System.out.println("- " + souvenir.getNombre() + ", cantidad: " + souvenir.cantidadDisponible());
            }
        }
    }

    public void mostrarCuidadoPersonalDisponible () {
        for (CuidadoPersonal cuidadoPersonalLista : cuidadoPersonal) {
            if (cuidadoPersonalLista.cantidadDisponible() > 0) {
                System.out.println("- " + cuidadoPersonalLista.getNombre() + ", cantidad: "
                        + cuidadoPersonalLista.cantidadDisponible());
            }
        }
    }

    public void mostrarCuidadoPersonalPopulares () {
        for (CuidadoPersonal cuidadoPersonalLista : cuidadoPersonal) {
            if (cuidadoPersonalLista.getPopularidad() >= 7) {
                System.out.println(cuidadoPersonalLista.getNombre() + ", nivel popularidad: " + cuidadoPersonalLista.getPopularidad());
            }
        }
    }

    @Override
    public String toString() {
        return "Tienda:" +
                "\nAlimentos=" + alimentos +
                "\nAparatos=" + aparatos +
                "\nSouvenirs=" + souvenirs +
                "\nCuidadoPersonal=" + cuidadoPersonal;
    }
}
