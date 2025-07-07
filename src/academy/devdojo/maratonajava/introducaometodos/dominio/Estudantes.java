package academy.devdojo.maratonajava.introducaometodos.dominio;

public class Estudantes {
    public String nome;
    public int idade;
    public char genero;
    
    public void imprimirEstudantes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Gênero: "+this.genero);
    }
   

}
