package academy.devdojo.maratonajava.javacore.Ugenerics.test;

import academy.devdojo.maratonajava.javacore.Ugenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Ugenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Ugenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Ugenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Bmw"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Yate"), new Barco("Lancha")));
        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalServiceCarro.buscarObjetoDisponivel();
        System.out.println("Usando o Carro por um mês ");
        rentalServiceCarro.retornarObjetoAlugado(carro);

        System.out.println("------------------------");
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalServiceBarco.buscarObjetoDisponivel();
        System.out.println("Usando o barco por 1 mês");
        rentalServiceBarco.retornarObjetoAlugado(barco);
    }
}
