package ies.puerto;

public class Coche extends Vehiculo {
    private String matricula;
    private Conductor conductor;
    public Coche () {}

    public Coche (String marca, String modelo, float precio, String matricula, Conductor conductor) {
        super(marca, modelo, precio);
        this.matricula = matricula;
        this.conductor = conductor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public String toString() {
        return "Soy un coche " + super.toString() + ", mi matricula es " + this.matricula + " y mi conductor se llama: "
                + conductor.getNombre();
    }
}
