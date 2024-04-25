package es.ies.puerto.modelo.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name="Alias")
public class Alias implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int aliasId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personaje_id")
    private Personaje personaje;
    @Column(name = "alias")
    private String alias;

    public Alias (){}

    public Alias(int aliasId) {
        this.aliasId = aliasId;
    }

    public Alias(int aliasId, Personaje heroCharacter, String alias) {
        this.aliasId = aliasId;
        this.personaje = heroCharacter;
        this.alias = alias;
    }

    public int getAliasId() {
        return aliasId;
    }

    public void setAliasId(int aliasId) {
        this.aliasId = aliasId;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Alias{" +
                "aliasId=" + aliasId +
                ", heroCharacter=" + personaje +
                ", alias='" + alias + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return aliasId == alias.aliasId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliasId);
    }
}