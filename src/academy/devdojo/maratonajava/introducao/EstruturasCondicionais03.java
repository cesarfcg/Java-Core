package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 20000;
        String nao_doar = "Você não pode doar: Saldo insuficiente";
        String pode_doar = "Você pode doar!";
        String resultado = salario > 5000 ? pode_doar : nao_doar;
        System.out.println(resultado);
        // ? para true e : para false (Condição ternária)
    }
    
}
