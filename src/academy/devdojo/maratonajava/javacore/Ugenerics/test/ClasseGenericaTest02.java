package academy.devdojo.maratonajava.javacore.Ugenerics.test;

import academy.devdojo.maratonajava.javacore.Ugenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Ugenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Ugenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Ugenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponiveis();
        System.out.println("Usando barco por um mês .. ..");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }
}
