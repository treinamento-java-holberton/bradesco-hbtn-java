import java.util.Map;
import java.util.HashMap;

public class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> estoque = new HashMap<>();

    public void adicionarAoInventario(String nome, T item) {
        estoque.put(nome, item);
    };

    public T obterDoInventario(String nome) {
        return estoque.get(nome);
    };

}