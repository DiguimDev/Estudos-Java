package academy.devdojo.maratonajava.javacore.Ugenerics.service;

import academy.devdojo.maratonajava.javacore.Ugenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {


    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Bmw"), new Carro("Mercedes")));

    public Carro buscarCarroDisponiveis() {
        System.out.println("Buscando carro disponivel .....");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando Carro ... " + carro);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro) {
        System.out.println("Devolvendo carro " + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis :");
        System.out.println(carrosDisponiveis);
    }

}
