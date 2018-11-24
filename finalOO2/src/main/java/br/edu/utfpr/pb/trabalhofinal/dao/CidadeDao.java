package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.Cidade;
import br.edu.utfpr.pb.trabalhofinal.model.Estado;
import java.util.List;
import javax.persistence.Query;

public class CidadeDao extends GenericDao<Cidade, Long> {

    public CidadeDao() {
        super(Cidade.class);
    }

    public List<Cidade> findCidadesByEstado(Estado estado) {
        Query query = em.createQuery("SELECT c "
                + "FROM Cidade c "
                + "WHERE c.estado.id = :estado "
                + "ORDER BY c.nome");
        query.setParameter("estado", estado.getId());

        return query.getResultList();
    }

    public List<Cidade> findCidadesByEstado(String estado) {
        Query query = em.createQuery("SELECT c "
                + "FROM Cidade c "
                + "WHERE c.estado.nome "
                + "LIKE :estado "
                + "ORDER BY c.nome");
        query.setParameter("estado", "%" + estado + "%");

        return query.getResultList();
    }

    public List<Cidade> findCidadesByNome(String nome) {
        Query query = em.createQuery("SELECT c "
                + "FROM Cidade c "
                + "WHERE c.nome LIKE :nome "
                + "ORDER BY c.nome");
        query.setParameter("nome", "%" + nome + "%");

        return query.getResultList();
    }

}
