import java.util.HashMap;
import java.util.Map;


public class GerenciamentoDeContatos {
    private Map<String, Contato> contatos;


    // Construtor
    public GerenciamentoDeContatos() {
        contatos = new HashMap<>();
    }


    // Adiciona um novo contato
    public void adicionarContato(String nome, String telefone, String email) {
        Contato contato;
        if (contatos.containsKey(nome)) {
            System.out.println("Erro: Contato com nome %s já existe!".formatted(nome));
        } else {
            contato = new Contato();
            contato.adicionarEmail(email);
            contato.adicionarTelefone(telefone);
            contatos.put(nome, contato);
            System.out.println("Contato %s adicionado com sucesso!".formatted(nome));
        }
    }


    // Exibe todos os contatos
    public void exibirContatos() {
        for(String contato:contatos.keySet()) {
            System.out.println("Nome: %s".formatted(contato));
            System.out.println(contatos.get(contato));
            System.out.println("-------------------------------");
        }
    }


    // Busca um contato pelo nome
    public void buscarContato(String nome) {
        if (contatos.containsKey(nome)) {
            System.out.println("Contato encontrado: %s".formatted(nome));
            System.out.println(contatos.get(nome));
        }
    }


    // Remove um contato pelo nome
    public void removerContato(String nome) {
        if (contatos.containsKey(nome)) {
            contatos.remove(nome);
            System.out.println("Contato %s removido com sucesso!".formatted(nome));
        } else {
            System.out.println("Contato %s não encontrado.".formatted(nome));
        }
    }


    public static void main(String[] args) {
        GerenciamentoDeContatos gestao = new GerenciamentoDeContatos();


        // Adicionando contatos
        gestao.adicionarContato("Carlos", "1234-5678", "carlos@email.com");
        gestao.adicionarContato("Maria", "8765-4321", "maria@email.com");
        gestao.adicionarContato("Ana", "1122-3344", "ana@email.com");
        gestao.adicionarContato("Carlos", "1234-5678", "carlos@email.com"); // Tentando duplicar


        // Exibindo todos os contatos
        System.out.println("\nExibindo todos os contatos:");
        gestao.exibirContatos();


        // Buscando um contato
        System.out.println("\nBuscando contato 'Maria':");
        gestao.buscarContato("Maria");


        // Removendo um contato
        System.out.println("\nRemovendo contato 'Carlos':");
        gestao.removerContato("Carlos");


        // Tentando remover um contato inexistente
        System.out.println("\nTentando remover contato 'João' que não existe:");
        gestao.removerContato("João");


        // Exibindo todos os contatos após remoções
        System.out.println("\nExibindo todos os contatos após remoções:");
        gestao.exibirContatos();
    }
}