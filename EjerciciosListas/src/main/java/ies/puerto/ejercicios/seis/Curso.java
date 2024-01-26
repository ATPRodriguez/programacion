package ies.puerto.ejercicios.seis;

import ies.puerto.ejercicios.tres.Alumno;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private List<Alumno> alumnos;

    public Curso () {
        alumnos = new ArrayList<>();
    }
    public Curso (List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void agregarAlumnos(List<Alumno> alumnosAniadir) {
        alumnos.addAll(alumnosAniadir);
    }

    public void eliminarAlumno (List<Alumno> alumnosEliminar) {
        alumnos.removeAll(alumnosEliminar);
    }

    public float calcularMedia () {
        float resultado = 0f;
        for (Alumno alumno:alumnos) {
            resultado+=alumno.media();
        }
        return resultado/alumnos.size();
    }

    @Override
    public String toString() {
        return alumnos.toString();
    }
}
