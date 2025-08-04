public class Comida {

    private String nome;
    private double calorias;
    private double preco;


    public Comida(String nome, double calorias, double preco) {
        this.calorias = calorias;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "[%s] %f R$ %f".formatted(nome, calorias, preco);
    }
}