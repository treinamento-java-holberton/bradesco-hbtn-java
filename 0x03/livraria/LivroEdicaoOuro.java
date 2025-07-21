public class LivroEdicaoOuro extends Livro {

    public LivroEdicaoOuro(String titulo, String autor, double preco) {
        super(titulo, autor, preco);
    }

    @Override
    public double getPreco() {
        return preco * 1.3;
    }
}