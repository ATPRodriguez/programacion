package ies.puerto.app;

import ies.puerto.abstractas.Vehiculo;
import ies.puerto.vehiculos.*;

import java.util.*;

public class AppConcesionario {
    static Concesionario concesionario;
    static HashSet<Coche> coches;
    static Coche coche1;
    static Coche coche2;
    static Coche coche3;
    static Coche coche4;
    static Coche coche5;
    static List<Motocicleta> motocicletas;
    static Motocicleta motocicleta1;
    static Motocicleta motocicleta2;
    static Motocicleta motocicleta3;
    static Motocicleta motocicleta4;
    static Motocicleta motocicleta5;
    static HashMap<String, Camion> camiones;
    static Camion camion1;
    static Camion camion2;
    static Camion camion3;
    static Camion camion4;
    static Camion camion5;

    static HashMap<String, Bicicleta> bicicletas;
    static Bicicleta bicicleta1;
    static Bicicleta bicicleta2;
    static Bicicleta bicicleta3;
    static Bicicleta bicicleta4;
    static Bicicleta bicicleta5;

    public static void main(String[] args) {
        inicializarVariables();

        aniadirCoches();
        aniadirMotocicletas();
        aniadirCamiones();
        aniadirBicicletas();

        llamarMenu();
        System.out.println();
        System.out.println(concesionario);
    }

    public static void inicializarVariables() {
        concesionario = new Concesionario();

        coche1 = new Coche("Toyota","Corolla","ABC123",60);
        coche2 = new Coche("Honda","Civic","XYZ789",75);
        coche3 = new Coche("Ford","Mustang","DEF456",100);
        coche4 = new Coche("Chevrolet","Impala","GHI789",80);
        coche5 = new Coche("Volkswagen","Golf","JKL012",65);

        motocicleta1 = new Motocicleta("Harley-Davidson","Sportster","MNO345",50);
        motocicleta2 = new Motocicleta("Yamaha","YZF R6","PQR678",90);
        motocicleta3 = new Motocicleta("Ducati","Monster","STU901",70);
        motocicleta4 = new Motocicleta("Suzuki","GSX-R750","VWX234",80);
        motocicleta5 = new Motocicleta("Kawasaki","Ninja","ZAB567",85);

        camion1 = new Camion("Chevrolet","Silverado","UVW567",150);
        camion2 = new Camion("Ford","Ranger","LMN890",130);
        camion3 = new Camion("Toyota","Hilux","PQR123",140);
        camion4 = new Camion("Nissan","Navara","ABC456",145);
        camion5 = new Camion("Dodge","Ram","XYZ789",160);

        bicicleta1 = new Bicicleta("Trek","MountainBike","PQR456",30);
        bicicleta2 = new Bicicleta("Giant","CityBike","MNO789",25);
        bicicleta3 = new Bicicleta("Specialized","RoadBike","JKL012",28);
        bicicleta4 = new Bicicleta("Cannondale","HybridBike","DEF345",26);
        bicicleta5 = new Bicicleta("Schwinn","Cruiser","MNO678",22);

        coches = new HashSet<>();
        motocicletas = new ArrayList<>();
        camiones = new HashMap<>();
        bicicletas = new HashMap<>();
    }

    public static void aniadirCoches () {
        coches.add(coche1);
        coches.add(coche2);
        coches.add(coche3);
        coches.add(coche4);
        coches.add(coche5);

        concesionario.setCoches(coches);
    }

    public static void aniadirMotocicletas () {
        motocicletas.add(motocicleta1);
        motocicletas.add(motocicleta2);
        motocicletas.add(motocicleta3);
        motocicletas.add(motocicleta4);
        motocicletas.add(motocicleta5);

        concesionario.setMotocicletas(motocicletas);
    }

    public static void aniadirCamiones () {
        camiones.put(camion1.getMatricula(), camion1);
        camiones.put(camion2.getMatricula(), camion2);
        camiones.put(camion3.getMatricula(), camion3);
        camiones.put(camion4.getMatricula(), camion4);
        camiones.put(camion5.getMatricula(), camion5);

        concesionario.setCamiones(camiones);
    }

    public static void aniadirBicicletas () {
        bicicletas.put(bicicleta1.getMatricula(), bicicleta1);
        bicicletas.put(bicicleta2.getMatricula(), bicicleta2);
        bicicletas.put(bicicleta3.getMatricula(), bicicleta3);
        bicicletas.put(bicicleta4.getMatricula(), bicicleta4);
        bicicletas.put(bicicleta5.getMatricula(), bicicleta5);

        concesionario.setBicicletas(bicicletas);
    }

