package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.Venda;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Query;

public class VendaDao extends GenericDao<Venda, Long> {

    public VendaDao() {
        super(Venda.class);
    }

    public List<Venda> findVendasByNumeroPedido(String numeroPedido) {
        Query query = em.createQuery("SELECT v "
                + "FROM Venda v "
                + "WHERE v.numeroPedido "
                + "LIKE :numeroPedido "
                + "ORDER BY v.numeroPedido");
        query.setParameter("numeroPedido", "%" + numeroPedido + "%");
        return query.getResultList();
    }

    public List<Venda> findVendasByData(LocalDate dataInicial, LocalDate dataFinal) {
        Query query = em.createQuery("SELECT v "
                + "FROM Venda v "
                + "WHERE v.data >= :dataInicial "
                + "AND v.data <= :dataFinal "
                + "ORDER BY v.data");
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);
        return query.getResultList();
    }
}
