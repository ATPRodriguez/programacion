package es.ies.puerto.file.uno;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

@Root (name = "criaturas")
public class CriaturaList {

    @ElementList (inline = true)
    List<Criatura> listaCriaturas;

    public CriaturaList() {
        listaCriaturas = new ArrayList<>();
    }

    public CriaturaList(List<Criatura> criaturaList) {
        this.listaCriaturas = criaturaList;
    }

    public List<Criatura> getListaCriaturas() {
        return listaCriaturas;
    }

    public void setListaCriaturas(List<Criatura> listaCriaturas) {
        this.listaCriaturas = listaCriaturas;
    }


}
