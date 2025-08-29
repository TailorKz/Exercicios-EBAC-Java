package br.com.tailorkz.service;

import br.com.tailorkz.domain.Carro;

import java.util.Collection;


public interface ICarroService {
    public Carro cadastrar(Carro carro);
    public void excluir(Carro carro);
    public Carro alterar(Carro carro);
    public Carro consultar(Long id);
    public Collection<Carro> buscarTodos();
}
