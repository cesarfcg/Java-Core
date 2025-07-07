package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //Dado um valor de um carro, descubra em quantas vezes ele pode se parcelado
        //Condição é que: valor da parcela >= 1000
        float valorCarro = 80000;
        for(int parcela = 1; parcela<= valorCarro;parcela++){
            float valorParcela = valorCarro /parcela;
            System.out.println("Parcela de "+parcela + "X R$ "+ valorParcela);
            if (valorParcela <= 1000) {
                break;           
            }   
        }   
    }
}
