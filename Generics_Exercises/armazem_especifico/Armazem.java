import java.util.Map;
import java.util.HashMap;

public abstract class Armazem<T> implements Armazenavel<T> {

    protected Map<String, T> estoque = new HashMap<>();

    public abstract void adicionarAoInventario(String nome, T item);

    public abstract T obterDoInventario(String nome);

}