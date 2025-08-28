public class Consumidor extends Thread {
    private Fila fila;
    private String nome;


    public Consumidor(Fila fila, String nome) {
        this.nome = nome;
        this.fila = fila;
    }


    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("%s: retirando um elemento da lista".formatted(nome));
                fila.retirar();  // O consumidor retira os itens da fila
                Thread.sleep(500);  // Simula o tempo para consumir um item
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}