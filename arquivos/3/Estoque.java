import java.nio.file.*;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Comparator;

public class Estoque {

    private List<Produto> estoque;
    private String caminho;

    public Estoque(String nomeArquivo) {
        this.caminho = nomeArquivo;
        this.estoque = carregarEstoque(carregarCsv(nomeArquivo));
        this.estoque.sort(Comparator.comparingInt(Produto::getId));
    }

    public void atualizarQuantidade(int idAtualizar, int novaQuantidade) {
        Produto produto = findById(idAtualizar);
        produto.setQuantidade(novaQuantidade);
        estoque.set(estoque.indexOf(produto), produto);
        gravarDados();
    }

    public void exibirEstoque() {
        estoque.stream().forEach(i-> System.out.println(i));
    }

    public void excluirProduto(int idExcluir){
        Produto produto = findById(idExcluir);
        estoque.remove(produto);
        gravarDados();
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        int maiorId = estoque.stream().max(Comparator.comparing(Produto::getId)).get().getId();
        int idProduto = maiorId + 1;
        estoque.add(new Produto(idProduto, nome, quantidade, preco));
        gravarDados();
    }

    private Produto findById(int idProduto) {
        return estoque.stream().filter(i -> Objects.equals(i.getId(), idProduto))
        .findFirst().orElseThrow(()-> new RuntimeException("Id de produto não encontrado"));
    }

    private void gravarDados() {
        try {
            Files.write(Paths.get(caminho), estoque.stream().map(i-> i.toCsv()).toList());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    };

    private static List<Produto> carregarEstoque(List<String[]> dadosBrutos) {
        List<Produto> output = new ArrayList<>();
        for(String[] dado:dadosBrutos) {
            int id = Integer.parseInt(dado[0]);
            String nome = dado[1];
            int quantidade = Integer.parseInt(dado[0]);
            double preco = Double.parseDouble(dado[0]);
            Produto produto = new Produto(id, nome, quantidade, preco);
            output.add(produto);
        }
        return output;
    }

    private static List<String[]> carregarCsv(String nomeArquivo) {
        List<String[]> output = new ArrayList<>();
        try {
                Path caminho = Paths.get(nomeArquivo);
                List<String> linhas = Files.readAllLines(caminho);
                linhas.stream().forEach(i -> output.add(i.split(",")));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        return output;
    }
    
}