    /**
     * Funcion para llamar un menu
     */
    public static void llamarMenu () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido. " +
                "Seleccione una de las siguientes opciones para el concesionario(por el numero de opcion):");
        System.out.println("1.- Aniadir.");
        System.out.println("2.- Mostrar.");
        System.out.println("3.- Eliminar.");
        System.out.println("4.- Modificar.");
        System.out.println("5.- Velocidad media.");
        System.out.println();

        int respuesta = scanner.nextInt();
        menuRespuesta(respuesta);
    }

    /**
     * Continuacion del menu en base a la respuesta
     * @param respuesta (opcion del menu seleccionada)
     */
    public static void menuRespuesta(int respuesta) {
        Scanner scanner = new Scanner(System.in);
     switch (respuesta) {
         case 1:
             System.out.println("Que tipo de vehiculo desea aniadir? (Coche/Camion/Motocicleta/Bicicleta)");
             String vehiculoAniadir = scanner.nextLine();
             vehiculoAniadir = vehiculoAniadir.toLowerCase();
             opcionAniadir(vehiculoAniadir);
             System.out.println("El " + vehiculoAniadir + " ha sido aniadido");
             break;
         case 2:
             System.out.println("Que tipo de vehiculo desea mostrar? (Coche/Camion/Motocicleta/Bicicleta/Todos)");
             String vehiculoMostrar = scanner.nextLine();
             vehiculoMostrar = vehiculoMostrar.toLowerCase();
             opcionMostrar(vehiculoMostrar);
             break;
         case 3:
             System.out.println("Que tipo vehiculo desea eliminar? (Coche/Camion/Motocicleta/Bicicleta)");
             String vehiculoEliminar = scanner.nextLine();
             vehiculoEliminar = vehiculoEliminar.toLowerCase();
             opcionEliminar(vehiculoEliminar);
             break;
         case 4:
             System.out.println("Que tipo vehiculo desea modificar? (Coche/Camion/Motocicleta/Bicicleta)");
             String vehiculoModificar = scanner.nextLine();
             vehiculoModificar = vehiculoModificar.toLowerCase();
             opcionModificar(vehiculoModificar);
             break;
         case 5:
             System.out.println("Que tipo de vehiculo desea ver la velocidad media? " +
                     "(Coche/Camion/Motocicleta/Bicicleta/Todos)");
             String vehiculoVelocidad = scanner.nextLine();
             vehiculoVelocidad = vehiculoVelocidad.toLowerCase();
             opcionVelocidad(vehiculoVelocidad);
             break;
         default:
             System.out.println("No es una opcion valida");
             break;
     }
    }

    /**
     * Funcion que desarrolla la primera opcion del menu
     * @param vehiculo tipo de vehiculo a aniadir
     */
    public static void opcionAniadir (String vehiculo) {
        switch (vehiculo) {
            case "coche":
                Coche coche = (Coche) construirVehiculo(vehiculo);
                concesionario.addCoche(coche);
                break;
            case "motocicleta":
                Motocicleta motocicleta = (Motocicleta) construirVehiculo(vehiculo);
                concesionario.addMotocicleta(motocicleta);
                break;
            case "camion":
                Camion camion = (Camion) construirVehiculo(vehiculo);
                concesionario.addCamion(camion);
                break;
            case "bicicleta":
                Bicicleta bicicleta = (Bicicleta) construirVehiculo(vehiculo);
                concesionario.addBicicleta(bicicleta);
                break;
            default:
                System.out.println("La opcion introducida no es correcta");
                break;
        }
    }

    /**
     * Metodo que devuelve un vehiculo con los valores introducidos por el usuario
     * @param vehiculo tipo de vehiculo seleccionado
     * @return vehiculo con los valores del usuario
     */
    public static Vehiculo construirVehiculo (String vehiculo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la marca del " + vehiculo);
        String marca = scanner.nextLine();
        System.out.println("Introduzca el modelo del " + vehiculo);
        String modelo = scanner.nextLine();
        System.out.println("Introduzca la matricula del " + vehiculo);
        String matricula = scanner.nextLine();
        System.out.println("Introduzca la velocidad del " + vehiculo);
        int velocidad = scanner.nextInt();
        switch (vehiculo) {
            case "coche":
                Coche coche = new Coche(marca, modelo, matricula, velocidad);
                if (velocidad > coche.velocidadMaxima()) {
                    coche.setVelocidad(coche.velocidadMaxima());
                }
                return coche;
            case "motocicleta":
                Motocicleta motocicleta = new Motocicleta(marca, modelo, matricula, velocidad);
                if (velocidad > motocicleta.velocidadMaxima()) {
                    motocicleta.setVelocidad(motocicleta.velocidadMaxima());
                }
                return motocicleta;
            case "camion":
                Camion camion = new Camion(marca, modelo, matricula, velocidad);
                if (velocidad > camion.velocidadMaxima()) {
                    camion.setVelocidad(camion.velocidadMaxima());
                }
                return camion;
            case "bicicleta":
                Bicicleta bicicleta = new Bicicleta(marca, modelo, matricula, velocidad);
                if (velocidad > bicicleta.velocidadMaxima()) {
                    bicicleta.setVelocidad(bicicleta.velocidadMaxima());
                }
                return bicicleta;
        }
        return null;
    }

    /**
     * Funcion que desarrolla la segunda opcion del menu
     * @param vehiculo tipo de vehiculo a mostrar
     */
    public static void opcionMostrar (String vehiculo) {
        switch (vehiculo) {
            case "coche":
                System.out.println(concesionario.getCoches());
                break;
            case "motocicleta":
                System.out.println(concesionario.getMotocicletas());
                break;
            case "camion":
                System.out.println(concesionario.getCamiones());
                break;
            case "bicicleta":
                System.out.println(concesionario.getBicicletas());
                break;
            case "todos":
                System.out.println(concesionario);
        }
    }

    /**
     * Desarrollo de la tercera opcion del menu
     * @param vehiculo tipo de vehiculo para eliminar
     */
    public static void opcionEliminar (String vehiculo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la matricula del vehiculo a eliminar");
        System.out.println(concesionario);
        String matricula = scanner.nextLine();
        matricula = matricula.toUpperCase();
        switch (vehiculo) {
            case "coche":
                Coche coche = new Coche(matricula);
                if (!concesionario.getCoches().contains(coche)) {
                    System.out.println("Esa matricula no existe en el concesionario");
                    return;
                }
                concesionario.removeCoche(coche);
                break;
            case "motocicleta":
                Motocicleta motocicleta = new Motocicleta(matricula);
                if (!concesionario.getMotocicletas().contains(motocicleta)) {
                    System.out.println("Esa matricula no existe en el concesionario");
                    return;
                }
                concesionario.removeMotocicleta(motocicleta);
                break;
            case "camion":
                Camion camion = new Camion(matricula);
                if (!concesionario.getCamiones().containsValue(camion)) {
                    System.out.println("Esa matricula no existe en el concesionario");
                    return;
                }
                concesionario.removeCamion(camion);
                break;
            case "bicicleta":
                Bicicleta bicicleta = new Bicicleta(matricula);
                if (!concesionario.getBicicletas().containsValue(bicicleta)) {
                    System.out.println("Esa matricula no existe en el concesionario");
                    return;
                }
                concesionario.removeBicicleta(bicicleta);
                break;
        }
    }

    /**
     * Desarrollo de la cuarta opcion del menu
     * @param vehiculo tipo de vehiculo para modificar
     */
    public static void opcionModificar (String vehiculo) {
        Scanner scanner = new Scanner(System.in);
        switch (vehiculo) {
            case "coche":
                System.out.println("Que coche desea modificar? (Elija la matricula del coche)\n" + concesionario.getCoches());
                String matriculaCoche = scanner.nextLine();
                Coche cocheEliminar = new Coche(matriculaCoche);
                Coche coche = (Coche) construirVehiculo(vehiculo);
                concesionario.removeCoche(cocheEliminar);
                concesionario.addCoche(coche);
                break;
            case "motocicleta":
                System.out.println("Que motocicleta desea modificar? (Elija la matricula de la motocicleta)\n" +
                        concesionario.getMotocicletas());
                String matriculaMoto = scanner.nextLine();
                Motocicleta motoEliminar = new Motocicleta(matriculaMoto);
                Motocicleta motocicleta = (Motocicleta) construirVehiculo(vehiculo);
                concesionario.removeMotocicleta(motoEliminar);
                concesionario.addMotocicleta(motocicleta);
                break;
            case "camion":
                System.out.println("Que camion desea modificar? (Elija la matricula del camion)\n"
                        + concesionario.getCamiones());
                String matriculaCamion = scanner.nextLine();
                Camion camionEliminar = new Camion(matriculaCamion);
                Camion camion = (Camion) construirVehiculo(vehiculo);
                concesionario.removeCamion(camionEliminar);
                concesionario.addCamion(camion);
                break;
            case "bicicleta":
                System.out.println("Que bicicleta desea modificar? (Elija la matricula de la bicicleta)\n" +
                        concesionario.getBicicletas());
                String matriculaBicicleta = scanner.nextLine();
                Bicicleta bicicletaEliminar = new Bicicleta(matriculaBicicleta);
                Bicicleta bicicleta = (Bicicleta) construirVehiculo(vehiculo);
                concesionario.removeBicicleta(bicicletaEliminar);
                concesionario.addBicicleta(bicicleta);
                break;
        }
    }

    /**
     * Desarrollo de la quinta opcion del menu
     * @param vehiculo tipo de vehiculo para ver la velocidad media
     */
    public static void opcionVelocidad (String vehiculo) {
        switch (vehiculo) {
            case "coche":
                System.out.println(concesionario.velocidadMediaCoches());
                break;
            case "motocicleta":
                System.out.println(concesionario.velocidadMediaMotocicletas());
                break;
            case "camion":
                System.out.println(concesionario.velocidadMediaCamiones());
                break;
            case "bicicleta":
                System.out.println(concesionario.velocidadMediaBicicletas());
                break;
            case "todos":
                System.out.println(concesionario.velocidadMediaVehiculos());
        }
    }
}
