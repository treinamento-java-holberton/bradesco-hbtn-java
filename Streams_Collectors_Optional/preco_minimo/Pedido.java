import java.util.*;

public class Pedido {

    private int codigo;
    private List<Produto> produtos;
    private Cliente cliente;

    public Pedido(int codigo, List<Produto> produtos, Cliente cliente) {
        this.cliente = cliente;
        this.codigo = codigo;
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}