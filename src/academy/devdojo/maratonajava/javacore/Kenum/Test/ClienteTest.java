package academy.devdojo.maratonajava.javacore.Kenum.Test;

import academy.devdojo.maratonajava.javacore.Kenum.Domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.Domain.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.Domain.TipoPagamento;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA,TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Pedro", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println("Valor com desconto: "+TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println("Valor com desconto: "+TipoPagamento.DEBITO.calcularDesconto(100));
    }
}
