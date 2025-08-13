import java.util.*;

public class Blog {
    private List<Post> postList = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        postList.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> set = new TreeSet<>();
        for (Post post:postList) {
            set.add(post.getAutor());
        }
        return set;
    }

    public Map<String,Integer> obterContagemPorCategoria() {
        Map<String,Integer> output = new TreeMap<>();
        for (Post post:postList) {
            String categoria = post.getCategoria();
            output.put(categoria, output.getOrDefault(categoria, 0) + 1);
        }
        return output;
    }
}
