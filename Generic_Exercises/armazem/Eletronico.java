public class Eletronico {

    private String descricao;
    private double valor;

    public Eletronico(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    @Override
    public java.lang.String toString() {
        return "[%s] R$ %.2f".formatted(descricao, valor);
    }
}