import java.util.Random;

public class Produtor extends Thread {
    private Fila fila;
    private String nome;
    private Random random;

    public Produtor(Fila fila, String nome) {
        this.fila = fila;
        this.nome = nome;
        random = new Random(System.nanoTime());
    }

    @Override
    public void run() {
        try {
            while (true) {
                int novoValor = random.nextInt(1,100);
                System.out.println("%s: adicionando o elemento %d lista".formatted(nome, novoValor));
                fila.adicionar(novoValor);  // O produtor coloca os itens na fila
                Thread.sleep(400);   // Simula o tempo para produzir um item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}