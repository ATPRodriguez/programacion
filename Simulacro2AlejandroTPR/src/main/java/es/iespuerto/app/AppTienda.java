package es.iespuerto.app;

import es.iespuerto.productos.Alimento;
import es.iespuerto.productos.Electronica;
import es.iespuerto.productos.Soubenir;
import es.iespuerto.productos.Supermercado;

import java.text.SimpleDateFormat;
import java.util.*;

public class AppTienda {
    static Supermercado supermercado;

    static HashSet<Alimento> alimentos;
    static Alimento alimento1;
    static Alimento alimento2;
    static Alimento alimento3;
    static Alimento alimento4;
    static Alimento alimento5;
    static Alimento alimento6;
    static Alimento alimento7;
    static Alimento alimento8;
    static Alimento alimento9;
    static Alimento alimento10;

    static ArrayList<Electronica> electronica;
    static Electronica electronica1;
    static Electronica electronica2;
    static Electronica electronica3;
    static Electronica electronica4;
    static Electronica electronica5;
    static Electronica electronica6;
    static Electronica electronica7;
    static Electronica electronica8;
    static Electronica electronica9;
    static Electronica electronica10;

    static HashMap<String, Soubenir> soubenirs;
    static Soubenir soubenir1;
    static Soubenir soubenir2;
    static Soubenir soubenir3;
    static Soubenir soubenir4;
    static Soubenir soubenir5;
    static Soubenir soubenir6;
    static Soubenir soubenir7;
    static Soubenir soubenir8;
    static Soubenir soubenir9;
    static Soubenir soubenir10;

    public static void main(String[] args) {
        declararVariables();

        llamarMenu();
    }

    public static void declararVariables () {
        alimento1 = new Alimento("Alimento1",2.50f,"2024-01-01","udi1");
        alimento2 = new Alimento("Alimento2",3.50f,"2024-01-02","udi2");
        alimento3 = new Alimento("Alimento3",4.50f,"2024-01-03","udi3");
        alimento4 = new Alimento("Alimento4",5.50f,"2024-01-04","udi4");
        alimento5 = new Alimento("Alimento5",6.50f,"2024-01-05","udi5");
        alimento6 = new Alimento("Alimento6",7.50f,"2024-01-06","udi6");
        alimento7 = new Alimento("Alimento7",8.50f,"2024-01-07","udi7");
        alimento8 = new Alimento("Alimento8",9.50f,"2024-01-08","udi8");
        alimento9 = new Alimento("Alimento9",10.50f,"2024-01-09","udi9");
        alimento10 = new Alimento("Alimento10",11.50f,"2024-01-10","udi10");

        alimentos = new HashSet<>();
        alimentos.add(alimento1);
        alimentos.add(alimento2);
        alimentos.add(alimento3);
        alimentos.add(alimento4);
        alimentos.add(alimento5);
        alimentos.add(alimento6);
        alimentos.add(alimento7);
        alimentos.add(alimento8);
        alimentos.add(alimento9);
        alimentos.add(alimento10);

        electronica1 = new Electronica("Electronico1",500.00f,"2022-02-01","udi1");
        electronica2 = new Electronica("Electronico2",501.00f,"2022-02-02","udi2");
        electronica3 = new Electronica("Electronico3",502.00f,"2022-02-03","udi3");
        electronica4 = new Electronica("Electronico4",503.00f,"2022-02-04","udi4");
        electronica5 = new Electronica("Electronico5",504.00f,"2022-02-05","udi5");
        electronica6 = new Electronica("Electronico6",505.00f,"2022-02-06","udi6");
        electronica7 = new Electronica("Electronico7",506.00f,"2022-02-07","udi7");
        electronica8 = new Electronica("Electronico8",507.00f,"2022-02-08","udi8");
        electronica9 = new Electronica("Electronico9",508.00f,"2022-02-09","udi9");
        electronica10 = new Electronica("Electronico10",509.00f,"2022-02-10","udi10");

        electronica = new ArrayList<>();
        electronica.add(electronica1);
        electronica.add(electronica2);
        electronica.add(electronica3);
        electronica.add(electronica4);
        electronica.add(electronica5);
        electronica.add(electronica6);
        electronica.add(electronica7);
        electronica.add(electronica8);
        electronica.add(electronica9);
        electronica.add(electronica10);

        soubenir1 = new Soubenir("Soubenir1",10.00f,"2022-03-01","udi1");
        soubenir2 = new Soubenir("Soubenir2",11.00f,"2022-03-02","udi2");
        soubenir3 = new Soubenir("Soubenir3",12.00f,"2022-03-03","udi3");
        soubenir4 = new Soubenir("Soubenir4",13.00f,"2022-03-04","udi4");
        soubenir5 = new Soubenir("Soubenir5",14.00f,"2022-03-05","udi5");
        soubenir6 = new Soubenir("Soubenir6",15.00f,"2022-03-06","udi6");
        soubenir7 = new Soubenir("Soubenir7",16.00f,"2022-03-07","udi7");
        soubenir8 = new Soubenir("Soubenir8",17.00f,"2022-03-08","udi8");
        soubenir9 = new Soubenir("Soubenir9",18.00f,"2022-03-09","udi9");
        soubenir10 = new Soubenir("Soubenir10",19.00f,"2022-03-10","udi10");

        soubenirs = new HashMap<>();
        soubenirs.put(soubenir1.getUdi(), soubenir1);
        soubenirs.put(soubenir2.getUdi(), soubenir2);
        soubenirs.put(soubenir3.getUdi(), soubenir3);
        soubenirs.put(soubenir4.getUdi(), soubenir4);
        soubenirs.put(soubenir5.getUdi(), soubenir5);
        soubenirs.put(soubenir6.getUdi(), soubenir6);
        soubenirs.put(soubenir7.getUdi(), soubenir7);
        soubenirs.put(soubenir8.getUdi(), soubenir8);
        soubenirs.put(soubenir9.getUdi(), soubenir9);
        soubenirs.put(soubenir10.getUdi(), soubenir10);

        supermercado = new Supermercado(alimentos, electronica, soubenirs);

    }

