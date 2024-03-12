package ies.puerto.modelo.fichero.csv.implementacion;

import ies.puerto.modelo.entity.BibliotecaEntity;
import ies.puerto.modelo.entity.LibroEntity;
import ies.puerto.modelo.fichero.abstractas.BibliotecaAbstractFile;
import ies.puerto.modelo.interfaces.IBiblioteca;

import java.util.List;

public class BibliotecaCsv extends BibliotecaAbstractFile implements IBiblioteca {
    @Override
    public BibliotecaEntity buscarBiblioteca(int id) {
        return null;
    }

    @Override
    public BibliotecaEntity buscarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity actualizarBiblioteca(int id) {
        return null;
    }

    @Override
    public BibliotecaEntity eliminarBiblioteca(int id) {
        return null;
    }

    @Override
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }


}
