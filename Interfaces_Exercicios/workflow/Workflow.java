import java.util.List;
import java.util.ArrayList;

import atividades.Atividade;

public class Workflow {
    private List<Atividade> atividades = new ArrayList();
    public void registrarAtividade(Atividade atividade) {
        atividades.add(atividade);
    }

    public void executar() {
        for (Atividade atividade:atividades) {
            atividade.executar();
        }
    }
}