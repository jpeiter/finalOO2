package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.ContaPagar;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Query;

public class ContaPagarDao extends GenericDao<ContaPagar, Long> {

    public ContaPagarDao() {
        super(ContaPagar.class);
    }

    public List<ContaPagar> findContasPagarByVencimento(LocalDate dataInicial, LocalDate dataFinal) {
        Query query = em.createQuery("SELECT cp "
                + "FROM contaPagar cp "
                + "WHERE cp.dataVencimento >= :dataInicial "
                + "AND cp.dataVencimento <= :dataFinal "
                + "ORDER BY cp.dataVencimento");
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);
        return query.getResultList();
    }

    public List<ContaPagar> findContasPagarByVencimento(LocalDate dataInicial, LocalDate dataFinal, Boolean isPaga) {
        Query query = em.createQuery("SELECT cp "
                + "FROM contaPagar cp "
                + "WHERE cp.dataVencimento >= :dataInicial "
                + "AND cp.dataVencimento <= :dataFinal "
                + "AND cp.valor = cp.valorPago "
                + "ORDER BY cp.dataVencimento");
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);
        return query.getResultList();
    }

    public List<ContaPagar> findContasNaoPagasVencidasAteHoje() {
        Query query = em.createQuery("SELECT cp "
                + "FROM contaPagar cp "
                + "WHERE cp.dataVencimento <= :hoje "
                + "AND cp.valorPago < cp.valor "
                + "ORDER BY cp.dataVencimento");
        query.setParameter("hoje", LocalDate.now());
        return query.getResultList();
    }

}