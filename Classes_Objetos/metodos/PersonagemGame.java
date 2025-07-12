public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDano) {
        saudeAtual = (saudeAtual - quantidadeDano < 0) ? 0 : saudeAtual - quantidadeDano;
    }

    public void receberCura(int quantidadeDeCura) {
        saudeAtual = (saudeAtual + quantidadeDeCura > 100) ? 100 : saudeAtual + quantidadeDeCura;
    }

}
