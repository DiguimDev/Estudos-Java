package academy.devdojo.maratonajava.javacore.Ugenerics.service;

import academy.devdojo.maratonajava.javacore.Ugenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Yate"), new Barco("Lancha")));

    public Barco buscarBarcoDisponiveis() {
        System.out.println("Buscando barco disponivel .....");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando Barco ... " + barco);
        System.out.println("Carros disponiveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void retornarBarcoAlugado(Barco barco) {
        System.out.println("Devolvendo barco " + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis :");
        System.out.println(barcosDisponiveis);
    }

}
