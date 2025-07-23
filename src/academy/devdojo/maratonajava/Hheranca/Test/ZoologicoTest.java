package academy.devdojo.maratonajava.Hheranca.Test;

import academy.devdojo.maratonajava.Hheranca.Domain.Animal;
import academy.devdojo.maratonajava.Hheranca.Domain.Mamifero;
import academy.devdojo.maratonajava.Hheranca.Domain.Peixe;

public class ZoologicoTest {
    public static void main(String[] args) {
        Peixe peixe = new Peixe("Peixe-Boi", "90",50,"Forte");
        peixe.imprime();
        System.out.println("------------");
        Mamifero gato = new Mamifero("Gato",4,"verde","90",20,"Leite");
        gato.imprime();
    }
}
