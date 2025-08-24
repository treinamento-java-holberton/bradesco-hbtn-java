public class ProdutorConsumidor {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Consumidor consumidor = new Consumidor(buffer);
        Produtor produtor = new Produtor(buffer);

        consumidor.start();
        produtor.start();
    }
}