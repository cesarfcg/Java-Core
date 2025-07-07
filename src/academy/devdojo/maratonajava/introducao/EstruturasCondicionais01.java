package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        boolean isMaiorQuerOutro = x > y;
        if(x<y){
            System.out.println(x+ " maior que " +y);
        }
        if(!isMaiorQuerOutro){
            System.out.println(x+ " menor que " +y);
        }
    }   
}