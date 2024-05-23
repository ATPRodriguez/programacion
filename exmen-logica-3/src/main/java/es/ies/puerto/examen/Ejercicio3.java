package es.ies.puerto.examen;

/**
 * Conversor de numeros
 */
public class Ejercicio3 {

    public long convertirAMilisegundos(int[] fecha) {
        long resultado = 0L;
        resultado+=(long) fecha[0]*1000*60*60*24;
        resultado+=(long) fecha[1]*1000*60*60;
        resultado+=(long) fecha[2]*1000*60;
        resultado+=(long) fecha[3]*1000;
        return resultado;
    }

    public int[] convertirAFecha(long milisegundos) {
        int segundos = (int) milisegundos / 1000;
        int minutos = 0;
        if (segundos > 60) {
            minutos = segundos / 60;
            segundos = segundos % 60;
        }
        int horas = 0;
        if (minutos > 60) {
            horas = minutos / 60;
            minutos = minutos % 60;
        }
        int dias = 0;
        if (horas > 24) {
            dias = horas / 24;
            horas = horas % 24;
        }
        return new int[]{dias, horas, minutos, segundos};
    }
}
