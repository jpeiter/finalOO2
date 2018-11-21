package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.Cliente;
import java.util.List;
import javax.persistence.Query;

public class ClienteDao extends GenericDao<Cliente, Long> {

    public ClienteDao() {
        super(Cliente.class);
    }

    public List<Cliente> findClienteByNome(String nome) {
        Query query = em.createQuery("SELECT c "
                + "FROM Cliente c "
                + "WHERE c.nome LIKE :nome "
                + "ORDER BY c.nome");
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

    public List<Cliente> findClienteByCPF(String cpf) {
        Query query = em.createQuery("SELECT c "
                + "FROM Cliente c "
                + "WHERE c.cpf = :cpf");
        query.setParameter("cpf", cpf);
        return query.getResultList();
    }

}
