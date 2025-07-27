package academy.devdojo.maratonajava.javacore.Hheranca.Domain;

public class Mamifero extends Animal{
    private String alimento;


    public Mamifero(String nome, double pata, String cor, String comprimento, double velocidade, String alimento) {
        super(nome, pata, cor, comprimento, "Terra", velocidade);
        this.alimento = alimento;
    }
    public void imprime(){
        super.imprime();
        System.out.println(this.alimento);
    }
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
