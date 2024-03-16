package ies.puerto;

public class AppAnimal {

    //static Animal animal;
    static Gato gato;
    static Perro perro;
    static Loro loro;
    static Serpiente serpiente;

    public static void main(String[] args) {
        //animal = new Animal();
        //System.out.println("Sonido Animal: " + animal.suSonido());

        gato = new Gato("Pepe",1);
        System.out.println("Sonido Gato: " + gato.suSonido());
        System.out.println(gato.toString());

        perro = new Perro("Paco", 2);
        System.out.println("Sonido Perro: " + perro.suSonido());
        System.out.println(perro.toString());

        loro = new Loro("Juanito", 3);
        System.out.println(loro.suSonido());

        serpiente = new Serpiente();
        System.out.println(serpiente.suSonido());
    }
}
