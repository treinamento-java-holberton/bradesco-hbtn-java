import java.util.*;

public class Pessoa implements Comparable<Pessoa> {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;
    private List<String> hobbies;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario, List<String> hobbies) {
        this.cargo = cargo;
        this.codigo = codigo;
        this.idade = idade;
        this.nome = nome;
        this.salario = salario;
        this.hobbies = hobbies;
    }

    public List<String> getHobbies() {
        return hobbies;
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

    @Override
    public int compareTo(Pessoa pessoa) {
        return Comparator.comparing(Pessoa::getCargo).thenComparing(Pessoa::getNome).compare(this, pessoa);
    }
}