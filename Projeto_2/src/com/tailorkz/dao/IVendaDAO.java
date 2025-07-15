package com.tailorkz.dao;

import com.tailorkz.dao.generic.IGenericDAO;
import com.tailorkz.domain.Venda;
import com.tailorkz.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
