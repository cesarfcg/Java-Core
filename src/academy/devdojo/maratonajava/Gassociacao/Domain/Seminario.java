package academy.devdojo.maratonajava.Gassociacao.Domain;

public class Seminario {
    private String titulo;
    public Aluno[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
