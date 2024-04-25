package es.ies.puerto.modelo.implementacion;

import es.ies.puerto.modelo.abstractas.CrudEntityAbstract;
import es.ies.puerto.modelo.entities.Alias;

import javax.persistence.EntityManagerFactory;

public class CrudAlias extends CrudEntityAbstract {

    public CrudAlias(EntityManagerFactory emf) {
        super(emf);
    }

    public Alias getAlias(int id) {
        Alias alias = new Alias(id);
        return getAlias(alias);
    }

    public Alias getAlias(Alias alias) {
        return getEm().find(Alias.class,alias.getId());
    }

    public boolean updateAlias(Alias alias) {
        try {
            getEm().getTransaction().begin();
            getEm().merge(alias);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
           if (getEm()!= null && getEm().isOpen()) {
               getEm().close();
           }
        }
    }

    public boolean addAlias(Alias alias) {
        try {
            getEm().getTransaction().begin();
            getEm().persist(alias);
            getEm().getTransaction().commit();
            return true;
        }catch (Exception exception){
            return false;
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }

    public void deleteAlias(int id) {
        deleteAlias(new Alias(id));
    }


    public void deleteAlias(Alias alias) {
        try {
            getEm().getTransaction().begin();
            getEm().remove(alias);
            getEm().getTransaction().commit();
        }catch (Exception exception){
            throw new RuntimeException(exception);
        }finally {
            if (getEm()!= null && getEm().isOpen()) {
                getEm().close();
            }
        }
    }
}
