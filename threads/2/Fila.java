import java.util.*;

public class Fila {
    private List<Integer> fila;

    public Fila(List<Integer> fila) {
        this.fila = fila;
    }


    public synchronized void adicionar(int item) throws InterruptedException {
        while (fila.size() >= 10) {
            wait();
        }
        fila.add(item);
        System.out.println("Fila: %s".formatted(fila));
        notifyAll();
    }

    public synchronized void retirar() throws InterruptedException {
        while (fila.isEmpty()) {
            wait();
        }
    
        fila.remove(0);
        System.out.println("Fila: %s".formatted(fila));
        notifyAll();
    };
}
