package academy.devdojo.maratonajava.javacore.Hheranca.Domain;

public class Animal {
    protected String nome;
    protected double pata;
    protected String cor;
    protected String comprimento;
    protected String ambiente;
    protected double velocidade;

    public Animal(String nome, double pata, String cor, String comprimento, String ambiente, double velocidade) {
        this.nome = nome;
        this.pata = 4;
        this.cor = cor;
        this.comprimento = comprimento;
        this.ambiente = ambiente;
        this.velocidade = velocidade ;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cor);
        System.out.println(this.comprimento);
        System.out.println(this.ambiente);
        System.out.println(this.velocidade + " m/s");
        System.out.println("---------------");
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPata() {
        return pata;
    }

    public void setPata(double patas) {
        this.pata = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getComprimento() {
        return comprimento;
    }

    public void setComprimento(String comprimento) {
        this.comprimento = comprimento;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
