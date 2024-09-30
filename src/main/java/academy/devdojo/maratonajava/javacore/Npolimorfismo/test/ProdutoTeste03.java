package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.serviço.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9",3000);

        Tomate tomate = new Tomate("Ceciliano",20);
        tomate.setDataValidade("16/11/2027");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.printf("______________________");
        CalculadoraImposto.calcularImposto(produto);
    }
}
