package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        String[] personagens = new String[3];
        personagens[0] = "Naruto";
        personagens[1] = "Neymar";
        personagens[2] = "Maristela";
        for(int x = 0 ; x < personagens.length;x++ ){
            System.out.println(personagens[x]);
        }
    }
}
