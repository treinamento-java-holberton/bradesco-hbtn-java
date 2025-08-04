import java.util.Map;
import java.util.HashMap;

public class ArmazemDeComida extends Armazem {

    public void adicionarAoInventario(String nome, Object item) {
        estoque.put(nome, item);
    } ;

    public Comida obterDoInventario(String nome) {
        return (Comida)estoque.get(nome);
    };
}