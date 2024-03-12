package ies.puerto;

/** 6. Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.
 */
public class NumerosArmstrong {
    public static void main(String[] args) {

        int numero = 0;
        int apoyo = 0;
        int numero2 = 0;
        int numeroCifras = 1;
        for (int i = 0; i <= 1000; i++) {
            numero2 = 0;
            numero = i;
            apoyo = 0;
            numeroCifras = 1;
            while (numero >= 10) {
                numero /= 10;
                numeroCifras += 1;
            }
            numero = i;
            while (numero >= 1) {
                apoyo = numero % 10;
                numero2 += Math.pow(apoyo, numeroCifras);
                numero /= 10;
            }
            numero = i;
            if ((numero2 == i) || (numeroCifras==1) || (i == 0))
                System.out.println(numero + " es un numero Armstrong");
        }
    }
}