
import java.util.ArrayList;
import java.util.List;
public class Pedido {

    List<PedidoCookie> cookies;
    int totalCaixas = 0;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie pedido) {
        cookies.add(pedido);
        totalCaixas += pedido.getQuantidadeCaixas();
    }

    public int obterTotalCaixas() {
        return totalCaixas;
    }
    public int removerSabor(String sabor){
        List<PedidoCookie> aRemover = new ArrayList<>();
        int caixasARemover = 0;

        for(PedidoCookie pedido:cookies) {
            if (sabor == pedido.getSabor()){
                caixasARemover += pedido.getQuantidadeCaixas();
                aRemover.add(pedido);
            }
        }

        for(PedidoCookie item:aRemover) {
            cookies.remove(item);
        }
        totalCaixas -= caixasARemover;
        return caixasARemover;
    }
}
