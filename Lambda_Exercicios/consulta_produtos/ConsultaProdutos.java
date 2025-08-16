import java.util.*;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> proutosList, CriterioFiltro criterio) {
        return proutosList.stream().filter((x)->criterio.testar(x)).toList();
    }
}