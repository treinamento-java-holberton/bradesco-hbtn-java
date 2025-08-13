public class Autor implements Comparable<Autor> {
    String nome;
    String sobrenome;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "%s %s".formatted(nome, sobrenome);
    }

    @Override
    public int compareTo(Autor outroObjeto) {
        if (nome.compareTo(outroObjeto.getNome()) == 0 &&  sobrenome.compareTo(outroObjeto.getSobrenome()) == 0) {
            return 0;
        } else if (nome.compareTo(outroObjeto.getNome()) > 0 ||  sobrenome.compareTo(outroObjeto.getSobrenome()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}