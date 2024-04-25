package es.ies.puerto.modelo.interfaces;

import es.ies.puerto.modelo.entities.Alias;

public interface IPersonaje {
    public Alias getAlias(int id);
    public Alias getAlias(Alias alias);
    public boolean updateAlias(Alias alias);
    public boolean addAlias(Alias alias);
    public void deleteAlias(int id);
    public void deleteAlias(Alias alias);
}
