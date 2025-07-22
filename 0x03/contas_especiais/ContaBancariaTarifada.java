import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

    private int quantidadeTransacoes = 0;

    private double tarifa = 0.1;

    
    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
       super.depositar(valor);
       saldo = saldo - tarifa;
    }
    
    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
        super.sacar(valor);
        saldo = saldo - tarifa;
    }

    public int getQuantidadeTransacoes() {
        return this.quantidadeTransacoes;
    }

}
