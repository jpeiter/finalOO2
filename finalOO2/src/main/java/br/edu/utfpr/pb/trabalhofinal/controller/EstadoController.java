package br.edu.utfpr.pb.trabalhofinal.controller;

import br.edu.utfpr.pb.trabalhofinal.dao.GenericDao;
import br.edu.utfpr.pb.trabalhofinal.dao.EstadoDao;
import br.edu.utfpr.pb.trabalhofinal.model.Estado;
import java.util.List;

public class EstadoController extends
        GenericController<Estado, Long> {

    private EstadoDao estadoDao;

    public EstadoController() {
        this.estadoDao = new EstadoDao();
    }

    @Override
    protected GenericDao<Estado, Long> getDao() {
        return this.estadoDao;
    }
    
    public List<Estado> findEstadosByNomeOrSigla(String nomeSigla) {
        return this.estadoDao.findEstadosByNomeOrSigla(nomeSigla);
    }
}
