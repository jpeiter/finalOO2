package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.Categoria;
import java.util.List;
import javax.persistence.Query;

public class CategoriaDao extends GenericDao<Categoria, Long> {

    public CategoriaDao() {
        super(Categoria.class);
    }

    public List<Categoria> findCategoriasByDescricao(String descricao) {
        Query query = em.createQuery("SELECT c "
                + "FROM Categoria c "
                + "WHERE c.descricao LIKE :descricao ORDER BY c.descricao");
        query.setParameter("descricao", "%" + descricao + "%");
        return query.getResultList();
    }

}
