package es.ies.puerto.examen.logica.dos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SAnillo {
    final String expresionRegular = "^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$";
    private final String fechaEstreno = "17/12/2003";
    Date dFechaEstreno = null;
    private final String formatDate = "dd/MM/yyyy";
    SimpleDateFormat dateFormat;

    public SAnillo() {
        dateFormat = new SimpleDateFormat(formatDate);
        try {
            dFechaEstreno = dateFormat.parse(fechaEstreno);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public long obtenerDiasDesdeRetornoRey(String fecha) {
        if (fecha == null) {
            return -1;
        }

        Pattern pattern = Pattern.compile(expresionRegular);
        Matcher matcher = pattern.matcher(fecha);
        if (!matcher.matches()) {
            return -1;
        }

        Date fechaActual = new Date();
        Date fechaIntroducida = new Date();

        try {
            fechaActual = dateFormat.parse(dateFormat.format(fechaActual));
            if (fecha.isEmpty()) {
                fechaIntroducida = fechaActual;
            } else {
                fechaIntroducida = dateFormat.parse(fecha);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e.getMessage());
        }

        long diferencia = Math.abs(dFechaEstreno.getTime() - fechaIntroducida.getTime());
        return (diferencia / (1000 * 60 * 60 * 24));
    }
}
