package main.br.com.tailorkz.services;

import main.br.com.tailorkz.dao.IProdutoDAO;
import main.br.com.tailorkz.domain.Produto;
import main.br.com.tailorkz.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}