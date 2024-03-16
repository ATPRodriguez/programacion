package ies.puerto;

public class MainPersona {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona("Alejandro", "12345678A", "27/05/2003");
        System.out.println(persona.informacion());
        System.out.println("Es mayor de Edad? " + persona.mayorEdad());
    }

}
