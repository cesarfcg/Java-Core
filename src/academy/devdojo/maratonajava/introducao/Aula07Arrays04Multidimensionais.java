package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays04Multidimensionais {
    public static void main(String[] args) {
        int[][] memorias = new int [2][2];
        memorias[0][0]= 16;
        memorias[0][1]= 32;
        memorias[1][0]= 64;
        memorias[1][1]= 128;

       
        for(int[] percorredor : memorias){
            for(int num:percorredor){
                System.out.println(num);
            }
        }
    }
}
