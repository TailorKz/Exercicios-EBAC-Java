package main.java.br.com.tailorkz.dao.jpa;


import main.java.br.com.tailorkz.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.tailorkz.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
