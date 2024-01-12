package ies.puerto.acceso;

import ies.puerto.Persona;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Autenticacion {

    public boolean validarNombre (String nombre) {
        String regex = "^[A-Z][a-z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombre);

        return matcher.matches();
    }
    public boolean validarDni (String dni) {
        String regex = "\\d{8}[A-Z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dni);

        return matcher.matches();
    }

    public boolean validarCurso (String curso) {
        String regex = "^\\d\\s[A-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(curso);

        return matcher.matches();
    }
}
