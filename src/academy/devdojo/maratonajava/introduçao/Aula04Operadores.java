package academy.devdojo.maratonajava.introduçao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // operador aritmetico + - ? *
        double numero01 = 10;
        double numero02 = 20;
        double resultado = numero01 * numero02;
        System.out.println(resultado);

        // % operador resto
        int resto = 20 % 2;
        System.out.println(resto);

        // < > <=  >= == != operadores condicionais que retornam valores booleano
        boolean comparation = 10 < 20;
        System.out.println(comparation);

        // Operadores Logicos && (AND) || (OR) !
        boolean e = 10 < 20 && 20 > 10;

        int idade = 20;
        double salario = 5621.21;
        boolean isDentroDaLei = idade > 40 || salario > 5000;
        System.out.println(e);
        System.out.println(isDentroDaLei);

        // Operadores de atribuição = += -= *= /=  %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
    }
}
