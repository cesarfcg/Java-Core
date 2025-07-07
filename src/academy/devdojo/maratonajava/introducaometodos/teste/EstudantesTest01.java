package academy.devdojo.maratonajava.introducaometodos.teste;
import academy.devdojo.maratonajava.introducaometodos.dominio.Estudantes;
import academy.devdojo.maratonajava.introducaometodos.dominio.ImpressoraEstudantes;

public class EstudantesTest01 {
    public static void main(String[] args) {
        
       Estudantes estudante1 = new Estudantes();
        Estudantes estudante2 = new Estudantes();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();
        //primeiro objeto
        estudante1.nome = "João";
        estudante1.genero = 'M';
        estudante1.idade = 19;
        //segundo objeto
        estudante2.nome = "Ilton";
        estudante2.genero = 'M';
        estudante2.idade = 17;

        estudante1.imprimirEstudantes();
        estudante1.imprimirEstudantes();
        
        impressora.imprimir(estudante1);//REFERÊNCIA A OBJETO DE OUTRA CLASSE
    }
    
}


