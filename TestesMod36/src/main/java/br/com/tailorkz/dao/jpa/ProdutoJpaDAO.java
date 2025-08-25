package main.java.br.com.tailorkz.dao.jpa;


import main.java.br.com.tailorkz.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.tailorkz.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
