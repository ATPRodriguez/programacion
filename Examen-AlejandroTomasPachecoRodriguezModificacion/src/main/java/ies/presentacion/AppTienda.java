package ies.presentacion;

import ies.clases.*;
import ies.negocio.Tienda;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

public class AppTienda {
    static Tienda tienda;

    public static void main(String[] args) {
        inicializarVariables();
        llamarMenu();
    }

    public static void inicializarVariables () {
        Alimento alimento1 = new Alimento("Manzanas",2.50f,"2024-01-09","ALM001","2024-01-15");
        Alimento alimento2 = new Alimento("Leche",1.99f,"2024-02-09","ALM002","2024-02-14");
        Alimento alimento3 = new Alimento("Arroz",3.75f,"2024-01-15","ALM003","2024-01-27");

        List<Alimento> alimentos = new ArrayList<>();
        alimentos.add(alimento1);
        alimentos.add(alimento2);
        alimentos.add(alimento3);

        Aparato aparato1 = new Aparato("Televisor LED",499.99f,"2024-02-09","APA001");
        Aparato aparato2 = new Aparato("Smartphone",799.99f,"2024-02-09","APA002");
        Aparato aparato3 = new Aparato("Cafetera",39.99f,"2024-02-09","APA003");

        Set<Aparato> aparatos = new HashSet<>();
        aparatos.add(aparato1);
        aparatos.add(aparato2);
        aparatos.add(aparato3);

        CuidadoPersonal cuidadoPersonal1 = new CuidadoPersonal("Champú",3.99f,"2024-02-09","CUI001"
                ,7);
        CuidadoPersonal cuidadoPersonal2 = new CuidadoPersonal("Crema hidratante",5.49f,"2024-02-09","CUI002"
                ,8);
        CuidadoPersonal cuidadoPersonal3 = new CuidadoPersonal("Cepillo de dientes",2.29f,"2024-02-09"
                ,"CUI003",6);

        List<CuidadoPersonal> cuidadoPersonal = new ArrayList<>();
        cuidadoPersonal.add(cuidadoPersonal1);
        cuidadoPersonal.add(cuidadoPersonal2);
        cuidadoPersonal.add(cuidadoPersonal3);

        Souvenir souvenir1 = new Souvenir("Imán de nevera",1.99f,"2024-02-09","SOU001");
        Souvenir souvenir2 = new Souvenir("Llavero",0.99f,"2024-02-09","SOU002");
        Souvenir souvenir3 = new Souvenir("Taza de café",3.49f,"2024-02-09","SOU003");

        HashMap<String,Souvenir> souvenirs = new HashMap<>();
        souvenirs.put(souvenir1.getId(), souvenir1);
        souvenirs.put(souvenir2.getId(), souvenir2);
        souvenirs.put(souvenir3.getId(), souvenir3);

        tienda = new Tienda(alimentos, aparatos, souvenirs, cuidadoPersonal);
    }

    public static void llamarMenu () {
        Scanner scanner = new Scanner(System.in);
        int respuesta;
        do {
            System.out.println();
            System.out.println("Bienvenido.");
            System.out.println("Que desea hacer? (Introduzca el numero de opcion)");
            System.out.println("1.- Aniadir producto");
            System.out.println("2.- Mostrar producto");
            System.out.println("3.- Eliminar producto");
            System.out.println("4.- Modificar producto");
            System.out.println("5.- Ver la ganancia");
            System.out.println("6.- Ver el precio total");
            System.out.println("7.- Salir");
            respuesta = scanner.nextInt();

            switch (respuesta) {
                case 1:
                    opcionAniadir();
                    break;
                case 2:
                    opcionMostrar();
                    break;
                case 3:
                    opcionEliminar();
                    break;
                case 4:
                    opcionModificar();
                    break;
                case 5:
                    opcionGanancia();
                    break;
                case 6:
                    opcionPrecioTotal();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Esa opcion no existe");
                    break;
            }
        } while (respuesta != 7);
    }

