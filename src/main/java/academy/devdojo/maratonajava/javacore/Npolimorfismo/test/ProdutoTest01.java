package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ideapad Lenovo", 2910.01);
        Tomate tomate = new Tomate("Mastumati",30);
        Televisao televisao = new Televisao("Samsung 98pol",55000.99);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("_________________________");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
