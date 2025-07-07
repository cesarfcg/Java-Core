package academy.devdojo.maratonajava.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.Eblocosinicializacao.domain.Anime02;

public class AnimeTest02 {
    public static void main(String[] args) {
        Anime02 anime01 = new Anime02("Naruto");
        System.out.println(anime01.getEpisodios());
        System.out.println(anime01.getNome());
    }
}
