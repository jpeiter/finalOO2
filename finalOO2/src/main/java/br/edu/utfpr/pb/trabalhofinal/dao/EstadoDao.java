package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.Estado;
import java.util.List;
import javax.persistence.Query;

public class EstadoDao extends GenericDao<Estado, Long> {

    public EstadoDao() {
        super(Estado.class);
    }
    
    public List<Estado> findEstadosByNomeOrSigla(String nomeSigla) {
        Query query = em.createQuery("SELECT e "
                + "FROM Estado e "
                + "WHERE e.nome LIKE :nomeSigla "
                + "OR e.sigla LIKE :nomeSigla"
                + "ORDER BY e.nome");
        query.setParameter("nome", "%" + nomeSigla + "%");

        return query.getResultList();
    }
}
