package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.ContaReceber;
import java.util.List;
import javax.persistence.Query;

public class ContaReceberDao extends GenericDao<ContaReceber, Long> {

    public ContaReceberDao() {
        super(ContaReceber.class);
    }

    public List<ContaReceber> findContasReceberByCliente(Long id) {
        Query query = em.createQuery("SELECT cr "
                + "FROM contaReceber cr "
                + "WHERE cr.venda.cliente.id = :id "
                + "ORDER BY cr.valor");
        query.setParameter("id", id);

        return query.getResultList();
    }

}
