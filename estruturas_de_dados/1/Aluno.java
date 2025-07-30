public class Aluno {
    String nome;
    int idade;

    public Aluno(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "nome: %s, idade: %d".formatted(this.nome, this. idade);
    }
}