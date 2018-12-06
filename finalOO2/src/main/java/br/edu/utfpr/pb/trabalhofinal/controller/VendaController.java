package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.VendaDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.Venda;
import java.time.LocalDate;
import java.util.List;

public class VendaController extends GenericController<Venda, Long> {

    private VendaDao vendaDao;

    public VendaController() {
        this.vendaDao = new VendaDao();
    }

    @Override
    protected GenericDao<Venda, Long> getDao() {
        return this.vendaDao;
    }

    public List<Venda> findVendasByNumeroPedido(String numeroPedido) {
        return this.vendaDao.findVendasByNumeroPedido(numeroPedido);
    }

    public List<Venda> findVendasByData(LocalDate dataInicial, LocalDate dataFinal) {
        return this.vendaDao.findVendasByData(dataInicial, dataFinal);
    }

}
