package ies.puerto;

public class Ejercicio7 {
    public static void main (String[] args) {
        String[] nombres = {"Alex", "Nabil", "Edu"};
        int[][] kms = {{1, 2, 3, 0, 0, 0, 0},
                {0, 0, 0, 0, 3, 2, 1},
                {1, 2, 3, 4, 5, 6, 7}};
        String[][] totalKms = new String[nombres.length][kms[0].length + 1];

        for (int i = 0; i < totalKms.length; i++) {
            for (int j = 0; j < totalKms[0].length; j++) {
                if (i == 0)
                    totalKms[i][j] = nombres[j];
                else
                    totalKms[j][i] = "" + kms[i - 1][j];
            }
        }
    }
}

