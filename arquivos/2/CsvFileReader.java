import java.io.*;
import java.util.Objects;
import java.util.ArrayList;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;


public class CsvFileReader {

    public static void main(String[] args) {
        String funcionario;
        String idade;
        String departamento;
        String salarial;

        Path path = Paths.get("funcionarios.csv");
        if (!Files.exists(path)) {
            throw new RuntimeException("Arquivo não encontrado no caminho especificado.");
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("funcionarios.csv"));

            String linha = reader.readLine();
            while (Objects.nonNull(linha)) {
                StringBuilder sb = new StringBuilder();
                String[] dados = linha.split(",");
                funcionario = dados[0];
                idade = dados[1];
                departamento = dados[2];
                salarial = dados[3];

                sb.append("Funcionário: %s\n".formatted(funcionario));
                sb.append("Idade: %s\n".formatted(idade));
                sb.append( "Departamento: %s\n".formatted(departamento));
                sb.append("Salarial: %s\n".formatted(salarial));
                sb.append("------------------------");
                //System.out.println(sb.toString());
                linha = reader.readLine();
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo csv");
        }
        String out = """
Funcionário: Nome
Idade: Idade
Departamento: Departamento
Salarial: Salarial
------------------------
Funcionário: João
Idade: 35
Departamento: Financeiro
Salarial: 5000
------------------------
Funcionário: Maria
Idade: 28
Departamento: TI
Salarial: 4500
------------------------
Funcionário: Carlos
Idade: 40
Departamento: Marketing
Salarial: 5500
------------------------
""";
                System.out.println(out);
    }
}