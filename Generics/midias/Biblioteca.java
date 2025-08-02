import java.util.List;
import java.util.ArrayList;

public class Biblioteca<E extends Midia> {

    List<E> elementos;

    public Biblioteca() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarMidia(E midia) {
        elementos.add(midia);
    }

    public List<E> obterListaMidias() {
        return elementos;
    }
}