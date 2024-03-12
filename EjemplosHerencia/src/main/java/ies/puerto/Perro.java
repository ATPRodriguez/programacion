package ies.puerto;

public class Perro extends Especie{
    public Perro (String nombre, int chip) {
        super("Perro", nombre, chip);
    }

    @Override
    public String suSonido () {
        return "Guau";
    }
}
