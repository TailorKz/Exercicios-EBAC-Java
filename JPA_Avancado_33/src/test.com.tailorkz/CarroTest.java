import Dao.AcessorioDao;
import Dao.IAcessorio;
import Domain.Acessorio;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarroTest {

    private IAcessorio acessorioDao;

    @Before
    public void setUp() {
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void testCadastrarAcessorio() {
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo("AC01");
        acessorio.setNome("Som Automotivo");

        acessorio = acessorioDao.cadastrar(acessorio);

        Assert.assertNotNull(acessorio);
        Assert.assertNotNull(acessorio.getId());
        System.out.println("ID gerado: " + acessorio.getId());
    }
}
