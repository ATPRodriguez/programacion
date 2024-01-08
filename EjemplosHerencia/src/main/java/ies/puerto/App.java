package ies.puerto;

public class App {
    static Coche miCoche;
    static Coche miCocheColor;
    static Coche miCocheMatricula;
    static Bicicleta miBicicleta;

    public static void main(String[] args) {
        miCoche = new Coche();
        miCocheColor = new Coche("Rojo");
        miCocheMatricula = new Coche("Azul", "TF1965AK");

        miCoche.mover();
        miCoche.miColor();
        System.out.println(miCoche.toString());

        miCocheColor.mover();
        miCocheColor.miColor();
        System.out.println(miCocheColor.toString());

        miCocheMatricula.mover();
        miCocheMatricula.miColor();
        System.out.println(miCocheMatricula.toString());

        miBicicleta = new Bicicleta("L", "Negra");
        miBicicleta.mover();
        miBicicleta.miColor();
        System.out.println(miBicicleta.toString());
    }
}
