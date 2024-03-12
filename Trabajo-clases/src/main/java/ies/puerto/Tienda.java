package ies.puerto;

public class Tienda {

    private Producto[] inventario;

    /**
     * Constructores
     */
    public Tienda () {}

    public Tienda (Producto[] inventario){
        this.inventario = inventario;
    }

    /**
     * Metodos
     */

    public int agregar (String nombreProducto, int numeroAnadir) {
        int i = 0;
        while (i < inventario.length) {
            if (inventario[i].getNombre() == nombreProducto) {
                inventario[i].setStock(inventario[i].getStock() + numeroAnadir);
                return inventario[i].getStock();
            }
            i++;
        }
        return 0;
    }

    public int vender (String nombreProducto, int numeroVendido) {
        int i = 0;
        while (i < inventario.length) {
            if (inventario[i].getNombre() == nombreProducto) {
                inventario[i].setStock(inventario[i].getStock() - numeroVendido);
                return inventario[i].getStock();
            }
            i++;
        }
        return 0;
    }

    public String mostrarInventario () {
        String resultado = "";
        for (int i = 0; i < inventario.length; i++){
            resultado += "Objeto " + (i+1) + ":" + inventario[i].imprimir() + " ";
        }
        return resultado;
    }
}

class Producto {
    private String nombre;
    private float precio;
    private int stock;

    /**
     * Constructores
     */

    public Producto () {};

    public Producto (String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Getters/Setters
     */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Metodos
     */

    public String imprimir () {
        return "Nombre:" + nombre + ", Precio:" + precio + ", Stock:" + stock;
    }
}