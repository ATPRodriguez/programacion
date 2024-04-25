package es.ies.puerto.modelo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Poderes")
public class Poder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int idPoder;

    @Column(name = "poder")
    String poder;
    @ManyToMany(mappedBy = "poderes",cascade = CascadeType.ALL)
    Set<Personaje> personajes;

    public Poder(){}

    public Poder(int idPoder) {
        this.idPoder = idPoder;
    }

    public Poder(int idPoder, String poder) {
        this.idPoder = idPoder;
        this.poder = poder;
    }

    public Poder(int idPoder, String poder, Set<Personaje> personajes) {
        this.idPoder = idPoder;
        this.poder = poder;
        this.personajes = personajes;
    }

    public int getIdPoder() {
        return idPoder;
    }

    public void setIdPoder(int idPoder) {
        this.idPoder = idPoder;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public Set<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Set<Personaje> heroCharacters) {
        this.personajes = heroCharacters;
    }


    @Override
    public String toString() {
        return "Power{" +
                "powerId=" + idPoder +
                ", power='" + poder + '\'' +
                ", heroCharacters=" + personajes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poder power = (Poder) o;
        return idPoder == power.idPoder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPoder);
    }
}