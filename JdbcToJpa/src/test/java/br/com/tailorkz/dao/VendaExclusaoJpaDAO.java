package java.br.com.tailorkz.dao;


import main.java.br.com.tailorkz.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.tailorkz.dao.jpa.IVendaJpaDAO;
import main.java.br.com.tailorkz.domain.jpa.VendaJpa;
import main.java.br.com.tailorkz.exceptions.DAOException;
import main.java.br.com.tailorkz.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoJpaDAO extends GenericJpaDB1DAO implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
