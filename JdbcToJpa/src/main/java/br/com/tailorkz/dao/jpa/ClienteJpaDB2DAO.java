package main.java.br.com.tailorkz.dao.jpa;

import main.java.br.com.tailorkz.dao.generic.jpa.GenericJpaDB2DAO;
import main.java.br.com.tailorkz.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
