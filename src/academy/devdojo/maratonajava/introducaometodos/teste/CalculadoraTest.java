package academy.devdojo.maratonajava.introducaometodos.teste;
import java.util.Scanner;
import academy.devdojo.maratonajava.introducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();
        
        calculadora.soma(num1,num2);
        calculadora.subtracao(num1,num2);
        calculadora.multiplicacao(num1,num2);
        calculadora.divisao(num1,num2);

        int []numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);


        System.out.println("Multiplicação = "+calculadora.multiplicacao(num1,num2));

        scanner.close();
    }
    
}
