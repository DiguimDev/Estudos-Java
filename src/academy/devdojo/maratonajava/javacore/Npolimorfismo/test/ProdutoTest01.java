package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ideapad Lenovo", 2910.01);
        Tomate tomate = new Tomate("Mastumati",30);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("_________________________");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
