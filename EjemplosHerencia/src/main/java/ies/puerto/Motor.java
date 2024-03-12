package ies.puerto;

public class Motor extends Vehiculo {
    private String matricula;
    public Motor() {}

    public Motor(String color) {
        super(color);
    }

    public Motor(String color, String matricula) {
        super(color);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
