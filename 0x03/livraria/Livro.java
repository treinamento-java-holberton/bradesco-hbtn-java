import exceptions.AutorInvalidoException;
import exceptions.LivroInvalidoException;

import java.util.List;

public class Livro {

    protected String titulo;
    protected String autor;
    protected double preco;

    public Livro(String titulo, String autor, double preco) throws LivroInvalidoException, AutorInvalidoException{
        setTitulo(titulo);
        setAutor(autor);
        setPreco(preco);
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        List<String> nomes = List.of(autor.split(" "));

        if (nomes.size() < 2) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if (preco <=0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }
}