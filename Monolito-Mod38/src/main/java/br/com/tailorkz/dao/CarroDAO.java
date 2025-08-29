package br.com.tailorkz.dao;

import br.com.tailorkz.domain.Carro;
import jakarta.ejb.Stateless;


@Stateless
public class CarroDAO extends GenericDAO<Carro, Long> implements ICarroDAO {
    public CarroDAO() {
        super(Carro.class);
    }
}