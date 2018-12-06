/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.pb.trabalhofinal.util;

import br.edu.utfpr.pb.trabalhofinal.enums.EPermissao;
import br.edu.utfpr.pb.trabalhofinal.model.Usuario;

/**
 *
 * @author joao_
 */
public class UserSession {

    private static final UserSession instance = new UserSession();
    private Usuario usuarioLogado;

    private UserSession() {
    }

    public static UserSession getInstance() {
        return instance;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public boolean isUsuarioLogado() {
        return usuarioLogado != null;
    }

    public boolean temPermissao(EPermissao... permissoes) {
        if (permissoes.length <= 0) {
            return false;
        }

        for (EPermissao permissao : permissoes) {
            if (permissao == usuarioLogado.getPermissao()) {
                return true;
            }
        }
        return false;
    }

}
