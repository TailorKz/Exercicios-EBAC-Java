package main.java.br.com.tailorkz.dao.jpa;


import main.java.br.com.tailorkz.dao.generic.jpa.IGenericJapDAO;
import main.java.br.com.tailorkz.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long> {

}
