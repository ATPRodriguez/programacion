package ies.puerto;

import java.util.Scanner;
/**
 * 2. Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números.
 * Se debe solicitar los números por teclado
 */
public class Mcd {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int menor = 0;
        int mcd = 0;

        Scanner lectura = new Scanner (System.in);

        System.out.println("Introduzca dos numeros para calcular su maximo comun divisor (use enter despues de cada numero)");
        numero1 = lectura.nextInt();
        numero2 = lectura.nextInt();

        if (numero1 <= numero2){
            menor = numero1;
        }
        else {
            menor = numero2;
        }
        for (int i = 1; i <= menor; i++){
            if ((numero1 % i ==0) && (numero2 % i == 0))
                mcd = i;
        }
        System.out.println("El mcd de "+numero1+" y "+numero2+" es:"+mcd);
    }
}