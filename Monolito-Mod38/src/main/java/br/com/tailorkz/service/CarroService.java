package br.com.tailorkz.service;

import br.com.tailorkz.dao.ICarroDAO;
import br.com.tailorkz.domain.Carro;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;


import java.util.Collection;

@Stateless
public class CarroService implements ICarroService {

    private ICarroDAO dao;

    @Inject
    public CarroService(ICarroDAO dao) {
        this.dao = dao;
    }

    @Override
    public Carro cadastrar(Carro carro) {
        return dao.cadastrar(carro);
    }

    @Override
    public void excluir(Carro carro) {
        dao.excluir(carro);
    }

    @Override
    public Carro alterar(Carro carro) {
        return dao.alterar(carro);
    }

    @Override
    public Carro consultar(Long id) {
        return dao.consultar(id);
    }

    @Override
    public Collection<Carro> buscarTodos() {
        return dao.buscarTodos();
    }
}
