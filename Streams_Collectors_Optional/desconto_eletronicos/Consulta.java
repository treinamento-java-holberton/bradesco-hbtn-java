import java.util.*;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream().filter(i -> i.getCategoria().equals(CategoriaProduto.LIVRO)).toList();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {
        return produtos.stream().filter(i -> i.getPreco() >= precoMinimo).toList();
    }

    public static List<Produto> aplicar15PorcentoDescontoEletronicos(List<Produto> produtos) {
        return produtos.stream().map(i -> {
            i.setPreco(i.getPreco() * 0.85);
            return i;
        }).toList();
    }
}