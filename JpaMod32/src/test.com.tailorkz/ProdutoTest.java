import static org.junit.Assert.assertNotNull;

import com.tailorkz.main.Dao.IProdutoDao;
import com.tailorkz.main.Dao.ProdutoDao;
import com.tailorkz.main.Domain.Produto;
import org.junit.Before;
import org.junit.Test;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    @Before
    public void setup() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setValor(200d);
        produto.setNome("Notebook Nitro 5");
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}