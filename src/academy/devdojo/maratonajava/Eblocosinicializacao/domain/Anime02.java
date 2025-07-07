package academy.devdojo.maratonajava.Eblocosinicializacao.domain;

public class Anime02 {
    private String nome;
    private int[] episodios;

    //Alocado em memória pro objeto.
    //Os atributos das classes são inicializados por default ou peo que for passado.
    //Depois inicializa o bloco de inicialização.
    //Depois começa a inicializar os contrutores.
    {
        episodios = new int[100];
        for(int i=0;i< episodios.length; i++){
            episodios[i] = i+1;
        }
        for (int epi :episodios){
            System.out.print(epi +" ");
        }
    }
    public Anime02(String nome) {
        this.nome = nome;

    }

    public Anime02() {
        episodios = new int[100];
        for(int i=0;i< episodios.length; i++){
            episodios[i] = i+1;
        }
        for (int epi :episodios){
            System.out.print(epi +" ");
        }
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public String getNome() {
        return nome;
    }
}
