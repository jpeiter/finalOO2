package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.UsuarioDao;
import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.model.Usuario;

public class UsuarioController extends GenericController<Usuario, Long> {

    private UsuarioDao usuarioDao;

    public UsuarioController() {
        this.usuarioDao = new UsuarioDao();
    }

    @Override
    protected GenericDao<Usuario, Long> getDao() {
        return this.usuarioDao;
    }

    public Usuario autenticarUsuario(String email, String senha) {
        return this.usuarioDao.findByEmailAndSenhaNamedQuery(email, senha);
    }
    
    

}
