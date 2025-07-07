package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        int num = 1;
        int valorMaximo = 68;
        
        for (num = 1; num < valorMaximo; num++ ){
            if (num >35) {
                break;
            }
            System.out.println(num);
        }
    }
    
}
