package ies.puerto;

/**
 * Declara un array de 3 elementos e intenta acceder al cuarto elemento.
 * Maneja la excepción ArrayIndexOutOfBoundsException.
 * @author ATPRodriguez
 */
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        int[] array = new int[3];
        try {
            array[4] = 5;
        } catch (ArrayIndexOutOfBoundsException exception) {
            throw new Exception("Se ha intentado acceder a una posicion fuera de los limites del array");
        }
    }
}
