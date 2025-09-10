import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class VerificacaoLogin {


    // Inicialização do logger
    private static final Logger logger = LoggerFactory.getLogger(VerificacaoLogin.class);


    public static void main(String[] args) {
        // Simulação de entradas do usuário
        String usuarioCorreto = "admin";
        String senhaCorreta = "12345";


        // Tentativas de login
        realizarLogin("admin", "12345", usuarioCorreto, senhaCorreta); // Login correto
        realizarLogin("admin", "senhaErrada", usuarioCorreto, senhaCorreta); // Senha incorreta
        realizarLogin("usuarioDesconhecido", "12345", usuarioCorreto, senhaCorreta); // Usuário desconhecido
    }


    public static void realizarLogin(String usuario, String senha, String usuarioCorreto, String senhaCorreta) {
        // implemente aqui o log
        logger.info("Tentativa de login com o usuário: {}", usuario);
        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            logger.info("Login bem-sucedido para o usuário: {}", usuario);
        } else if (!usuario.equals(usuarioCorreto)) {
            logger.info("Usuário {} não encontrado!", usuario);
        } else {
            logger.info("Senha incorreta para o usuário: {}", usuarioCorreto);
        }
    }
}