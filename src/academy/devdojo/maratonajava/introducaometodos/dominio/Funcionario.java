package academy.devdojo.maratonajava.introducaometodos.dominio;

public class Funcionario {
   
    private String nome;
    private int idade;
    private double []salarios;
    private double media;
    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double[] getSalarios() {
        return salarios;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    public void mediaSalarios(){
        
        for(double x:salarios){
            media =+x;
        }
        media /= salarios.length;
        System.out.println("Média de salários:"+media);
    }
}

    
    