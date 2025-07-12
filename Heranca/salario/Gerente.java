public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        double coeficienteBonus = 0.01;
        double bonusExtra = 0;
        if (departamento.alcancouMeta()) {
            double superavitDaMeta =  (departamento.getValorAtingidoMeta() - departamento.getValorMeta());
            bonusExtra = coeficienteBonus * superavitDaMeta;
        }

        return bonusExtra;
    }
}
