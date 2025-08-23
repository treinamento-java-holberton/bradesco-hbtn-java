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

    public static Map<String,Map<Integer,Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> pessoas) {
        //chave: cargo, valor: Map de: idade, quantidade;
        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.groupingBy(Pessoa::getIdade,Collectors.counting())));
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> pessoas) {
        //chave: cargo, valor: media salarial;

        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo,Collectors.averagingDouble(Pessoa::getSalario)));
    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> pessoas) {
        //chave: cargo, valor: flatmap de: hobby;
        return pessoas.stream()
                .collect(Collectors.groupingBy(
                        Pessoa::getCargo,
                        Collectors.flatMapping(p -> p.getHobbies().stream(), Collectors.toCollection(TreeSet::new))));
    }
}