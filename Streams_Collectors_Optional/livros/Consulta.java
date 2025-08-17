import java.util.*;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream().filter(i -> i.getCategoria().equals(CategoriaProduto.LIVRO)).toList();
    }
}