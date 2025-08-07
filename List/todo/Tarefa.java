import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int identificador) {
        modificarDescircao(descricao);
        this.estahFeita = false;
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public void modificarDescircao(String texto) {
        if (Objects.isNull(texto) || texto.isEmpty()) {
            throw new RuntimeException("Descricao de tarefa invalida");
        }
        descricao = texto;
    }
}