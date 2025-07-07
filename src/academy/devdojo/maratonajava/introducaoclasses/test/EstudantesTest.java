package academy.devdojo.maratonajava.introducaoclasses.test;

import academy.devdojo.maratonajava.introducaoclasses.dominio.Estudantes;

public class EstudantesTest {
    public static void main(String[] args) {
        Estudantes estudante1 = new Estudantes();
        Estudantes estudante2 = new Estudantes();
        //primeiro objeto
        estudante1.nome = "César";
        estudante1.genero = 'M';
        estudante1.idade = 17;
        //segundo objeto
        estudante2.nome = "otton";
        estudante2.genero = 'M';
        estudante2.idade = 17;

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.genero);

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.genero);
    }
    
}
