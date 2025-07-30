import java.util.Scanner;
import java.util.Arrays;


public class ArrayExercicio {


    public static void main(String[] args) {
        // Criando o scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);


        // Definindo o tamanho do array
        int tamanhoArray = 10;
        int[] numeros = new int[tamanhoArray];
        int soma = 0;
        int maiorNumero = Integer.MIN_VALUE;


        // Preenchendo o array com números fornecidos pelo usuário


        // Utilize scanner.nextInt(); para receber o numero digitado
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.printf("Digite o número %d: ".formatted(i + 1));
            int input = scanner.nextInt();
            numeros[i] = input;
            soma += input;
            if (input > maiorNumero) {
                maiorNumero = input;
            }
        }
        // Exibindo os resultados
        String[] comoString = Arrays.stream(numeros)
                .mapToObj(String::valueOf).toArray(String[]::new);
        String output = String.join(" ", comoString);

        System.out.println("\n\nConteudo do array:");
        System.out.println(output);
        System.out.println("Soma de todos os números: %d".formatted(soma));
        System.out.println("Maior número no array: %d".formatted(maiorNumero));
        // Fechando o scanner
        scanner.close();
    }
}