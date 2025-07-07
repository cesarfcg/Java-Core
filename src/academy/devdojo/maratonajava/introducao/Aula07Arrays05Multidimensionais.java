package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays05Multidimensionais {
    public static void main(String[] args) {
        String[][] cursos = {{"a","b","c"},{"B"},{"c"}};
        
        int a = 1;
        
        for(String[] percorredor:cursos){
            System.out.print("Alunos"+a++ +": ");
            for(String x : percorredor){
                
                System.out.println( x);
            }
        }
    }
}
