import java.util.Map;
import java.util.HashMap;

public class ArmazemDeEletronico extends Armazem {

    public void adicionarAoInventario(String nome, Object item) {
        estoque.put(nome, item);
    };

    public Eletronico obterDoInventario(String nome) {
        return (Eletronico)estoque.get(nome);
    };
}