package com.tailorkz.services;

import com.tailorkz.dao.IProdutoDAO;
import com.tailorkz.domain.Produto;
import com.tailorkz.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}