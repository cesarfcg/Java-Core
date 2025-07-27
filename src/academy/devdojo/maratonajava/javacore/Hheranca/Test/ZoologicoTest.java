package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.Domain.Mamifero;
import academy.devdojo.maratonajava.javacore.Hheranca.Domain.Peixe;

public class ZoologicoTest {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Peixe-Boi", "90",50,"Forte");
        peixe.imprime();
        System.out.println("------------");
        Mamifero gato = new Mamifero("Gato",4,"verde","90",20,"Leite");
        gato.imprime();
    }
}
