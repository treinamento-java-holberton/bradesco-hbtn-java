import java.util.ArrayList;
import java.util.List;

public class GestaoAlunos {
    List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }


    public void excluirAluno(String nome) {
        alunos.remove(alunos.indexOf(search(nome)));
    }

    public void buscarAluno(String nome) {
        System.out.println(search(nome));
    }

    public void listarAlunos() {
        alunos.stream().forEach(a -> System.out.println(a));
    }

    private Aluno search(String nome) {
        return alunos.stream().filter(i -> nome.equals(i.getNome())).findFirst()
                .orElseThrow(()-> new RuntimeException("Aluno %s não encontrado".formatted(nome)));
    }

    public static void main(String[] args) {
        GestaoAlunos alunos = new GestaoAlunos();
        alunos.adicionarAluno(new Aluno("Joao", 18));
        alunos.adicionarAluno(new Aluno("Maria", 18));
        alunos.adicionarAluno(new Aluno("Jose", 18));

        alunos.listarAlunos();

        alunos.buscarAluno("Joao");

        alunos.excluirAluno("Joao");

        try {
            alunos.excluirAluno("Fulano");
        } catch (java.lang.Exception e) {
            alunos.excluirAluno("Maria");
        }
    }
}
