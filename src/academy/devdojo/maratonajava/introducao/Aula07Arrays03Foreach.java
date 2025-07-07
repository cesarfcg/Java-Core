package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03Foreach {
    public static void main(String[] args) {
      
    String[] nomes = {"Pedro","Bia","César","Gabi","Matheus","Thierry"};
    for(int x = 0;x <nomes.length; x++){
        System.out.println(nomes[x]);
    }
    for(String x : nomes){
        System.out.println(x);
    }
    }
}
