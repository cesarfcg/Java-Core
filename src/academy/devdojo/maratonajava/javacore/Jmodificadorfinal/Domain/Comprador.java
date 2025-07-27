package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.Domain;

public class Comprador {
    private String nome;
    private String cpf;

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
