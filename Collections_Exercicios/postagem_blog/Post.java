import java.util.Objects;

public class Post implements Comparable<Post> {
    Autor autor;
    String titulo;
    String corpo;
    Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.categoria = categoria;
        this.corpo = corpo;
        this.titulo = titulo;

    }

    public Autor getAutor() {
        return autor;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    public String getCorpo() {
        return corpo;
    }

    public String getTitulo() {
        return titulo;
    }



    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public int compareTo(Post outroObjeto) {
        if (autor.compareTo(outroObjeto.getAutor()) == 0 &&  titulo.compareTo(outroObjeto.getTitulo()) == 0) {
            return 0;
        } else if (autor.compareTo(outroObjeto.getAutor()) > 0 ||  titulo.compareTo(outroObjeto.getTitulo()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }

}