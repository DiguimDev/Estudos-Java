package academy.devdojo.maratonajava.javacore.Gassociação.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner pergunta = new Scanner(System.in);
        System.out.println("Software de previsao");
        System.out.println("Digite sua pergunta");
        String perguntas = pergunta.nextLine();
        if(perguntas.charAt(0) == ' '){
            System.out.println("Sim");
        }else {
            System.out.println("Nao");
        }
    }
}
