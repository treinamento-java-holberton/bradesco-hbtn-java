import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;
import java.util.Random;


public class ProcessamentoDePagamentos {


    // Logger SLF4j
    private static final Logger logger = LoggerFactory.getLogger(ProcessamentoDePagamentos.class);

    private enum State {
        SUCESSO, PENDENTE, ERRO;
    }

    public static void main(String[] args) throws InterruptedException {

        for (int i = 1; i <= 5; i++) {
            logger.info("Iniciando processamento do pagamento {}", i);
            switch (getState()) {
                case SUCESSO -> logger.info("Pagamento {} processado com sucesso.", i);
                case PENDENTE -> logger.warn("Pagamento {} está pendente. Aguardando confirmação.", i);
                case ERRO ->  logger.error("Erro ao processar o pagamento {}: Falha na transação.", i);
                default -> logger.error("Estado não disponível.");
            }
            Thread.sleep(1);
        }
    }

    private static State getState() {
        List<State> states = List.of(State.SUCESSO, State.PENDENTE, State.ERRO);
        Random random = new Random();
        int selector = random.nextInt( 100) % 3;
        return states.get(selector);
    }
}