package com.tailorkz.dao;

import com.tailorkz.domain.Cliente;

public interface IClienteDAO {
    void salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);
}
