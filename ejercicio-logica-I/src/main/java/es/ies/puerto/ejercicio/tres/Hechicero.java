package es.ies.puerto.ejercicio.tres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hechicero {

    public char vocalMasPoderosa(String texto) {
        char vocal = ' ';
        String vocales = "";
        for (int i = 0; i < texto.length(); i++) {
            if (esVocal(texto.charAt(i))) {
                vocales += texto.charAt(i);
            }
        }
        vocal = contarVocales(vocales);
        return vocal;
    }

    public boolean esVocal (char caracter) {
        switch (caracter) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    public char contarVocales (String vocales) {
        if (vocales.equals("")) {
            return ' ';
        }
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
        for (int i = 0; i < vocales.length(); i++) {
            switch (vocales.charAt(i)) {
                case 'a':
                case 'A':
                    contadorA++;
                    break;
                case 'e':
                case 'E':
                    contadorE++;
                    break;
                case 'i':
                case 'I':
                    contadorI++;
                    break;
                case 'o':
                case 'O':
                    contadorO++;
                    break;
                case 'u':
                case 'U':
                    contadorU++;
                    break;
            }
        }
        return vocalMasRepetida(contadorA, contadorE, contadorI, contadorO, contadorU);
    }

    public int mayor (int contadorA, int contadorE) {
        int mayor = contadorA;
        if (contadorE > contadorA) {
            mayor = contadorE;
        }
        return mayor;
    }

    public int mayor (int contadorA, int contadorE, int contadorI, int contadorO) {
        return mayor((mayor(contadorA, contadorE)), mayor(contadorI, contadorO));
    }

    public char vocalMasRepetida (int contadorA, int contadorE, int contadorI, int contadorO, int contadorU) {
        int mayor = mayor(mayor(contadorA, contadorE, contadorI, contadorO), contadorU);
        if (mayor == contadorA) {
            return 'a';
        }
        if (mayor == contadorE) {
            return 'e';
        }
        if (mayor == contadorI) {
            return 'i';
        }
        if (mayor == contadorO) {
            return 'o';
        }
        if (mayor == contadorU) {
            return 'u';
        }
        return ' ';
    }
}
