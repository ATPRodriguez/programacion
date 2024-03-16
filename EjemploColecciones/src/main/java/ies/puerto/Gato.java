package ies.puerto;

public class Gato extends Especie{

    public Gato (String nombre, int chip) {
        super("Gato", nombre, chip);
    }

    @Override
    public String suSonido() {
        return "Miauuu";
    }
}
