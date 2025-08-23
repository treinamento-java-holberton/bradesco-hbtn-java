import java.util.*;
import java.util.stream.*;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        //chave: TreeMap de TreeSet, sendo chave cargo e valores um treeset das pessoas.

        return pessoas.stream().collect(
                Collectors.groupingBy(
                        Pessoa::getCargo,
                        () -> new TreeMap<>(Comparator.reverseOrder()),
                        Collectors.toCollection(TreeSet::new)
                )
        );
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas) {
        //chave: nome do cargo, valor: quantidade de pessoas;

        return pessoas.stream().collect(Collectors.groupingBy(
                Pessoa::getCargo,
                Collectors.counting()));
    }
}