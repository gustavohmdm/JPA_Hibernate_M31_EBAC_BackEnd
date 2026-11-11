import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author gustavohmdm
 */

public class ProdutoTest {

    private IProdutoDAO produtoDAO;

    public ProdutoTest() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar() {
       Produto produto = new Produto();
        produto.setNome("PC Gamer");
        produto.setValor(10000d);
        produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
