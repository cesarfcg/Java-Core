package academy.devdojo.maratonajava.javacore.Hheranca.Test;

import academy.devdojo.maratonajava.javacore.Hheranca.Domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.Domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.Domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        Pessoa pessoa = new Pessoa("José");
        endereco.setCep(5946000);
        endereco.setRua("Rua Oscar Marinho");
        pessoa.setCpf("709769464554");
        pessoa.setNome("Lucas");
        pessoa.setEndereco(endereco);
        Funcionario funcionario = new Funcionario("José");
        funcionario.setSalario(2600);
        funcionario.setNome("César");
        funcionario.setCpf("70858667589");
        funcionario.setEndereco(endereco);
        funcionario.imprime();
        funcionario.relatorioSalarial();

    }
}
