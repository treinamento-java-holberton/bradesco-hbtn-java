import java.util.*;

public class Consulta {

    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream().filter(i -> i.getCategoria().equals(CategoriaProduto.LIVRO)).toList();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> produtos, int precoMinimo) {
        return produtos.stream().filter(i -> i.getPreco() >= precoMinimo).toList();
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(i -> i.getProdutos().stream().anyMatch(j -> j.getCategoria().equals(CategoriaProduto.ELETRONICO))).toList();
    }
}