import java.util.function.*;
public class Produto {
    private String nome;
    private double preco;
    private double percentualMarkup = 10;
    public Supplier<Double> precoComMarkup = () -> (100 + percentualMarkup)/100 * preco;
    public Consumer<Double> atualizarMarkup = x -> percentualMarkup = x;

    public Produto(double preco, String nome) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}