package br.com.tailorkz.dao;

import br.com.tailorkz.domain.Persistente;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity);
    public void excluir(T entity);
    public T alterar(T entity);
    public T consultar(E id);
    public Collection<T> buscarTodos();
}
