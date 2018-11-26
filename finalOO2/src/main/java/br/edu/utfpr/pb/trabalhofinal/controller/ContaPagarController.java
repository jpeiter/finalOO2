package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.ContaPagarDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.ContaPagar;
import java.time.LocalDate;
import java.util.List;

public class ContaPagarController extends GenericController<ContaPagar, Long> {

    private ContaPagarDao contaPagarDao;

    public ContaPagarController() {
        this.contaPagarDao = new ContaPagarDao();
    }

    @Override
    protected GenericDao<ContaPagar, Long> getDao() {
        return this.contaPagarDao;
    }

    public List<ContaPagar> findContasPagarByVencimento(LocalDate dataInicial, LocalDate dataFinal, Boolean isPaga) {
        return this.contaPagarDao.findContasPagarByVencimento(dataInicial, dataFinal, isPaga);
    }

    public List<ContaPagar> findContasNaoPagasVencidasAteHoje() {
        return this.contaPagarDao.findContasNaoPagasVencidasAteHoje();
    }

}
