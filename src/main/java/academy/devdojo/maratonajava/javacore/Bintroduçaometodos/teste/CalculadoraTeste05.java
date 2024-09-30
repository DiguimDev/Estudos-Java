package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 6, 7};
        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);
        calculadora.somaArray(numeros);
    }
}
