package com.tailorkz.services;

import com.tailorkz.domain.Cliente;

public interface IClienteService {
    void salvar(Cliente cliente);

    Cliente buscarPorCpf(Long cpf);
}
