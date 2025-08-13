import Dao.CarroDao;
import Dao.ICarroDao;
import Domain.Carro;
import Domain.Marca;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarroTest {

    private ICarroDao carroDao;

    @Before
    public void setUp() {
        carroDao = new CarroDao();
    }

    @Test
    public void testCadastrar() {
        Marca marca = new Marca();
        marca.setNome("Mitsubishi");

        Carro carro = new Carro();
        carro.setCodigo("M01");
        carro.setNome("Lancer");
        carro.setModelo("Sedan");
        carro.setAno(2012L);
        carro.setMarca(marca);

        Carro carroSalvo = carroDao.cadastrar(carro);
        Assert.assertNotNull(carroSalvo.getId());
        Assert.assertNotNull(carroSalvo.getMarca().getId());
    }
}
