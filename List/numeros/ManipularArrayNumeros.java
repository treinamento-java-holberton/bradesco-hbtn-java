import java.util.List;
import java.util.Optional;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int numero) {
        int output = 0;
        Optional<Integer> numeroOpc = lista.stream().filter(i -> i.equals(numero)).findFirst();
        if (!numeroOpc.isPresent()) {
            output = -1;
        } else {
            output = lista.indexOf(numeroOpc.get());
        }
        return output;
    }

    public static void adicionarNumero(List<Integer> lista, int numero) {
        if (buscarPosicaoNumero(lista, numero) != -1) {
            throw new RuntimeException("Numero jah contido na lista");
        }
        lista.add(Integer.valueOf(numero));
    }

    public static void removerNumero(List<Integer> lista, int numero) {
        if (buscarPosicaoNumero(lista, numero) == -1) {
            throw new RuntimeException("Numero nao encontrado na lista");
        }
        lista.remove(lista.indexOf(Integer.valueOf(numero)));
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
        Integer substituto = Integer.valueOf(numeroSubstituto);
        Integer substituir = Integer.valueOf(numeroSubstituir);
        if (buscarPosicaoNumero(lista,numeroSubstituir) == -1) {
            lista.add(substituto);
        } else {
            lista.set(lista.indexOf(substituir), substituto);
        }
    }
}