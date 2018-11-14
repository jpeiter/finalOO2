package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.CategoriaDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.Categoria;
import java.util.List;

public class CategoriaController extends GenericController<Categoria, Long> {

    private CategoriaDao categoriaDao;

    public CategoriaController() {
        this.categoriaDao = new CategoriaDao();
    }

    @Override
    protected GenericDao<Categoria, Long> getDao() {
        return this.categoriaDao;
    }

    public List<Categoria> findCategoriasByDescricao(String descricao) {
        return this.categoriaDao.findCategoriasByDescricao(descricao);
    }

}
