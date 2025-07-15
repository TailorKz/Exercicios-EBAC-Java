package test;

import com.tailorkz.dao.IClienteDAO;
import com.tailorkz.domain.Cliente;
import com.tailorkz.exceptions.TipoChaveNaoEncontradaException;
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
        cliente.setCpf(000111222333L);
        cliente.setNome("Tailor");
        cliente.setCidade("Iporã");
        cliente.setEnd("Rua teste");
        cliente.setEstado("SC");
        cliente.setNumero(90);
        cliente.setTel(119652462L);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Tailor Kunz");
        clienteService.alterar(cliente);

        Assert.assertEquals("Tailor Kunz", cliente.getNome());
    }
}
