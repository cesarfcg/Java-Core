package academy.devdojo.maratonajava.introducaoclasses.test;
import academy.devdojo.maratonajava.introducaoclasses.dominio.Carros;

public class CarrosTest {
    public static void main(String[] args) {
        Carros carro1 = new Carros();
        Carros carro2 = new Carros();

        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 1999;
     
        carro2.marca = "Honda";
        carro2.modelo = "HRV";
        carro2.ano = 2020;

        System.out.println("Marca: "+carro1.marca+"\nModelo: "+carro1.modelo+"\nAno: "+carro1.ano);
        System.out.println("Marca: "+carro2.marca+"\nModelo: "+carro2.modelo+"\nAno: "+carro2.ano);
    }
    
}
