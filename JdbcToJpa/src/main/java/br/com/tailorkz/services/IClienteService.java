package main.java.br.com.tailorkz.services;

import main.java.br.com.tailorkz.domain.Cliente;
import main.java.br.com.tailorkz.services.generic.IGenericService;
public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws br.com.tailorkz.exceptions.DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
