import java.util.List;
import java.util.ArrayList;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais = new ArrayList();

    public void registrarCanal(CanalNotificacao canalNotificacao) {
        canais.add(canalNotificacao);
    }
    public void processar(Video video) {
        for (CanalNotificacao canal:canais) {
            var textoMensagem = String.format("%s - %s", video.getArquivo(), video.getFormatoVideo());
            var mensagem = new Mensagem(textoMensagem,TipoMensagem.LOG);
            canal.notificar(mensagem);
        }
    }
}