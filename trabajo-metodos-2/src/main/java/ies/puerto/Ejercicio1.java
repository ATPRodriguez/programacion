package ies.puerto;

/**
 * Realizar un programa que calcule el sueldo de un trabajador,
 * el programa debe de tener un método que reciba el numero de horas que has trabajado en un mes, las horas se pagan a 10€.
 */
public class Ejercicio1 {
    /**
     * Ejercicio que calcula el sueldo segun horas trabajadas de un trabajador
     * @param numeroHoras hechas por el trabajador
     * @return sueldo del trabajador
     */
    public float calcularSueldoHoras(float numeroHoras){
        float sueldo = numeroHoras*10;
        return sueldo;
    }
}