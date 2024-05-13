package es.ies.puerto.modelo.abstractas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public abstract class OperacionesJpaAbstract {
    EntityManagerFactory emf;
    EntityManager em;

    public OperacionesJpaAbstract(EntityManagerFactory emf) {
        this.emf = emf;
    }
    public void closeEntityManager(EntityManager em){
        if (em!=null) {
            em.close();
        }
    }

    public EntityManager getEm() {
        if (em == null || (!em.isOpen())) {
            em = emf.createEntityManager();
        }
        return em;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

}