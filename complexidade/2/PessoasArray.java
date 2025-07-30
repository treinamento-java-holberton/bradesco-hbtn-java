import java.lang.IllegalArgumentException;

public class PessoasArray {

    private String[] nomes;

    public PessoasArray() {
        nomes =new String[]{"Amanda", "Beatriz", "Carlos","Daniela","Eduardo",
                "Fabio","Gustavo", "Hingrid","Isabela","Joao","Leise","Maria",
                "Norberto","Otavio","Paulo", "Quirino","Renata","Sabata",
                "Tais","Umberto","Vanessa","Xavier"};
    }

    public String[] getNomes() {
        return nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }
    
    public void buscaBinaria(String nome){
        boolean encontrado = false;
                
        int inicio = 0;
        int fim = nomes.length - 1;

        System.out.println("Procurando o nome: \"%s\"");
        
        while (inicio <= fim) {
            int alvo = (inicio + fim) / 2;
            System.out.println("Passando pelo indice: %d".formatted(alvo));
            if (nome.equals(nomes[alvo])) {
                encontrado = true;
                System.out.println("Nome %s encontrado na posição %d".formatted(nome, alvo));
                break;
            }
            if (nome.compareTo(nomes[alvo]) > 0) {
                inicio = alvo + 1;
            } else if {
                fim = alvo - 1;
            }
        }
        if (!encontrado) {
            throw new IllegalArgumentException("O nome %s não se encontra no array de nomes".formatted(nome));
        }
    }
}