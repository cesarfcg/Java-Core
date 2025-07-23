package academy.devdojo.maratonajava.Isobrescrita.Domain;

public class Anime {
    private String nome;

    @Override
    public String toString() {
        return "nome: "+ this.nome;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
