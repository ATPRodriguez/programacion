package ies.puerto;

public class Ejercicio1 {
    public boolean verificarNotas (int nota1, int nota2, int nota3, int nota4, int nota5) {
        boolean notasCorrectas = true;
        if (nota1 < 0 || nota1 > 10) {
            return false;
        } else if (nota2 < 0 || nota2 > 10) {
            return false;
        } else if (nota3 < 0 || nota3 > 10) {
            return false;
        } else if (nota4 < 0 || nota4 > 10) {
            return  false;
        } else if (nota5 < 0 || nota5 > 10) {
            return false;
        }
        return true;
    }
}
