package com.tailorkz.service;

import com.tailorkz.dao.IContratoDao;

public class ContratoService implements IcontratoService.IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
}