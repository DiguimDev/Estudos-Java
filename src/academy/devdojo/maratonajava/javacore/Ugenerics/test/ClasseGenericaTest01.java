package academy.devdojo.maratonajava.javacore.Ugenerics.test;

import academy.devdojo.maratonajava.javacore.Ugenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Ugenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponiveis();
        System.out.println("Usando carro por um mês .. ..");
        carroRentavelService.retornarCarroAlugado(carro);
    }
}
