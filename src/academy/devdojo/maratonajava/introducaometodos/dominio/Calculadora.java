package academy.devdojo.maratonajava.introducaometodos.dominio;

public class Calculadora {
    public void soma(int num1 ,int num2){
        System.out.println("Soma = "+(num1+num2));
    
    }
    public void subtracao(int num1 ,int num2){
        System.out.println("Subtracao = "+ (num1 - num2));
    }
    public float multiplicacao(int num1 ,int num2){
        return num1*num2;//guarda o valor mas náo printa na interface.
    }
    public void divisao(double num1 ,double num2){
        if (num2 == 0) {
            System.out.println("Erro: denominador igual a zero.");
            return;//faz a quebra de um código = break.
        }
        
            System.out.println("Divisão = "+num1/num2);
    }
    public void somaArray(int[] array){
        int soma = 0;
        for(int num:array){
            soma += num;
            int fatorial = soma*num;
            if (num == 5) {
                System.out.println("Fatorial de 5: "+ fatorial);
                break;
            }
        }
        
    }
    
}
