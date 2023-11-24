package ies.puerto;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Hola chicos esto sera un error");

        try {
            File archivo = new File("archivo.txt");
            FileReader lector = new FileReader(archivo);
        } catch (FileNotFoundException exception) {
            System.out.println("Es una exception FileNotFoundException");
        }
    }
}