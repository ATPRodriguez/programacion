package es.ies.puerto.modelo.db;

import es.ies.puerto.modelo.abstractas.OperacionesJpaAbstract;
import es.ies.puerto.modelo.entities.Personaje;
import es.ies.puerto.modelo.interfaces.ICrudDb;

import java.util.*;
import javax.persistence.*;


public class OperacionesJpa extends OperacionesJpaAbstract implements ICrudDb {
    public OperacionesJpa (EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public List<Personaje> obtenerPersonajes() {
        EntityManager em = super.getEmf().createEntityManager();
        String queryAll =  "SELECT p FROM "+Personaje.class.getName()+" AS p";
        List<Personaje> heroCharacters= em.createQuery(queryAll, Personaje.class).getResultList();
        closeEntityManager(em);
        return heroCharacters;
    }

    @Override
    public Personaje obtenerPersonaje(Personaje personaje) {
        EntityManager em = super.getEmf().createEntityManager();
        personaje = em.find(Personaje.class, personaje.getId());
        closeEntityManager(em);
        return personaje;
    }

    @Override
    public void agregarPersonaje(Personaje personaje) {
        EntityManager em = getEm();
        Personaje attachedEntity = em.merge(personaje);
        em.getTransaction().begin();
        em.persist(attachedEntity);
        em.getTransaction().commit();
        closeEntityManager(em);
    }

    @Override
    public void eliminarPersonaje(Personaje personaje) {
        EntityManager em = super.getEmf().createEntityManager();
        em.getTransaction().begin();
        em.remove(em.contains(personaje) ? personaje : em.merge(personaje));
        em.getTransaction().commit();
        closeEntityManager(em);
    }

    @Override
    public void actualizarPersonaje(Personaje personaje) {
        EntityManager em = super.getEmf().createEntityManager();
        em.getTransaction().begin();
        em.merge(personaje);
        em.getTransaction().commit();
        closeEntityManager(em);
    }
}