    public static void llamarMenu () {
        Scanner scanner = new Scanner(System.in);
        int respuesta = 0;
        System.out.println("Bienvenido al supermercado.");
        do {
        System.out.println("Que desea? (Introduzca el numero de opcion)");
        System.out.println("1.- Aniadir");
        System.out.println("2.- Mostrar");
        System.out.println("3.- Eliminar");
        System.out.println("4.- Modificar");
        System.out.println("5.- Salir");

        respuesta = scanner.nextInt();
        switch (respuesta) {
            case 1:
                opcionAniadir();
                break;
            case 2:
                opcionMostrar();
                break;
            case 3:
                //A
                break;
            case 4:
                //A
                break;
            case 5:
                System.out.println("Cerrando menu...");
                break;
            default:
                System.out.println("Esa opcion no existe.");
        }
        } while (respuesta != 5);
    }

    public static void opcionAniadir () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que desea aniadir? (Alimento/Electronica/Soubenir)");
        String respuesta = scanner.nextLine();
        respuesta = respuesta.toLowerCase();
        switch (respuesta) {
            case "alimento":
                aniadirAlimento(scanner);
                break;
            case "electronica":
                aniadirElectronica(scanner);
                break;
            case "soubenir":
                aniadirSoubenir(scanner);
                break;
        }
    }

    public static void aniadirAlimento (Scanner scanner) {
        System.out.println("Introduzca el nombre.");
        String nombre = scanner.nextLine();

        System.out.println("Introduzca el precio.");
        float precio = scanner.nextFloat();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        String fecha = format.format(fechaActual);

        System.out.println("Introduzca el udi (debe ser distinto a los ya existentes)");
        String udi = scanner.nextLine();

        Alimento alimento = new Alimento(nombre, precio, fecha, udi);
        supermercado.addAlimento(alimento);
    }

    public static void aniadirElectronica (Scanner scanner) {
        System.out.println("Introduzca el nombre.");
        String nombre = scanner.nextLine();

        System.out.println("Introduzca el precio.");
        float precio = scanner.nextFloat();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        String fecha = format.format(fechaActual);

        System.out.println("Introduzca el udi (debe ser distinto a los ya existentes)");
        String udi = scanner.nextLine();

        Electronica electronico = new Electronica(nombre, precio, fecha, udi);
        supermercado.addElectronica(electronico);
    }

    public static void aniadirSoubenir (Scanner scanner) {
        System.out.println("Introduzca el nombre.");
        String nombre = scanner.nextLine();

        System.out.println("Introduzca el precio.");
        float precio = scanner.nextFloat();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        String fecha = format.format(fechaActual);

        System.out.println("Introduzca el udi (debe ser distinto a los ya existentes)");
        String udi = scanner.nextLine();

        Soubenir soubenirAniadir = new Soubenir(nombre, precio, fecha, udi);
        supermercado.addSoubenir(soubenirAniadir);
    }

    public static void opcionMostrar () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que desea mostrar? (Alimento/Electronica/Soubenir/Todo)");
        String respuesta = scanner.nextLine();
        respuesta = respuesta.toLowerCase();
        switch (respuesta) {
            case "alimento":
                System.out.println(supermercado.getAlimentos());
                break;
            case "electronica":
                System.out.println(supermercado.getElectronica());
                break;
            case "soubenir":
                System.out.println(supermercado.getSoubenirs());
                break;
            case "todo":
                System.out.println(supermercado);
                break;
        }
    }
}
