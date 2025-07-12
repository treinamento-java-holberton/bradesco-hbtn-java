public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        setSaudeAtual(saudeAtual);
        setNome(nome);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        return status;
    }

    public void setSaudeAtual(int saudeAtual) {
        status = (saudeAtual == 0) ? Estado.MORTO.getDescricao() : Estado.VIVO.getDescricao();
        this.saudeAtual = saudeAtual;
    }

    public void setNome(String nome) {
        if( nome != null && nome != "") {
            this.nome = nome;
        }
    }

    public void tomarDano(int quantidadeDeDano) {
        int resultante;
        resultante = (saudeAtual - quantidadeDeDano < 0) ? 0 : saudeAtual - quantidadeDeDano;
        this.setSaudeAtual(resultante);
    }

    public void receberCura(int quantidadeDeCura) {
        int resultante;
        resultante = (saudeAtual + quantidadeDeCura > 100) ? 100 : saudeAtual + quantidadeDeCura;
        this.setSaudeAtual(resultante);
    }

    private enum Estado {
        VIVO("vivo"),
        MORTO("morto");
        private final String descricao;

        // Construtor
        Estado(String descricao) {
            this.descricao = descricao;
        }

        // Getter
        public String getDescricao() {
            return descricao;
        }
    }


}
