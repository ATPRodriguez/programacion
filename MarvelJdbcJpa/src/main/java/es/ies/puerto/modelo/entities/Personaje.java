package es.ies.puerto.modelo.entities;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name="Personajes")
public class Personaje implements Serializable {
    private static final long serialVersionUID = -7250234396452258822L;
    @Id
    @GeneratedValue(generator = "gen_person", strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int personajeId;

    @Column(name = "nombre")
    private String nombre;
    @Column(name = "genero")
    private String genero;
    @OneToOne(mappedBy = "personaje", cascade = CascadeType.ALL)
    private Alias alias;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Personajes_Poderes", joinColumns = {
    @JoinColumn(name = "personaje_id",referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "poder_id",referencedColumnName = "id")})
    private Set<Poder> poderes;

    public Personaje(){
        poderes = new HashSet<>();
    }

    public Personaje(int id){
        this.personajeId = id;
    }

    public Personaje(int personajeId, String nombre, String genero) {
        this.personajeId = personajeId;
        this.nombre = nombre;
        this.genero = genero;
    }

    public Personaje(int personajeId, String nombre, String genero, Alias alias, Set<Poder> poderes) {
        this.personajeId = personajeId;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.poderes = poderes;
    }

    public int getPersonajeId() {
        return personajeId;
    }

    public void setPersonajeId(int personajeId) {
        this.personajeId = personajeId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Alias getAlias() {
        return alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    public Set<Poder> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<Poder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "personajeId=" + personajeId +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", alias=" + alias +
                ", poderes=" + poderes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personaje that = (Personaje) o;
        return personajeId == that.personajeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personajeId);
    }
}