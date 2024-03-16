package ies.abstractas;

import ies.interfaces.IRecomendable;

public abstract class ProductoRecomendable extends Producto implements IRecomendable {
    
    int popularidad;

    boolean recomendado;

    public ProductoRecomendable() {
        recomendado = false;
    }

    public ProductoRecomendable(String id) {
        super(id);
        recomendado = false;
    }

    public ProductoRecomendable(String nombre, float precio, String fechaEntrada, String id) {
        super(nombre, precio, fechaEntrada, id);
        recomendado = false;
    }

    public ProductoRecomendable(String nombre, float precio, String fechaEntrada, String id, int popularidad) {
        super(nombre, precio, fechaEntrada, id);
        this.popularidad = popularidad;
        recomendado = false;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public boolean isRecomendado() {
        return recomendado;
    }

    public void setRecomendado(boolean recomendado) {
        this.recomendado = recomendado;
    }

    public boolean recomendarProducto() {
        return recomendado = true;
    }
    public int calcularPopularidad() {
        return popularidad;
    }

}
