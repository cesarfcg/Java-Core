package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao01ex {
    public static void main(String[] args) {
        // números pares de 1 a 10000
        int pares = 0;
        while (pares<10000) {
            pares += 2;
            System.out.println(pares);
            
        }
        for (pares = 0;pares<10000;pares+=2){
            System.out.println(pares);

        }
    }
    
}
