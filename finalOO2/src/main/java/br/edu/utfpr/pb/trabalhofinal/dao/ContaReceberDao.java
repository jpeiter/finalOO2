package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.ContaReceber;
import java.time.LocalDate;
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

}
