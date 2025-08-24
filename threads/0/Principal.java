public class Principal {

    public static void main(String[] args) {
        Contador contador = new Contador();

        ThreadContador t1 = new ThreadContador(contador);
        ThreadContador t2 = new ThreadContador(contador);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception ex) {
            System.out.println("Erro");
        }

        System.out.printf("Valor final do contador: %s%n", contador.getContagem());
    }
}