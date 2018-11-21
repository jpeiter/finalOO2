package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.FornecedorDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.Fornecedor;
import java.util.List;

public class FornecedorController extends GenericController<Fornecedor, Long> {

    private FornecedorDao fornecedorDao;

    public FornecedorController() {
        this.fornecedorDao = new FornecedorDao();
    }

    @Override
    protected GenericDao<Fornecedor, Long> getDao() {
        return this.fornecedorDao;
    }

    public List<Fornecedor> findFornecedorByCNPJ(String cnpj) {
        return this.fornecedorDao.findFornecedorByCNPJ(cnpj);
    }

    public List<Fornecedor> findFornecedorByNome(String nome) {
        return this.fornecedorDao.findFornecedorByNome(nome);
    }

}
