package main.java.br.com.tailorkz.dao.jpa;

import main.java.br.com.tailorkz.dao.Persistente;
import main.java.br.com.tailorkz.dao.generic.jpa.IGenericJpaDAO;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long> {

}
