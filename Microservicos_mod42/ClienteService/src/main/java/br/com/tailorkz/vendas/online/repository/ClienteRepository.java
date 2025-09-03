package br.com.tailorkz.vendas.online.repository;

import br.com.tailorkz.vendas.online.entity.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
