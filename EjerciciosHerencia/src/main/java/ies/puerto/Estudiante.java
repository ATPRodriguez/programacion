package ies.puerto;

import ies.puerto.acceso.Autenticacion;
import ies.puerto.excepciones.ValidacionException;

public class Estudiante extends Persona {
    private String curso;
    private int[] notas = new int[5];
    Autenticacion autenticacion = new Autenticacion();

    public Estudiante () {}
    public Estudiante (String nombre, int edad, String dni, String curso, int[] notas) throws ValidacionException {
        super(nombre, edad, dni);
        if (autenticacion.validarCurso(curso)) {
            this.curso = curso;
            this.notas = notas;
        } else {
            throw new ValidacionException("Curso no es correcto");
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if (autenticacion.validarCurso(curso))
            this.curso = curso;
        else
            System.out.println("Curso no valido, no se ha podido hacer setCurso");
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    @Override
    public String saludar() {
        return "El estudiante " + getNombre() + " te saluda";
    }

    @Override
    public String toString() {
        return "Soy el estudiante " + getNombre() + ", tengo " + getEdad() + " anios, mi dni es: " + getDni() +
                " y estoy en el curso " + curso;
    }
}
