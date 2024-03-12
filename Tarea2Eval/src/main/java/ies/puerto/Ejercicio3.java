package ies.puerto;

/**
 *  Implementa un programa que calcule y muestre la suma de los dígitos de un número entero.
 *  Puntuación 1 punto.
 *  Con test que verifique el comportamiento 1,25).
 * @author ATPRodriguez
 */
public class Ejercicio3 {
    public int sumarDigitos (int numero) {
        int total = 0;
        while (numero / 10 > 0) {
            total+= numero % 10;
            numero /=10;
        }
        total+=numero;
        return total;
    }
}
