package br.com.tailorkz.Projeto_SpringBoot_40;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private static final List<Cliente> clientes = new ArrayList<>();

    static {
        clientes.add(new Cliente(1, "Ana", "ana@email.com"));
        clientes.add(new Cliente(2, "Bruno Teste", "bruno@email.com"));
        clientes.add(new Cliente(3, "Tailor Kunz", "tailorkz@email.com"));
    }

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clientes;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable long id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return ResponseEntity.ok(cliente);
            }
        }
        return ResponseEntity.notFound().build();
    }
}