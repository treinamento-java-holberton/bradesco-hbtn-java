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

    public String toString() {
        return "[%s] %s %s R$ %.2f".formatted(codigo, nome, categoria, preco);
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