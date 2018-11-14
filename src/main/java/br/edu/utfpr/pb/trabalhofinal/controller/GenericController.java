package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.AbstractModel;
import java.io.Serializable;
import java.util.List;

public abstract class GenericController<T extends AbstractModel, ID extends Serializable> {

    protected abstract GenericDao<T, ID> getDao();

    public List<T> listar() {
        return getDao().getAll();
    }

    public T buscar(ID id) {
        return getDao().getOne(id);
    }

    public void salvar(T entity) throws Exception {
        if (getDao().isValid(entity)) {
            getDao().save(entity);
        } else {
            throw new Exception(getDao().getErrors(entity));
        }
    }

    public void remover(ID id) {
        getDao().delete(id);
    }
}
