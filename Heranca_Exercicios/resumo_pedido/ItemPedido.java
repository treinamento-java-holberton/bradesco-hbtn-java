import produtos.Produto;

public class ItemPedido {

    private int quantidade;
    private Produto produto;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        double total = produto.obterPrecoLiquido() * quantidade;
        return String.format("Tipo: %s  Titulo: %s  Preco: %.2f  Quant: %d  Total: %.2f",
                produto.getTipo(), produto.getTitulo(), produto.obterPrecoLiquido(), quantidade, total);
    }
}