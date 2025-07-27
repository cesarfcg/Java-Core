package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("Carlos");
        carro.COMPRADOR.setCpf("709.769.464-59");
        System.out.println(carro.COMPRADOR);

    }
}
