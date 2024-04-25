package es.ies.puerto.modelo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Alias")
public class Alias implements Serializable {

    private static final long serialVersionUID = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "personaje_id")
    private Integer personaje_id;
    @Column(name = "alias")
    private String alias;
    @OneToOne
    private Personaje personaje;

    public Alias() {
    }

    public Alias(Integer id) {
        this.id = id;
    }

    public Alias(Integer id, Personaje personaje, String alias) {
        this.id = id;
        this.personaje_id = personaje.getId();
        this.alias = alias;
        this.personaje = personaje;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPersonaje_id() {
        return personaje_id;
    }

    public void setPersonaje_id(Integer personaje_id) {
        this.personaje_id = personaje_id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Alias{" +
                "id=" + id +
                ", personaje_id=" + personaje_id +
                ", alias='" + alias + '\'' +
                ", personaje=" + personaje +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return Objects.equals(id, alias.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
