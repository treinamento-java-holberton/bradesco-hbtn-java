import java.util.*;
import java.util.concurrent.TimeUnit;

public class SistemaFilas {

    public static void main(String[] args) {
        Fila fila = new Fila(new LinkedList<>());


        Produtor produtor1 = new Produtor(fila, "produtor 1");
        Consumidor consumidor1 = new Consumidor(fila, "consumidor 1");

        Produtor produtor2 = new Produtor(fila, "produtor 2");
        Consumidor consumidor2 = new Consumidor(fila, "consumidor 2");

        produtor1.start();
        consumidor1.start();

        produtor2.start();
        consumidor2.start();

        long start = System.nanoTime();

        while (System.nanoTime() < start + TimeUnit.SECONDS.toNanos(20)) {
            // busy wait;
        }
        System.exit(0);
    }
    
}
