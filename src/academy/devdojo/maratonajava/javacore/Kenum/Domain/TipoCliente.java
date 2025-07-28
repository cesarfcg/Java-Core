package academy.devdojo.maratonajava.javacore.Kenum.Domain;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa física"),
    PESSOA_JURIDICA(2,"Pessoa jurídica");
    private final int valor;
    private final String relatorio;
    TipoCliente(int valor, String relatorio) {
        this.valor = valor;
        this.relatorio = relatorio;
    }

    public int getValor() {
        return valor;
    }

    public String getRelatorio() {
        return relatorio;
    }
}
