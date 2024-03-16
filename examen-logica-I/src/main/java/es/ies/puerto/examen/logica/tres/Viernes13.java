package es.ies.puerto.examen.logica.tres;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Viernes13 {
    public boolean esElFinDelMundo(Date fecha) {
        if (fecha == null) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);

        if (calendar.get(Calendar.DAY_OF_MONTH) == 13 && calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
            return true;
        }
        return false;
    }


}
