package br.com.tailorkz.dao;

import br.com.tailorkz.domain.Carro;
import java.io.Serializable;

public class CarroDAO extends GenericDAO<Carro, Long> implements ICarroDAO, Serializable {
    public CarroDAO() {
        super(Carro.class);
    }
}