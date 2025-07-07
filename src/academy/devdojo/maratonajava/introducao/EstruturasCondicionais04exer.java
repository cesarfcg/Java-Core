package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais04exer {
    public static void main(String[] args) {
        //0 - 34,712 = 9,7%
        //34,713 - 65,507 = 37,35%
        //65,507 = 49,50%
        double salario = 100000;
        double primeiraTaxa = 9.7/100;
        double segundaTaxa  = 37.35 / 100;
        double terceiraTaxa = 49.50/100;
        double resultadoTaxa;
        if(salario <= 34712){
            resultadoTaxa = salario * primeiraTaxa;}

        else if(salario >= 34713 && salario <=68507){
            resultadoTaxa = salario * segundaTaxa;}

        else{
            resultadoTaxa = salario * terceiraTaxa;
        }
        System.out.println("Eu pago de imposto ao ano: R$"+resultadoTaxa+" Quanzas");

    }
    
}
