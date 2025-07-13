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

    public void apresentarResumoPedido() {
        double totalBruto = Arrays.stream(itens)
                .mapToDouble(i -> i.getProduto().obterPrecoLiquido() * i.getQuantidade()).sum();
        double desconto = totalBruto * (percentualDesconto /100);
        double resultado = totalBruto - desconto;
        System.out.println("------- RESUMO PEDIDO -------");
        Arrays.stream(itens).forEach(i -> System.out.println(i.toString()));
        System.out.println("----------------------------");
        System.out.println(String.format("DESCONTO: %.2f", desconto));
        System.out.println(String.format("TOTAL PRODUTOS: %.2f", totalBruto));
        System.out.println(String.format("TOTAL PRODUTOS: %.2f", totalBruto));
        System.out.println("----------------------------");
        System.out.println(String.format("TOTAL PEDIDO: %.2f", resultado));
    }
}