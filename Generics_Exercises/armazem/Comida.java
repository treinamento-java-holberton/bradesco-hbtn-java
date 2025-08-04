public class Comida {

    private String nome;
    private int calorias;
    private double preco;


    public Comida(String nome, int calorias, double preco) {
        this.calorias = calorias;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "[%s] %d R$ %f".formatted(nome, calorias, preco);
    }
}