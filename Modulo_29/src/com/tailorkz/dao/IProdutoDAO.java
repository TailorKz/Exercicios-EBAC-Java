package com.tailorkz.dao;

import com.tailorkz.dao.Produto;
import java.util.List;

public interface IProdutoDAO {
    Integer cadastrar(Produto produto) throws Exception;
    Produto consultar(String nome) throws Exception;
    Integer excluir(Produto produto) throws Exception;
    List<Produto> buscar(String nome) throws Exception;
    List<Produto> buscarTodos() throws Exception;
}
