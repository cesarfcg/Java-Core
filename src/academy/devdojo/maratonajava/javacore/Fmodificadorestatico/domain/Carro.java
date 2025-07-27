package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private int velocidadeMaxima;
    public static int velocidadeLimite = 250;

    public Carro(String nome,int velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void imprimir(){
        System.out.println("-------------------------------------------");
        System.out.println("Nome "+ this.nome);
        System.out.println("Velocidade limite: "+Carro.velocidadeLimite);
        System.out.println("Velocidade máxima: "+this.velocidadeMaxima);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeLimite() {
        return velocidadeLimite;
    }
}
