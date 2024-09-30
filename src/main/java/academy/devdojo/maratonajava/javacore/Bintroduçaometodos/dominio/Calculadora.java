package academy.devdojo.maratonajava.javacore.Bintroduçaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public void subtrairDoisNumero() {
        System.out.println(10 - 6);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0 ;
        }
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do Altera dois numeros");
        System.out.println("num1 "+ num1);
        System.out.println("num2 " + num2);
    }
    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
