package ies.puerto.app;

import ies.puerto.impl.LecturaDatosBaseDatos;
import ies.puerto.impl.LecturaDatosFicheros;
import ies.puerto.interfaz.ILecturaDatos;

public class AppLecturaDatos {
    static ILecturaDatos lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosBaseDatos();

        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.lectura());
        System.out.println(lecturaDatos.cierre());
        System.out.println();

        tipo(lecturaDatos);
    }

    public static void tipo(ILecturaDatos lecturaDatos) {
        System.out.println(lecturaDatos.getClass());
    }
}
