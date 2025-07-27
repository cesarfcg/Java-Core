package academy.devdojo.maratonajava.javacore.Dconstrutores.domain;

public class Anime {
    private String nome;
    private String genero;
    private String tipo;
    private int episodios;

    public Anime(String nome, String genero, String tipo, int episodios){
        this.nome = nome;
        this.genero = genero;
        this.tipo= tipo;
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    
    public void imprimirAnime(){
        System.out.println(nome);
        System.out.println(genero);
        System.out.println(tipo);
        System.out.println(episodios);
    }
}
