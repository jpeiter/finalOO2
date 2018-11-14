package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.ClienteDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.Cliente;
import java.util.List;

public class ClienteController extends GenericController<Cliente, Long> {

    private ClienteDao clienteDao;

    public ClienteController() {
        this.clienteDao = new ClienteDao();
    }

    @Override
    protected GenericDao<Cliente, Long> getDao() {
        return this.clienteDao;
    }

    public List<Cliente> findClienteByNome(String nome) {
        return this.clienteDao.findClienteByNome(nome);
    }

    public Cliente findClienteByCPF(String cpf) {
        return this.clienteDao.findClienteByCPF(cpf);
    }

}
