package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.VendaProdutoDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.VendaProduto;

public class VendaProdutoController extends GenericController<VendaProduto, Long> {

    private VendaProdutoDao vendaProdutoDao;

    public VendaProdutoController() {
        this.vendaProdutoDao = new VendaProdutoDao();
    }

    @Override
    protected GenericDao<VendaProduto, Long> getDao() {
        return this.vendaProdutoDao;
    }

}
