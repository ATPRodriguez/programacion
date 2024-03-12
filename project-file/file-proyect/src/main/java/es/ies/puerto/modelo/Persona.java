package es.ies.puerto.modelo;

import es.ies.puerto.utilidades.UtilidadesClass;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.util.Objects;

@Root (name = "persona")
public class Persona extends UtilidadesClass {
    @Element (name = "id")
    private int id;
    @Element (name = "nombre")
    private String nombre;
    @Element (name = "edad")
    private int edad;
    @Element (name = "correo")
    private String email;

    public Persona () {}

    public Persona(int id) {
        this.id = id;
    }

    public Persona(int id, String nombre, int edad, String email) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'';
    }

    public String toCsv() {
        return id + DELIMITADOR + nombre + DELIMITADOR + edad + DELIMITADOR + email;
    }
}
