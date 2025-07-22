package academy.devdojo.maratonajava.Hheranca.Test;

import academy.devdojo.maratonajava.Hheranca.Domain.Endereco;
import academy.devdojo.maratonajava.Hheranca.Domain.Funcionario;
import academy.devdojo.maratonajava.Hheranca.Domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa();
        endereco.setCep(5946000);
        endereco.setRua("Rua Oscar Marinho");
        pessoa.setCpf("709769464554");
        pessoa.setNome("Lucas");
        pessoa.setEndereco(endereco);
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2600);
        funcionario.setNome("César");
        funcionario.setCpf("70858667589");
        funcionario.setEndereco(endereco);
        funcionario.imprime();


    }
}
