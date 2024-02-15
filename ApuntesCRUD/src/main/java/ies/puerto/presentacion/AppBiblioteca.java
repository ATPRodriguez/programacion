package ies.puerto.presentacion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {
    public static void main(String[] args) {
        List<Articulo> alimentos = lecturaAlimentos("src/main/resources/alimentos.csv");
        System.out.println(alimentos);
        System.out.println();
        List<Personaje> personajes =lecturaOrv("src/main/resources/orv.csv");
        System.out.println(personajes);
    }

    public static boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }

    public static boolean existeDirectortio(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isDirectory();
    }


    // Ejemplo básico de lectura de ficheros linea a linea
    public static List<Articulo> lecturaAlimentos(String path) {
        List<Articulo> articulos = new ArrayList<>();
        File fichero = new File(path);
        // Verificar si el fichero existe antes de intentar leerlo
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i > 0) {
                        String[] alimentoArray = linea.split(",");
                        Alimento alimento = new Alimento(alimentoArray[3], alimentoArray[0], Float.parseFloat(alimentoArray[1])
                                , alimentoArray[2], alimentoArray[4]);
                        articulos.add(alimento);
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }

    public static List<Personaje> lecturaOrv(String path) {
        List<Personaje> personajes = new ArrayList<>();
        File fichero = new File(path);
        // Verificar si el fichero existe antes de intentar leerlo
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                int i = 0;
                while ((linea = br.readLine()) != null) {
                    if (i > 0) {
                        String[] personajeArray = linea.split(",");
                        Personaje personaje = new Personaje(personajeArray[0], personajeArray[1], personajeArray[2]
                                , personajeArray[3]);
                        personajes.add(personaje);
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return personajes;
    }
}
