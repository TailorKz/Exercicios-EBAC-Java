package main.br.com.tailorkz.dao;


import main.br.com.tailorkz.dao.generic.IGenericDAO;
import main.br.com.tailorkz.domain.Venda;
import main.br.com.tailorkz.exceptions.DAOException;
import main.br.com.tailorkz.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
