import java.util.ArrayList;
import java.util.Objects;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList();
    }

    public boolean marcarTarefaFeita(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (identificador == tarefa.getIdentificador()) {
                tarefa.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for (Tarefa tarefa : tarefas) {
            if (Objects.equals(identificador, tarefa.getIdentificador())) {
                tarefa.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }
    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

    public void adicionarTarefa(Tarefa novaTarefa) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == novaTarefa.getIdentificador()) {
                throw new RuntimeException("Tarefa com identificador %d ja existente na lista"
                        .formatted(novaTarefa.getIdentificador()));
            };
        }
        tarefas.add(novaTarefa);
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            String stateChar = (tarefa.isEstahFeita())? "X" : " ";
            System.out.println("[%s]  Id: %d - Descricao: %s"
                    .formatted(stateChar, tarefa.getIdentificador() ,tarefa.getDescricao()));
        }
    }


}
