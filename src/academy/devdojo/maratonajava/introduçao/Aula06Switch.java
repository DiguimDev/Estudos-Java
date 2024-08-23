package academy.devdojo.maratonajava.introduçao;

public class Aula06Switch {
    public static void main(String[] args) {
        //switch aceita char, int, byte , short , enum , string;
        byte dia = 5;
        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia Útil");
        }
    }
}