package com.tailorkz.dao;

import com.tailorkz.domain.Cliente;

import java.util.List;

public interface IClienteDAO {


    public Integer cadastrar(Cliente cliente) throws Exception;

    public Cliente consultar(String codigo) throws Exception;

    public Integer excluir(Cliente clienteBD) throws Exception;

    public List<Cliente> buscar(String nome) throws Exception;

    public List<Cliente> buscarTodos() throws Exception;
}
