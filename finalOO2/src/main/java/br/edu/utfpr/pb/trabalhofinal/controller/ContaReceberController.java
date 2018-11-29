package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.ContaReceberDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.ContaReceber;
import java.util.List;

public class ContaReceberController extends GenericController<ContaReceber, Long> {

    private ContaReceberDao contaReceberDao;

    public ContaReceberController() {
        this.contaReceberDao = new ContaReceberDao();
    }

    @Override
    protected GenericDao<ContaReceber, Long> getDao() {
        return this.contaReceberDao;
    }

    public List<ContaReceber> findContasReceberByCliente(String nome) {
        return this.contaReceberDao.findContasReceberByCliente(nome);
    }

    public List<ContaReceber> findContasReceberHoje() {
        return this.contaReceberDao.findContasReceberHoje();
    }
}
