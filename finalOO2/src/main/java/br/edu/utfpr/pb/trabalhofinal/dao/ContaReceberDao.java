package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.ContaReceber;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Query;

public class ContaReceberDao extends GenericDao<ContaReceber, Long> {

    public ContaReceberDao() {
        super(ContaReceber.class);
    }

    public List<ContaReceber> findContasReceberByCliente(String nome) {
        Query query = em.createQuery("SELECT cr "
                + "FROM ContaReceber cr "
                + "WHERE cr.venda.cliente.nome LIKE :nome "
                + "ORDER BY cr.venda.cliente.nome");
        query.setParameter("nome", "%" + nome + "%");

        return query.getResultList();
    }

    public List<ContaReceber> findContasReceberHoje() {
        Query query = em.createQuery("SELECT cr "
                + "FROM ContaReceber cr "
                + "WHERE cr.data = :hoje"
        );
        query.setParameter("hoje", LocalDate.now());

        return query.getResultList();
    }

    public List<Object[]> valoresRecebidosByTipoRecebimento(Date dataInicial, Date dataFinal) {
        Query q = em.createNativeQuery("SELECT cr.valor,  cr.tiporecebimento, "
                + "(DATE_PART('MONTH', cr.data)) as mes  "
                + "FROM contareceber cr "
                + "WHERE data IS NOT null "
                + "AND cr.valor > 0 "
                + "AND cr.data >= :dataInicial "
                + "AND cr.data <= :dataFinal "
                + "GROUP BY cr.valor,  cr.tiporecebimento, mes");
        q.setParameter("dataInicial", dataInicial);
        q.setParameter("dataFinal", dataFinal);

        return (List<Object[]>) q.getResultList();
    }

    public List<Object[]> entradaCaixa(Date dataInicial, Date dataFinal) {
        Query q = em.createNativeQuery("SELECT cr.valor, "
                + "CAST('ENTRADAS' as varchar) as tipo, "
                + "(DATE_PART('MONTH', cr.data)) as mes "
                + "FROM contareceber cr "
                + "WHERE cr.data >= :dataInicial "
                + "AND cr.data <= :dataFinal "
                + "GROUP BY cr.valor, mes");
        q.setParameter("dataInicial", dataInicial);
        q.setParameter("dataFinal", dataFinal);

        return (List<Object[]>) q.getResultList();
    }

}
