import java.util.*;
import java.util.function.*;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> proutosList, Predicate<Produto> criterio) {
        return proutosList.stream().filter((x)->criterio.test(x)).toList();
    }
}