package main.br.com.tailorkz.services;

import main.br.com.tailorkz.domain.Cliente;
import main.br.com.tailorkz.exceptions.DAOException;
import main.br.com.tailorkz.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

    //	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
    Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
