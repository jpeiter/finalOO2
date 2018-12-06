package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.ContaPagar;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

public class ContaPagarDao extends GenericDao<ContaPagar, Long> {

    public ContaPagarDao() {
        super(ContaPagar.class);
    }

    public List<ContaPagar> findContasPagarByVencimento(LocalDate dataInicial, LocalDate dataFinal, Boolean isPaga) {
        String operator;
        String st = "";

        if (isPaga) {
            operator = "=";
        } else {
            operator = "!=";
            st = " OR cp.valorPago = null ";
        }
        String select = "SELECT cp "
                + "FROM ContaPagar cp "
                + "WHERE cp.dataVencimento >= :dataInicial "
                + "AND cp.dataVencimento <= :dataFinal "
                + "AND cp.valor " + operator + " cp.valorPago "
                + st
                + "ORDER BY cp.dataVencimento";
        Query query = em.createQuery(select);
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);
        return query.getResultList();
    }

    public List<ContaPagar> findContasNaoPagasVencidasAteHoje() {
        Query query = em.createQuery("SELECT cp "
                + "FROM ContaPagar cp "
                + "WHERE cp.dataVencimento <= :hoje "
                + "AND cp.valorPago < cp.valor "
                + "ORDER BY cp.dataVencimento");
        query.setParameter("hoje", LocalDate.now());
        return query.getResultList();
    }

    public List<Object[]> valoresPagosByTipoRecebimento() {
        Query q = em.createNativeQuery("SELECT cp.valorpago,  cp.tipopagamento, "
                + "(DATE_PART('MONTH', cp.datapagamento)) as mes "
                + "FROM contapagar cp "
                + "WHERE cp.datapagamento IS NOT null "
                + "AND cp.valorpago > 0 "
                + "GROUP BY cp.valorpago,  cp.tipopagamento, mes");

        return (List<Object[]>) q.getResultList();

    }

    public List<Object[]> saidaCaixa(Date dataInicial, Date dataFinal) {
        Query q = em.createNativeQuery("SELECT cp.valor,  "
                + "CAST('SAIDAS' as varchar) as tipo, "
                + "(DATE_PART('MONTH', cp.datapagamento)) as mes "
                + "FROM contapagar cp "
                + "WHERE cp.datapagamento IS NOT NULL "
                + "AND cp.datapagamento <= :dataFinal  "
                + "AND cp.datapagamento >= :dataInicial "
                + "AND cp.valorpago = cp.valor "
                + "GROUP BY cp.valor, mes");
        q.setParameter("dataInicial", dataInicial);
        q.setParameter("dataFinal", dataFinal);

        return (List<Object[]>) q.getResultList();
    }

}
