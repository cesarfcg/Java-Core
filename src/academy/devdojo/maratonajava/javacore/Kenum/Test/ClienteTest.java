package academy.devdojo.maratonajava.javacore.Kenum.Test;

import academy.devdojo.maratonajava.javacore.Kenum.Domain.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.Domain.TipoCliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Carlos", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Pedro", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
