package ies.puerto.modelo.entity;

import java.util.HashSet;

public class BibliotecaEntity {
    private int id;
    private String nombre;
    private String direccion;
    private HashSet<LibroEntity> libros;
}
