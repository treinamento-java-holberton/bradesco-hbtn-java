package provedores;

public class Loggi implements ProvedorFrete {

    private final TipoProvedorFrete PROVEDOR_FRETE = TipoProvedorFrete.LOGGI;

    @Override
    public Frete calcularFrete(double peso, double valor) {

        double valorFrete = (peso > 5000.0) ? 0.12 * valor : 0.04 * valor;
        return new Frete(valorFrete, PROVEDOR_FRETE);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return PROVEDOR_FRETE;
    }
}