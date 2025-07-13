package produtos;

public abstract class Produto {

    protected String titulo;
    protected int ano;
    protected String pais;
    protected double preco;

    public Produto(String titulo, int ano, String pais, double precoBruto) {
        this.ano = ano;
        this.pais = pais;
        this.preco = precoBruto;
        this.titulo = titulo;
    }

    public abstract double obterPrecoLiquido();

    public abstract String getTipo();

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }
}