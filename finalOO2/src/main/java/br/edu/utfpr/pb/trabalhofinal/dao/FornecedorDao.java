package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.Fornecedor;
import java.util.List;
import javax.persistence.Query;

public class FornecedorDao extends GenericDao<Fornecedor, Long> {

    public FornecedorDao() {
        super(Fornecedor.class);
    }

    public List<Fornecedor> findFornecedorByNome(String nome) {
        Query query = em.createQuery("SELECT f "
                + "FROM Fornecedor f "
                + "WHERE f.nome LIKE :nome "
                + "ORDER BY f.nome");
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

    public List<Fornecedor> findFornecedorByCNPJ(String cnpj) {
        Query query = em.createQuery("SELECT f "
                + "FROM Fornecedor f "
                + "WHERE f.cnpj = :cnpj");
        query.setParameter("cnpj", cnpj);
        return query.getResultList();
    }
}
