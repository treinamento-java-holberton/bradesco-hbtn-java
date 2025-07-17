package provedores;

public class JadLog implements ProvedorFrete {

    private final TipoProvedorFrete PROVEDOR_FRETE = TipoProvedorFrete.JADLOG;

    @Override
    public Frete calcularFrete(double peso, double valor) {

        double valorFrete = (peso > 2000.0) ? 0.07 * valor : 0.045 * valor;
        return new Frete(valorFrete, PROVEDOR_FRETE);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return PROVEDOR_FRETE;
    }
}