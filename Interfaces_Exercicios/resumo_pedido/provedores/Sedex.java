package provedores;

public class Sedex implements ProvedorFrete {

    private final TipoProvedorFrete PROVEDOR_FRETE = TipoProvedorFrete.SEDEX;

    @Override
    public Frete calcularFrete(double peso, double valor) {


        double valorFrete =  (peso > 1000.0) ? 0.1 * valor : 0.05 * valor;
        return new Frete(valorFrete, PROVEDOR_FRETE);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return PROVEDOR_FRETE;
    }
}