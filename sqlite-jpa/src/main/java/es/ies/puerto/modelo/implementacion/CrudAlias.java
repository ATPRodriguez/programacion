package es.ies.puerto.modelo.implementacion;

import es.ies.puerto.modelo.abstractas.CrudEntityAbstract;
import es.ies.puerto.modelo.entities.Alias;
import es.ies.puerto.modelo.interfaces.IPersonaje;

import javax.persistence.EntityManagerFactory;

public class CrudAlias extends CrudEntityAbstract implements IPersonaje {

    public CrudAlias(EntityManagerFactory emf) {
        super(emf);
    }

    @Override
    public Alias getAlias(int id) {
        Alias alias = new Alias(id);
        return getAlias(alias);
    }

    @Override
    public Alias getAlias(Alias alias) {
        return getEm().find(Alias.class,alias.getId());
    }

    @Override
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

    @Override
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

    @Override
    public void deleteAlias(int id) {
        deleteAlias(new Alias(id));
    }


    @Override
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
