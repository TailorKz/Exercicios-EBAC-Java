package test;

import com.tailorkz.dao.IClienteDAO;
import com.tailorkz.domain.Cliente;
import com.tailorkz.services.ClienteService;
import com.tailorkz.services.IClienteService;
import mock.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(97429749L);
        cliente.setNome("Tailor");
        cliente.setCidade("Iporã");
        cliente.setEnd("Rua endereço teste");
        cliente.setEstado("SC");
        cliente.setNumero(90);
        cliente.setTel(1148828394L);
        clienteService.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {

        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
}
