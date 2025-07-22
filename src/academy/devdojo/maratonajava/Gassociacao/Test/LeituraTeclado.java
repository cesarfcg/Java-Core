package academy.devdojo.maratonajava.Gassociacao.Test;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade ");
        int idade = entrada.nextInt();
        System.out.println("Digite seu sexo (M ou F) ");
        char sexo = entrada.next().charAt(0);
        System.out.println("--------------------------");
        System.out.println(idade+nome+sexo);
    }
}

