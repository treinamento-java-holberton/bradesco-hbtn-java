import java.util.*;

public class Blog {
    private List<Post> postList = new ArrayList<>();

    public void adicionarPostagem(Post novoPost) {
        for (Post post:postList) {
            if (post.compareTo(novoPost) == 0) {
                throw new RuntimeException("Postagem jah existente");
            }
        }
        postList.add(novoPost);
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> output = new TreeSet<>(Comparator.comparing(Post::getTitulo));
        for (Post post:postList) {
            if (post.getAutor().getNome().equals(autor.getNome())) {
                output.add(post);
            }
        }
        return output;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> output = new TreeSet<>(Comparator.comparing(Post::getTitulo));
        for (Post post:postList) {
            if (post.getCategoria().equals(categoria)) {
                output.add(post);
            }
        }
        return output;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> output = new TreeMap<>();
        for (Post post:postList) {
            Categorias categoria = post.getCategoria();
            Set<Post> postsDaCategoria = output.getOrDefault(post.getCategoria(), new TreeSet<>(Comparator.comparing(Post::getTitulo)));
            postsDaCategoria.add(post);
            output.put(categoria, postsDaCategoria);
        }
        return output;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> output = new TreeMap<>(Comparator.comparing(Autor::getNome));
        for (Post post:postList) {
            Autor autor = post.getAutor();
            Set<Post> postsDoAutor = output.getOrDefault(post.getAutor(), new TreeSet<>(Comparator.comparing(Post::getTitulo)));
            postsDoAutor.add(post);
            output.put(autor, postsDoAutor);
        }
        return output;
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> output = new TreeSet<>(Comparator.comparing(Autor::getNome));
        for (Post post:postList) {
            output.add(post.getAutor());
        }
        return output;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias,Integer> output = new TreeMap<>();
        for (Post post:postList) {
            Categorias categoria = post.getCategoria();
            output.put(categoria, output.getOrDefault(categoria, 0) + 1);
        }
        return output;
    }
}
