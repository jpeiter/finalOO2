package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.CidadeDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.Cidade;
import br.edu.utfpr.pb.trabalhofinal.model.Estado;
import java.util.List;

public class CidadeController extends GenericController<Cidade, Long> {

    private CidadeDao cidadeDao;

    public CidadeController() {
        this.cidadeDao = new CidadeDao();
    }

    @Override
    protected GenericDao<Cidade, Long> getDao() {
        return this.cidadeDao;
    }

    public List<Cidade> findCidadesByEstado(Estado estado) {
        return this.cidadeDao.findCidadesByEstado(estado);
    }

    public List<Cidade> findCidadesByEstado(String estado) {
        return this.cidadeDao.findCidadesByEstado(estado);
    }

    public List<Cidade> findCidadesByNome(String nome) {
        return this.cidadeDao.findCidadesByNome(nome);
    }
}
