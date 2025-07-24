import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileWritingExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicita o nome do arquivo
        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();


        // implemente o codigo aqui

        System.out.println("Digite multiplas linhas de texto. Para sair, digite \"sair\"");

        try {
            BufferedWriter bWriter = new BufferedWriter(new FileWriter(fileName));
            while (true) {
                String linha = scanner.nextLine();
                if (linha.equals("sair")) {
                    break;
                }
                bWriter.append(linha + "\n");
                System.out.println("digite a próxima linha. Para sair, digite \"sair\"");
            }
            System.out.println("Escrevendo dados no arquivo %s".formatted(fileName));
            bWriter.close();
        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo");
        }

        finally {

            scanner.close();
        }
    }
}