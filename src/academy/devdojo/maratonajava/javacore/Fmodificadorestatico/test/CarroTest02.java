package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Audi",300);
        Carro carro2 = new Carro("Mercedes",289);
        Carro carro3 = new Carro("BMW",260);
        //carro1.setVelocidadeLimite(180); MODIFICA APENAS a velocidadeLimite NO OBJETO. PARA ISSO, USA-SE O MODIFICDOR ESTÁTICO.
        Carro.velocidadeLimite = 180; //Agora está show. Muda-se o atributo da classe e não de um objeto.
        carro1.imprimir();
        carro2.imprimir();
        carro3.imprimir();
    }
}
