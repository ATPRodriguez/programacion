package ies.puerto;

/**
 * Supongamos que tenemos que implementar un programa que clasifica a los estudiantes según sus calificaciones en un examen.
 * Las notas son:
 *     Entre 0-4.99. Suspenso.
 *     Entre 5-5.99. Aprobado.
 *     Entre 6-6.99. Bien.
 *     Entre 7-8.99. Notable.
 *     Entre 9-9.99. Sobresaliente.
 *     Entre 10. Matrícula.
 *     Implementa la solución realizando dos métodos/programas. El primero utilizando if/else y el segundo utilizando switch.
 */
public class Ejercicio3 {

    /**
     * Ejercicio que clasifica a los estudiantes segun su nota usando if/else
     * @param calificacion del estudiante
     * @return Clasificacion del estudiante segun su calificacion
     */
    public String notasIfElse(float calificacion){
        if (calificacion < 0f) {
            calificacion = 0f;
        } else if (calificacion > 10f) {
            calificacion = 10f;

        }
        if (calificacion < 5){
            return "Suspenso";
        } else if (calificacion < 6) {
            return  "Aprobado";
        } else if (calificacion < 7) {
            return "Bien";
        } else if (calificacion < 9) {
            return "Notable";
        } else if (calificacion < 10) {
            return "Sobresaliente";
        } else {
        return "Matricula";
        }
    }

    /**
     * Ejercicio que clasifica a los estudiantes segun su nota usando switch
     * @param calificacion del estudiante
     * @return Clasificacion del estudiante segun su calificacion
     */
    public String notasSwitch (int calificacion){
        if (calificacion < 0) {
            calificacion = 0;
        } else if (calificacion > 10) {
            calificacion = 10;
        }
        switch (calificacion) {
            case 5:
                return "Aprobado";
            case 6:
                return "Bien";
            case 7:
                return "Notable";
            case 8:
                return  "Notable";
            case 9:
                return "Sobresaliente";
            case 10:
                return "Matricula";
            default:
                return "Suspenso";
        }
    }
}
