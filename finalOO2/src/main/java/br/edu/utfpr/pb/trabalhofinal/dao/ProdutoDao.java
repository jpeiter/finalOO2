package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.Produto;
import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;

public class ProdutoDao extends GenericDao<Produto, Long> {

    public ProdutoDao() {
        super(Produto.class);
    }

    public List<Produto> findProdutosByNome(String nome) {
        Query query = em.createQuery("SELECT p "
                + "FROM Produto p "
                + "WHERE p.nome LIKE :nome ORDER BY p.nome");
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }

    public List<Produto> findProdutosByValor(Double valor) {
        Query query = em.createQuery("SELECT p "
                + "FROM Produto p "
                + "WHERE p.valor = :valor ORDER BY p.valor");
        query.setParameter("valor", valor);
        return query.getResultList();
    }

    public Produto findProdutoByNome(String nome) throws NoResultException {
        Query query = em.createQuery("SELECT p "
                + "FROM Produto p "
                + "WHERE p.nome LIKE :nome ORDER BY p.nome");
        query.setParameter("nome", "%" + nome + "%");
        query.setMaxResults(1);
        return (Produto) query.getSingleResult();
    }

    

}
