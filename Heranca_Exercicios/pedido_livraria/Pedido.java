import java.util.Arrays;

public class Pedido {

    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.itens = itens;
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularTotal() {
        double totalBruto = Arrays.stream(itens)
                .mapToDouble(i -> i.getProduto().obterPrecoLiquido() * i.getQuantidade()).sum();

        double desconto = totalBruto * (percentualDesconto /100);
        double resultado = totalBruto - desconto;
        return (resultado > 0) ? resultado:0;
    }
}