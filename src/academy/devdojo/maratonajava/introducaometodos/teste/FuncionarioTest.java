package academy.devdojo.maratonajava.introducaometodos.teste;

import academy.devdojo.maratonajava.introducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario fun1 =new Funcionario();
        Funcionario fun2 =new Funcionario();
        Funcionario fun3 =new Funcionario();

        fun1.setNome("douglas");
        fun1.setIdade(19);
        fun1.setSalarios(new double[]{1772,500});

        fun2.setNome("Roger");
        fun2.setIdade(19);
        fun2.setSalarios(new double[]{1689,500});

        fun3.setNome("Pedro");
        fun3.setIdade(19);
        fun3.setSalarios(new double[]{1550,500});
        
    }
}
