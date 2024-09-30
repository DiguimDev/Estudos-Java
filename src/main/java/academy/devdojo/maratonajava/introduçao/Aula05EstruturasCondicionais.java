package academy.devdojo.maratonajava.introduçao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        double salario = 20000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.36 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorDaTaxa = 0;
        if (salario < 34713) {
            valorDaTaxa = salario * primeiraFaixa;
        } else if (salario >= 34713 && salario <= 66507) {
            valorDaTaxa = salario * segundaFaixa;
        } else if (salario > 66507) {
            valorDaTaxa = salario * terceiraFaixa;
        }

        System.out.println(valorDaTaxa);
    }
}

