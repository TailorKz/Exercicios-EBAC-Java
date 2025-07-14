import com.tailorkz.dao.ClienteDAO;
import com.tailorkz.dao.IClienteDAO;
import com.tailorkz.domain.Cliente;
import com.tailorkz.services.ClienteService;
import mock.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest(){
        clienteDao = new ClienteDaoMock();
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
        clienteDao.salvar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.buscarPorCpf(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }
}
