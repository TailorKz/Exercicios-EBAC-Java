import com.tailorkz.dao.ClienteDAO;
import com.tailorkz.dao.IClienteDAO;
import com.tailorkz.domain.Cliente;
import com.tailorkz.exceptions.TipoChaveNaoEncontradaException;
import com.tailorkz.services.ClienteService;
import mock.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDAO();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(000111222333L);
        cliente.setNome("Tailor");
        cliente.setCidade("Iporã");
        cliente.setEnd("Rua teste");
        cliente.setEstado("SC");
        cliente.setNumero(90);
        cliente.setTel(119652462L);
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setCpf(64461231264L);
        Boolean retorno = clienteDao.cadastrar(cliente);
        assertTrue(retorno);
    }


    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Tailor Kunz");
        clienteDao.alterar(cliente);
        Assert.assertEquals("Tailor Kunz", cliente.getNome());
    }

    @Test
    public void buscarTodos() {
        Collection<Cliente> list = clienteDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);
    }
}
