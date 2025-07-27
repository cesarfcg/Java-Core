package academy.devdojo.maratonajava.javacore.Hheranca.Domain;

public class Peixe extends Animal {
    private String caracteristica = "barbatanas e caudas";

    public Peixe(String nome, String comprimento, double velocidade, String caracteristica) {
        super(nome, 0, "cinza", comprimento, "Água", velocidade);
        this.caracteristica = caracteristica;
    }
    public void imprime(){
        super.imprime();
        System.out.println(this.caracteristica);

    }
    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
}
