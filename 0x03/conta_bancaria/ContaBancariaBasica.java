import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.saldo = 0;
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual / 100.0;
    }
    
    public String getNumeracao() {
        return this.numeracao;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if(valor <=0) {
            throw new OperacaoInvalidaException("Valor de deposito deve ser maior que 0");
        }
        saldo = saldo + valor;
    }
    
    public void sacar(double valor) throws OperacaoInvalidaException {
        if(valor <=0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if(saldo < valor) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        saldo = saldo - valor;
    }

    private double calcularTarifaMensal() {
        double tarifaPercentual = saldo * 0.1;
        double tarifaMensal = (tarifaPercentual < 10.0) ? tarifaPercentual : 10.0;
        return tarifaMensal;
       
    }

    private double calcularJurosMensal() {
        if (saldo < 0.0) {
            return 0.0;
        }
        double txJurosMensal = taxaJurosAnual / 12.0;
        double jurosMensal = txJurosMensal * saldo;
        return jurosMensal;
    }

    public void aplicarAtualizacaoMensal() {
        double saldoPosTarifa = saldo - calcularTarifaMensal();
        double jurosMensal = calcularJurosMensal();
        saldo = saldoPosTarifa + jurosMensal;
    }

}
