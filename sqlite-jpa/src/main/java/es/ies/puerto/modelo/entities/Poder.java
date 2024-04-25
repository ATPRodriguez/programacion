package es.ies.puerto.modelo.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Poderes")
public class Poder {
    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "poder")
    private String poder;

    @ManyToMany(fetch = FetchType.LAZY,
            mappedBy = "poderes")
    @Fetch(FetchMode.SELECT)
    private Set<Personaje> personajes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public void setPersonajes(Set<Personaje> personajes) {
        this.personajes = personajes;
    }

    @Override
    public String toString() {
        return "Poder{" +
                "id=" + id +
                ", poder='" + poder + '\'' +
                ", personajes=" + personajes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poder poder = (Poder) o;
        return Objects.equals(id, poder.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
