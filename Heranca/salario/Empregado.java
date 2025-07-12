public class Empregado {
    private double salarioFixo;

    public Empregado(double salarioFixo) {
        setSalarioFixo(salarioFixo);
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        return (departamento.alcancouMeta()) ? salarioFixo * 0.1 : 0;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        return salarioFixo + calcularBonus(departamento);
    }
}
