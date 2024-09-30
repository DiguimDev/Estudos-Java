package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);
    }
}