    public static void opcionAniadir () {
        Scanner scannerAniadir = new Scanner(System.in);
        System.out.println("Que desea aniadir? (Alimento/Aparato/Cuidado Personal/Souvenir)");
        String respuesta = scannerAniadir.nextLine();
        switch (respuesta.toLowerCase()) {
            case "alimento":
                Alimento alimento = crearAlimento();
                tienda.addAlimento(alimento);
                break;
            case "aparato":
                Aparato aparato = crearAparato();
                tienda.addAparato(aparato);
                break;
            case "cuidado personal":
                CuidadoPersonal cuidadoPersonalAniadir = crearCuidadoPersonal();
                tienda.addCuidadoPersonal(cuidadoPersonalAniadir);
                break;
            case "souvenir":
                Souvenir souvenir = crearSouvenir();
                tienda.addSouvenir(souvenir);
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }

    public static Alimento crearAlimento () {
        Scanner scannerCrear = new Scanner(System.in);
        Scanner scannerID = new Scanner(System.in);
        Scanner scannerFecha = new Scanner(System.in);
        System.out.println("Introduzca el nombre del producto:");
        String nombre = scannerCrear.nextLine();
        System.out.println("Introduzca el precio");
        float precio = scannerCrear.nextFloat();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        String fechaActualString = format.format(fechaActual);
        System.out.println("Introduzca la id");
        String id = scannerID.nextLine();
        System.out.println("Introduzca la fecha de caducidad (el formato debe ser yyyy-MM-dd)");
        String fechaCaducidad = scannerFecha.nextLine();
        return new Alimento(nombre, precio, fechaActualString, id, fechaCaducidad);
    }

    public static Aparato crearAparato () {
        Scanner scannerCrear = new Scanner(System.in);
        Scanner scannerID = new Scanner(System.in);
        System.out.println("Introduzca el nombre del producto:");
        String nombre = scannerCrear.nextLine();
        System.out.println("Introduzca el precio");
        float precio = scannerCrear.nextFloat();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        String fechaActualString = format.format(fechaActual);
        System.out.println("Introduzca la id");
        String id = scannerID.nextLine();
        return new Aparato(nombre, precio, fechaActualString, id);
    }

    public static CuidadoPersonal crearCuidadoPersonal () {
        Scanner scannerCrear = new Scanner(System.in);
        Scanner scannerID = new Scanner(System.in);
        System.out.println("Introduzca el nombre del producto:");
        String nombre = scannerCrear.nextLine();
        System.out.println("Introduzca el precio");
        float precio = scannerCrear.nextFloat();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        String fechaActualString = format.format(fechaActual);
        System.out.println("Introduzca la id");
        String id = scannerID.nextLine();
        return new CuidadoPersonal(nombre, precio, fechaActualString, id);
    }

    public static Souvenir crearSouvenir () {
        Scanner scannerCrear = new Scanner(System.in);
        Scanner scannerID = new Scanner(System.in);
        System.out.println("Introduzca el nombre del producto:");
        String nombre = scannerCrear.nextLine();
        System.out.println("Introduzca el precio");
        float precio = scannerCrear.nextFloat();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = new Date();
        String fechaActualString = format.format(fechaActual);
        System.out.println("Introduzca la id");
        String id = scannerID.nextLine();
        return new Souvenir(nombre, precio, fechaActualString, id);
    }

    public static void opcionMostrar () {
        Scanner scannerMostrar = new Scanner(System.in);
        System.out.println("Que desea mostrar? (Alimentos/Aparatos/Cuidado Personal/Souvenirs/Todo)");
        String respuesta = scannerMostrar.nextLine();
        switch (respuesta.toLowerCase()) {
            case "alimentos":
                tienda.mostrarAlimentosDisponibles();
                break;
            case "aparatos":
                tienda.mostrarAparatosDisponibles();
                break;
            case "cuidado personal":
                System.out.println("Todos:");
                tienda.mostrarCuidadoPersonalDisponible();

                System.out.println();
                System.out.println("Populares:");
                tienda.mostrarCuidadoPersonalPopulares();
                break;
            case "souvenirs":
                tienda.mostrarSouvenirsDisponibles();
                break;
            case "todo":
                System.out.println(tienda);
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }

    public static void opcionEliminar () {
        Scanner scannerEliminar = new Scanner(System.in);
        Scanner scannerProductoEliminar = new Scanner(System.in);
        System.out.println("Que desea eliminar? (Alimento/Aparato/Cuidado Personal/Souvenir)");
        String respuesta = scannerEliminar.nextLine();
        switch (respuesta.toLowerCase()) {
            case "alimento":
                System.out.println("Estos son los alimentos que tenemos:\n" + tienda.getAlimentos());
                System.out.println("Cual desea eliminar? (Introduzca su id)");
                tienda.removeAlimento(scannerProductoEliminar.nextLine());
                break;
            case "aparato":
                System.out.println("Estos son los aparatos que tenemos:\n" + tienda.getAparatos());
                System.out.println("Cual desea eliminar? (Introduzca su id)");
                tienda.removeAparato(scannerProductoEliminar.nextLine());
                break;
            case "cuidado personal":
                System.out.println("Estos son los articulos de cuidado personal que tenemos:\n"
                        + tienda.getCuidadoPersonal());
                System.out.println("Cual desea eliminar? (Introduzca su id)");
                tienda.removeCuidadoPersonal(scannerProductoEliminar.nextLine());
                break;
            case "souvenir":
                System.out.println("Estos son los souvenirs que tenemos:\n" + tienda.getSouvenirs());
                System.out.println("Cual desea eliminar? (Introduzca su id)");
                tienda.removeSouvenir(scannerProductoEliminar.nextLine());
                break;
        }

    }

    public static void modificarAlimento (Alimento alimento) {
        Scanner scannerModificar = new Scanner(System.in);
        Scanner scannerModificacion = new Scanner(System.in);
        System.out.println("Que atributo desea modificar? (nombre/precio/fecha entrada/fecha caducidad)");
        String respuesta = scannerModificar.nextLine();
        switch (respuesta.toLowerCase()) {
            case "nombre":
                System.out.println("Introduzca el nuevo nombre del producto");
                alimento.setNombre(scannerModificacion.nextLine());
                break;
            case "precio":
                System.out.println("Introduzca el nuevo precio del producto");
                alimento.setPrecio(scannerModificacion.nextFloat());
                break;
            case "fecha entrada":
                System.out.println("Introduzca la nueva fecha de entrada del producto (en formato yyyy-MM-dd)");
                alimento.setFechaEntrada(scannerModificacion.nextLine());
                break;
            case "fecha salida":
                System.out.println("Introduzca la nueva fecha de caducidad del producto (en formato yyyy-MM-dd)");
                alimento.setFechaCaducidad(scannerModificacion.nextLine());
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }

    public static void opcionModificar () {
        Scanner scannerModificar = new Scanner(System.in);
        Scanner scannerSeleccion = new Scanner(System.in);
        System.out.println("Que desea modificar? (Alimento/Aparato/Cuidado Personal/Souvenir)");
        String respuesta = scannerModificar.nextLine();
        switch (respuesta.toLowerCase()) {
            case "alimento":
                System.out.println("Estos son nuestros alimentos:\n" + tienda.getAlimentos());
                System.out.println("Cual desea modificar?");
                modificarAlimento(tienda.obtenerAlimento(scannerSeleccion.nextLine()));
                break;
            case "aparato":
                System.out.println("Estos son nuestros aparatos:\n" + tienda.getAparatos());
                System.out.println("Cual desea modificar?");
                modificarAparato(tienda.obtenerAparato(scannerSeleccion.nextLine()));
                break;
            case "cuidado personal":
                System.out.println("Estos son nuestros articulos de cuidado personal:\n" + tienda.getCuidadoPersonal());
                System.out.println("Cual desea modificar?");
                modificarCuidadoPersonal(tienda.obtenerCuidadoPersonal(scannerSeleccion.nextLine()));
                break;
            case "souvenir":
                System.out.println("Estos son nuestros souvenirs:\n" + tienda.getSouvenirs());
                System.out.println("Cual desea modificar?");
                modificarSouvenir(tienda.obtenerSouvenir(scannerSeleccion.nextLine()));
                break;
        }
    }

    public static void modificarAparato (Aparato aparato) {
        Scanner scannerModificar = new Scanner(System.in);
        Scanner scannerModificacion = new Scanner(System.in);
        System.out.println("Que atributo desea modificar? (nombre/precio/fecha entrada)");
        String respuesta = scannerModificar.nextLine();
        switch (respuesta.toLowerCase()) {
            case "nombre":
                System.out.println("Introduzca el nuevo nombre del producto");
                aparato.setNombre(scannerModificacion.nextLine());
                break;
            case "precio":
                System.out.println("Introduzca el nuevo precio del producto");
                aparato.setPrecio(scannerModificacion.nextFloat());
                break;
            case "fecha entrada":
                System.out.println("Introduzca la nueva fecha de entrada del producto (en formato yyyy-MM-dd)");
                aparato.setFechaEntrada(scannerModificacion.nextLine());
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }

    public static void modificarCuidadoPersonal (CuidadoPersonal cuidadoPersonal) {
        Scanner scannerModificar = new Scanner(System.in);
        Scanner scannerModificacion = new Scanner(System.in);
        System.out.println("Que atributo desea modificar? (nombre/precio/fecha entrada)");
        String respuesta = scannerModificar.nextLine();
        switch (respuesta.toLowerCase()) {
            case "nombre":
                System.out.println("Introduzca el nuevo nombre del producto");
                cuidadoPersonal.setNombre(scannerModificacion.nextLine());
                break;
            case "precio":
                System.out.println("Introduzca el nuevo precio del producto");
                cuidadoPersonal.setPrecio(scannerModificacion.nextFloat());
                break;
            case "fecha entrada":
                System.out.println("Introduzca la nueva fecha de entrada del producto (en formato yyyy-MM-dd)");
                cuidadoPersonal.setFechaEntrada(scannerModificacion.nextLine());
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }

    public static void modificarSouvenir (Souvenir souvenir) {
        Scanner scannerModificar = new Scanner(System.in);
        Scanner scannerModificacion = new Scanner(System.in);
        System.out.println("Que atributo desea modificar? (nombre/precio/fecha entrada)");
        String respuesta = scannerModificar.nextLine();
        switch (respuesta.toLowerCase()) {
            case "nombre":
                System.out.println("Introduzca el nuevo nombre del producto");
                souvenir.setNombre(scannerModificacion.nextLine());
                break;
            case "precio":
                System.out.println("Introduzca el nuevo precio del producto");
                souvenir.setPrecio(scannerModificacion.nextFloat());
                break;
            case "fecha entrada":
                System.out.println("Introduzca la nueva fecha de entrada del producto (en formato yyyy-MM-dd)");
                souvenir.setFechaEntrada(scannerModificacion.nextLine());
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }

    public static void opcionGanancia() {
        Scanner scannerGanancia = new Scanner(System.in);
        System.out.println("Que ganancia desea ver? (Alimento/Aparato/Cuidado Personal/Souvenir/Todo)");
        String respuesta = scannerGanancia.nextLine();
        switch (respuesta.toLowerCase()) {
            case "alimento":
                System.out.println(tienda.gananciaAlimentos());
                break;
            case "aparato":
                System.out.println(tienda.gananciaAparatos());
                break;
            case "cuidado personal":
                System.out.println(tienda.gananciaCuidadoPersonal());
                break;
            case "souvenir":
                System.out.println(tienda.gananciaSouvenirs());
                break;
            case "todo":
                System.out.println(tienda.gananciaTodo());
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }

    public static void opcionPrecioTotal() {
        Scanner scannerPrecio = new Scanner(System.in);
        System.out.println("Que precio total desea ver? (Alimento/Aparato/Cuidado Personal/Souvenir/Todo)");
        String respuesta = scannerPrecio.nextLine();
        switch (respuesta.toLowerCase()) {
            case "alimento":
                System.out.println(tienda.precioTotalAlimentos());
                break;
            case "aparato":
                System.out.println(tienda.precioTotalAparatos());
                break;
            case "cuidado personal":
                System.out.println(tienda.precioTotalCuidadoPersonal());
                break;
            case "souvenir":
                System.out.println(tienda.precioTotalSouvenirs());
                break;
            case "todo":
                System.out.println(tienda.precioTotalTodo());
                break;
            default:
                System.out.println("Esa opcion no existe");
                break;
        }
    }
}
