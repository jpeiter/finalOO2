package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.ProdutoDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.Produto;
import java.util.List;

public class ProdutoController extends GenericController<Produto, Long> {

    private ProdutoDao produtoDao;

    public ProdutoController() {
        this.produtoDao = new ProdutoDao();
    }

    @Override
    protected GenericDao<Produto, Long> getDao() {
        return this.produtoDao;
    }

    public List<Produto> findProdutosByNome(String nome) {
        return this.produtoDao.findProdutosByNome(nome);
    }

    public List<Produto> findProdutoByNome(String nome) {
        return this.produtoDao.findProdutoByNome(nome);
    }

    public List<Produto> findProdutosByValor(Double valor) {
        return this.produtoDao.findProdutosByValor(valor);
    }

}
