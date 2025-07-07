package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        int idade = 50;
        String categoria = "";
        //&& para "and" e or para "or"
        if(idade <18){
            categoria = "juvenil";
        }
        else if(idade>18 && idade < 30){
            categoria = "adulto";
        }
        else{
            categoria = "velho";
        }
        System.out.println(categoria);
    }
}
    
    

