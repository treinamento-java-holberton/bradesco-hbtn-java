import java.util.Locale;

public class Produto {
    private String nome;
    private int codigo;
    private CategoriaProduto categoria;
    private double preco;

    public Produto(int codigo, String nome, CategoriaProduto categoria, double preco) {
        this.categoria = categoria;
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format(Locale.forLanguageTag("pt-BR"), "[%d] %s %s R$ %.2f", codigo, nome, categoria, preco);
    }

    public CategoriaProduto getCategoria() {
        return categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}