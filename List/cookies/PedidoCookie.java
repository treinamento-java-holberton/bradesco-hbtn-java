public  class PedidoCookie {
    String sabor;
    int quantidadeCaixas;

    public PedidoCookie(String sabor, int quantidadeCaixas) {
        this.quantidadeCaixas = quantidadeCaixas;
        this.sabor = sabor;
    }

    public int getQuantidadeCaixas() {
        return quantidadeCaixas;
    }

    public String getSabor() {
        return sabor;
    }
}
