package ies.puerto.app;

import ies.puerto.impl.ReproductorMp3;
import ies.puerto.interfaz.IReproductor;

public class AppReproductor {
    static IReproductor reproductor;

    public static void main(String[] args) {
        reproductor = new ReproductorMp3();

        System.out.println(reproductor.reproducir());
        System.out.println(reproductor.detener());
        tipo(reproductor);
    }

    public static void tipo(IReproductor reproductor) {
        System.out.println(reproductor.getClass());
    }
}
