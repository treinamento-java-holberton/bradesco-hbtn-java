public class Post {
    String autor;
    String titulo;
    String corpo;
    String categoria;

    public Post(String autor, String titulo, String corpo, String categoria) {
        this.autor = autor;
        this.categoria = categoria;
        this.corpo = corpo;
        this.titulo = titulo;

    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getCorpo() {
        return corpo;
    }

    public String getTitulo() {
        return titulo;
    }
}