package br.edu.utfpr.pb.trabalhofinal.dao;

import br.edu.utfpr.pb.trabalhofinal.model.Usuario;
import java.util.List;
import javax.persistence.Query;

public class UsuarioDao extends GenericDao<Usuario, Long> {

    public UsuarioDao() {
        super(Usuario.class);
    }

    public Usuario findByEmailAndSenhaNamedQuery(String email, String senha) {
        Query query = em.createNamedQuery(Usuario.FIND_BY_EMAIL_AND_SENHA);
        query.setParameter("email", email);
        query.setParameter("senha", senha);

        return (Usuario) query.getSingleResult();
    }

    public List<Usuario> findAll() {
        Query query = em.createNamedQuery(Usuario.FIND_ALL);
        return query.getResultList();
    }

    public List<Usuario> findByNome(String nome) {
        Query query = em.createQuery("SELECT u "
                + "FROM Usuario u "
                + "WHERE UPPER(u.nome) "
                + "LIKE :nome "
                + "ORDER BY u.nome");
        query.setParameter("nome", "%" + nome.toUpperCase() + "%");

        return query.getResultList();
    }
}
