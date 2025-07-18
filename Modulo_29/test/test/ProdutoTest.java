package test;

import com.tailorkz.dao.IProdutoDAO;
import com.tailorkz.dao.Produto;
import com.tailorkz.dao.ProdutoDAO;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void cadastrarTest() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setNome("Notebook Gamer");
        produto.setCategoria("Eletrônicos");

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = dao.consultar(produto.getNome());
        assertNotNull(produtoBD);
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getCategoria(), produtoBD.getCategoria());

        Integer qtdDel = dao.excluir(produtoBD);
        assertNotNull(qtdDel);
    }
}
