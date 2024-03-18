package ies.puerto.personaje;

import ies.puerto.utilidades.Utilidades;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Root (name = "personaje")
public class Personaje extends Utilidades {
    @Element (name = "nombre")
    private String nombre;
    @Element (name = "alias")
    private String alias;
    @Element (name = "genero")
    private String genero;
    @ElementList (name = "poderes")
    private Set<String> poderes;

    public Personaje(){
        poderes = new HashSet<>();
    }

    public Personaje(String alias){
        this.alias = alias;
    }

    public Personaje(String alias, String nombre, String genero, Set<String> poderes) {
        this.alias = alias;
        this.nombre = nombre;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje character = (Personaje) o;
        return Objects.equals(alias, character.alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }

    public String toCsv(){
        String poderesString = String.join(", ", poderes);
        poderesString = poderesString.replace("\"",  "");
        return nombre + DELIMITADOR + alias + DELIMITADOR + genero + DELIMITADOR +"\""+poderesString+"\"";
    }
}