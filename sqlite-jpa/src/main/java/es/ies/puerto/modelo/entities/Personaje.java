package es.ies.puerto.modelo.entities;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Personajes")
public class Personaje implements Serializable {

	private static final long serialVersionUID = -7250234396452258822L;

	@Id
	@GeneratedValue(generator = "gen_person", strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "genero")
	private String genero;

	@OneToOne(mappedBy = "personaje")
	private Alias alias;

	/**
	@ManyToMany(fetch = FetchType.LAZY,
			cascade = {
					CascadeType.PERSIST,
					CascadeType.MERGE
			})
	 **/
	@ManyToMany(cascade = { CascadeType.ALL },
			fetch = FetchType.LAZY)
	@Fetch(FetchMode.SELECT)
	@JoinTable(name = "Personajes_Poderes",
			joinColumns = { @JoinColumn(name = "personaje_id") },
			inverseJoinColumns = { @JoinColumn(name = "poder_id")})
	private Set<Poder> poderes;

	public Personaje() {
		poderes = new HashSet<>();
	}

	public Personaje(Integer id) {
		this.id = id;
	}

	public Personaje(Integer id, String nombre, String genero) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
	}

	public Personaje(Integer id, String nombre, String genero, Alias alias, Set<Poder> poderes) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.alias = alias;
		this.poderes = poderes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
				"id=" + id +
				", nombre='" + nombre + '\'' +
				", genero='" + genero + '\'' +
				", alias=" + alias +
				", profesores=" + poderes +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Personaje personaje = (Personaje) o;
		return Objects.equals(id, personaje.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
