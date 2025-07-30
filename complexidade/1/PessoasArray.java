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

    // implementar o método de buscaLinear
    public void buscaLinear(String nome){
        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Passando pelo indice:%d".formatted(i));
            if (nomes[i] == nome) {
                encontrado = true;
                System.out.println("O nome pesquisado é %s que está na posição %d".formatted(nome, i));
            }
        }
        if (!encontrado) {
            throw new IllegalArgumentException("O nome %s não se encontra no array de nomes".formatted(nome));
        }
    }
}