import java.util.Locale;

public class Pessoa {

    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.cargo = cargo;
        this.codigo = codigo;
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return String.format(Locale.forLanguageTag("pt-BR"), "[%d] %s %s %d R$ %f", codigo, nome, cargo, idade, salario);
    }


}