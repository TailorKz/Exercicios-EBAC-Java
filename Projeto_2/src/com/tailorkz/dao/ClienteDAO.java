package com.tailorkz.dao;
import com.tailorkz.dao.generic.GenericDAO;
import com.tailorkz.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {
    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }
    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
        entityCadastrado.setCidade(entity.getCidade());
        entityCadastrado.setCpf(entity.getCpf());
        entityCadastrado.setEnd(entity.getEnd());
        entityCadastrado.setEstado(entity.getEstado());
        entityCadastrado.setNome(entity.getNome());
        entityCadastrado.setNumero(entity.getNumero());
        entityCadastrado.setTel(entity.getTel());

    }
}
