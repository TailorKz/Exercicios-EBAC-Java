package main.java.br.com.tailorkz.services;

import main.java.br.com.tailorkz.dao.IProdutoDAO;
import main.java.br.com.tailorkz.domain.Produto;
import main.java.br.com.tailorkz.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
